/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportManagement;

import initialPages.AdminPage;
import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author SUHA
 */
public final class ReportManagementPage extends javax.swing.JFrame {
    
    Hashtable<String, String> doctDict;
    Hashtable<String, String> doctStatDict;
    Hashtable<String, String> monthDict;
    
    public ReportManagementPage() {
        initComponents();
        doctDict = new Hashtable<String, String>();
        doctStatDict = new Hashtable<String, String>();
        monthDict = new Hashtable<String, String>();
        getTablesReady(doctorsPatientCountTbl, jScrollPane1);
        getTablesReady(doctorsStatusTbl, jScrollPane2);
        getTablesReady(monthlyPatientStatusTbl, jScrollPane3);
        patientsCountReport();
        doctorStatusReport();
    }
    
//    Custom Methods
    public void getTablesReady(javax.swing.JTable jTbl, javax.swing.JScrollPane jScrollPan){
        DefaultTableCellRenderer tblModelCell = new DefaultTableCellRenderer();
        tblModelCell.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < jTbl.getColumnCount(); i++) {
            jTbl.getColumnModel().getColumn(i).setCellRenderer(tblModelCell);
        }
//        Table Header
        JTableHeader utblModelHeader = jTbl.getTableHeader();
        utblModelHeader.setBackground(new Color(0,0,0,99));
        utblModelHeader.setForeground(new Color(255,255,245));
        utblModelHeader.setFont(new Font("Georgia", Font.ITALIC, 16));
        utblModelHeader.getTable().setBorder(BorderFactory.createEmptyBorder());
        
//        Table Generic Style
        jTbl.setRowHeight(23);
        
//        table transpaprency
        jScrollPan.setBackground(new Color(0,0,0,80));
        jScrollPan.getViewport().setOpaque(false);
        jScrollPan.setBorder(BorderFactory.createEmptyBorder());
    }
    
    public Hashtable<String, String> increaseCount(Hashtable<String, String> dict, String key){
        int dt = Integer.parseInt(dict.get(key));
        dt++;
        dict.put(key, ""+dt);
        System.out.println(key+"\t"+dt);
        return dict;
    }
    
    public void patientsCountReport(){
        BufferedReader br = null;
        
        try {
            File rf = new File("AppointmentsData.txt");
            if(!rf.exists())
                rf.createNewFile();
            
            br = new BufferedReader(new FileReader(rf));
            Object[] lines = br.lines().toArray();
            for (Object line : lines) {
                String[] linerow = line.toString().trim().split(",");
                if (doctDict.keySet().contains(linerow[2]))
                    doctDict = increaseCount(doctDict, linerow[2]);
                else
                    doctDict.put(linerow[2], "1");
                
                if (monthDict.keySet().contains(linerow[3].substring(5, 7)))
                    monthDict = increaseCount(monthDict, linerow[3].substring(5, 7));
                else
                    monthDict.put(linerow[3].substring(5, 7), "1");
            }
            br.close();
        } catch (IOException ex) {
            try {
                br.close();
            } catch (IOException ex1) {
                JOptionPane.showMessageDialog(this, "Some Technical Error Occured");
            }
            JOptionPane.showMessageDialog(this, "Some Technical Error Occured");
            return;
        }
        
        DefaultTableModel docPatModel = (DefaultTableModel) doctorsPatientCountTbl.getModel();
        doctDict.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .forEach(key -> {
                    docPatModel.insertRow(0, new String[]{key.getKey(), key.getValue()});
        });
        DefaultTableModel monthPatModel = (DefaultTableModel) monthlyPatientStatusTbl.getModel();
        monthDict.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .forEach(key -> {
                    monthPatModel.addRow(new String[]{key.getKey(), key.getValue()});
        });
    }

    public void doctorStatusReport(){
        BufferedReader br = null;
        DefaultTableModel docStatModel = (DefaultTableModel) doctorsStatusTbl.getModel();
        try {
            File rf = new File("DoctorsSatusData.txt");
            if(!rf.exists())
                rf.createNewFile();
            
            br = new BufferedReader(new FileReader(rf));
            Object[] lines = br.lines().toArray();
            for (Object line : lines) {
                String[] linerow = line.toString().trim().split(",");
                doctStatDict.put(linerow[1], linerow[2]);
//                docStatModel.addRow(new String[]{linerow[1], linerow[2]});
            }
            br.close();
        } catch (IOException ex) {
            try {
                br.close();
            } catch (IOException ex1) {
                JOptionPane.showMessageDialog(this, "Some Technical Error Occured");
            }
            JOptionPane.showMessageDialog(this, "Some Technical Error Occured");
            return;
        }
        
        doctStatDict.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .forEach(key -> {
                    docStatModel.addRow(new String[]{key.getKey(), key.getValue()});
        });
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        doctorsPatientCountTbl = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        monthlyPatientStatusTbl = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        doctorsStatusTbl = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        backButtonLbl = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 250));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Doctor's Apppointment Status");
        jLabel2.setMaximumSize(new java.awt.Dimension(320, 18));
        jLabel2.setMinimumSize(new java.awt.Dimension(320, 18));
        jLabel2.setPreferredSize(new java.awt.Dimension(320, 18));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 95, -1, -1));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(320, 250));

        doctorsPatientCountTbl.setBackground(new java.awt.Color(0, 10, 40));
        doctorsPatientCountTbl.setFont(new java.awt.Font("Georgia", 2, 15)); // NOI18N
        doctorsPatientCountTbl.setForeground(new java.awt.Color(254, 254, 254));
        doctorsPatientCountTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor Name", "Appoint. Count"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(doctorsPatientCountTbl);
        if (doctorsPatientCountTbl.getColumnModel().getColumnCount() > 0) {
            doctorsPatientCountTbl.getColumnModel().getColumn(1).setMinWidth(120);
            doctorsPatientCountTbl.getColumnModel().getColumn(1).setPreferredWidth(120);
            doctorsPatientCountTbl.getColumnModel().getColumn(1).setMaxWidth(120);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 250));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Monthly Patient Status");
        jLabel4.setMaximumSize(new java.awt.Dimension(320, 18));
        jLabel4.setMinimumSize(new java.awt.Dimension(320, 18));
        jLabel4.setPreferredSize(new java.awt.Dimension(320, 18));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(715, 95, -1, -1));

        jScrollPane2.setMaximumSize(new java.awt.Dimension(350, 250));
        jScrollPane2.setMinimumSize(new java.awt.Dimension(350, 250));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(350, 250));

        monthlyPatientStatusTbl.setBackground(new java.awt.Color(0, 10, 40));
        monthlyPatientStatusTbl.setFont(new java.awt.Font("Georgia", 2, 15)); // NOI18N
        monthlyPatientStatusTbl.setForeground(new java.awt.Color(254, 254, 254));
        monthlyPatientStatusTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Month", "Patient Count"
            }
        ));
        monthlyPatientStatusTbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(monthlyPatientStatusTbl);
        if (monthlyPatientStatusTbl.getColumnModel().getColumnCount() > 0) {
            monthlyPatientStatusTbl.getColumnModel().getColumn(1).setMinWidth(150);
            monthlyPatientStatusTbl.getColumnModel().getColumn(1).setPreferredWidth(150);
            monthlyPatientStatusTbl.getColumnModel().getColumn(1).setMaxWidth(150);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Georgia", 0, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 250));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Active Doctor Status");
        jLabel5.setMaximumSize(new java.awt.Dimension(320, 18));
        jLabel5.setMinimumSize(new java.awt.Dimension(320, 18));
        jLabel5.setPreferredSize(new java.awt.Dimension(320, 18));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 395, -1, -1));

        jScrollPane3.setMaximumSize(new java.awt.Dimension(350, 250));
        jScrollPane3.setMinimumSize(new java.awt.Dimension(350, 250));
        jScrollPane3.setPreferredSize(new java.awt.Dimension(350, 250));

        doctorsStatusTbl.setBackground(new java.awt.Color(0, 10, 40));
        doctorsStatusTbl.setFont(new java.awt.Font("Georgia", 2, 15)); // NOI18N
        doctorsStatusTbl.setForeground(new java.awt.Color(254, 254, 254));
        doctorsStatusTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctors Name", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(doctorsStatusTbl);
        if (doctorsStatusTbl.getColumnModel().getColumnCount() > 0) {
            doctorsStatusTbl.getColumnModel().getColumn(1).setMinWidth(150);
            doctorsStatusTbl.getColumnModel().getColumn(1).setPreferredWidth(150);
            doctorsStatusTbl.getColumnModel().getColumn(1).setMaxWidth(150);
        }

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lobster Two", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(246, 246, 226));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("APU Medical Center Reports");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 25, 690, 50));

        jPanel1.setBackground(new java.awt.Color(0,0,0,8));
        jPanel1.setMaximumSize(new java.awt.Dimension(1200, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1200, 720));

        backButtonLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backButtonLbl.setText("Back");
        backButtonLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonLblMouseClicked(evt);
            }
        });
        backButtonLbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonLblActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(backButtonLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1112, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(backButtonLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(666, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 720));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_images/management.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, -2, 1200, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonLblMouseClicked
        AdminPage admPage= new AdminPage();
        admPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonLblMouseClicked

    private void backButtonLblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonLblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonLblActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReportManagementPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportManagementPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportManagementPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportManagementPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportManagementPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButtonLbl;
    private javax.swing.JTable doctorsPatientCountTbl;
    private javax.swing.JTable doctorsStatusTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable monthlyPatientStatusTbl;
    // End of variables declaration//GEN-END:variables
}
