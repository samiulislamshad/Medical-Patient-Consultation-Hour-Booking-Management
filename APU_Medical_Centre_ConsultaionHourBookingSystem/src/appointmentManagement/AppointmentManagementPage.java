/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appointmentManagement;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import initialPages.AdminPage;

/**
 *
 * @author SUHA
 */
public final class AppointmentManagementPage extends javax.swing.JFrame {

    private String index;
    public Vector allData, dumpData;

    /**
     * Creates new form AppointmentManagementPage
     */
    public AppointmentManagementPage() {
        initComponents();
        allData = new Vector();
        dumpData = new Vector();
        showAppointments();
    }
    
//    My Custom methods
    private boolean writeDump(){
        FileWriter fw = null;
        try {
            File rf = new File("DumpAppointmentsData.txt");
            if(!rf.exists()){
                rf.createNewFile();
                System.out.println("'DumpAppointmentsData.txt' file created.");
            }
            fw = new FileWriter(rf);
            for (int i = 0; i < this.dumpData.size(); i++) {
                fw.append(this.dumpData.get(i).toString()+"\n");
            }
            return true;
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Problem occured in accessing authentication file.");
            return false;
        }finally{
            try {
                fw.flush();
                fw.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Problem occured in accessing authentication file.");
            }
        }
    }
    
    private boolean writeFile(){
        FileWriter fw = null;
        try {
            File rf = new File("AppointmentsData.txt");
            if(!rf.exists()){
                rf.createNewFile();
                System.out.println("'AppointmentsData.txt' file created.");
            }
            fw = new FileWriter(rf);
            for (int i = 0; i < this.allData.size(); i++) {
                fw.append(this.allData.get(i).toString()+"\n");
            }
            return true;
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Problem occured in accessing authentication file.");
            return false;
        }finally{
            try {
                fw.flush();
                fw.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Problem occured in accessing authentication file.");
            }
        }
    }
    
    private boolean readAndEditArray(){
        BufferedReader br = null;
        BufferedReader dbr = null;
        int counter = 0;
        try {
            File rf = new File("AppointmentsData.txt");
            File drf = new File("DumpAppointmentsData.txt");
            if(!rf.exists())
                rf.createNewFile();
            
            br = new BufferedReader(new FileReader(rf));
            dbr = new BufferedReader(new FileReader(drf));
            Object[] lines = br.lines().toArray();
            Object[] dlines = dbr.lines().toArray();
            
            for(int i=1; i <= lines.length; i++){
                String[] linerow = lines[i-1].toString().trim().split(",");
                if (!linerow[0].equals(this.index)){
                    counter ++;
                    this.allData.add(counter+","+linerow[1]+","+linerow[2]+","+linerow[3]+","+linerow[4]);
                }
                else
                    this.dumpData.add(1+","+linerow[1]+","+linerow[2]+","+linerow[3]+","+linerow[4]);
            }
            for(int i=1; i <= dlines.length; i++){
                String[] dlinerow = dlines[i-1].toString().trim().split(",");
                this.dumpData.add((i+1)+","+dlinerow[1]+","+dlinerow[2]+","+dlinerow[3]+","+dlinerow[4]);
            }
            
            br.close();
            dbr.close();
            if (writeFile()) {
                return writeDump();
            } else {
                return false;
            }
        } catch (IOException ex) {
            try {
                br.close();
                dbr.close();
                return false;
            } catch (IOException ex1) {
                JOptionPane.showMessageDialog(this, "Authentication Discarded. Technical Error");
            }
            JOptionPane.showMessageDialog(this, "Authentication Discarded. Technical Error");
        }
        return false;
    }
    
    
    public void showAppointments(){
//        Cell Allignment
        DefaultTableCellRenderer utblModelCell = new DefaultTableCellRenderer();
        utblModelCell.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < appointTbl.getColumnCount(); i++) {
            appointTbl.getColumnModel().getColumn(i).setCellRenderer(utblModelCell);
        }
////        Table Header
        JTableHeader utblModelHeader = appointTbl.getTableHeader();
        utblModelHeader.setBackground(new Color(0,0,0,99));
        utblModelHeader.setForeground(new Color(255,255,245));
        utblModelHeader.setFont(new Font("Georgia", Font.ITALIC, 20));
        utblModelHeader.getTable().setBorder(BorderFactory.createEmptyBorder());
        
//        Table Generic Font
//        userTbl.setFont(new Font("Georgia", Font.ITALIC, 16));
        appointTbl.setRowHeight(30);
        
//        table transpaprency
        jScrollPane1.setBackground(new Color(0,0,0,80));
        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane1.setBorder(BorderFactory.createEmptyBorder());

        
//        Insert Text to the table
        DefaultTableModel utblModel = (DefaultTableModel) appointTbl.getModel();
        BufferedReader br = null;
        utblModel.setRowCount(0);
        try {
            File rf = new File("AppointmentsData.txt");
            if(!rf.exists()){
                rf.createNewFile();
                System.out.println("'AppointmentsData.txt' file created.");
            }
            br = new BufferedReader(new FileReader(rf));
            Object[] lines = br.lines().toArray();
            for(int i=0; i < lines.length; i++){
                String[] linerow = lines[i].toString().trim().split(",");
//                adding data
                Vector newrow = new Vector();
                
                for (int j = 0; j < linerow.length/*newrow.length*/; j++) {
                    newrow.add(linerow[j]);
                }
                utblModel.addRow(newrow);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Fenching Data Failed!");
        }finally{
            try {
                br.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Fenching Data Failed!");
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addBtn = new javax.swing.JLabel();
        editBtn = new javax.swing.JLabel();
        removeBtn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        backButtonLbl = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        appointTbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Appointment Management");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_icon/btnAU_200.png"))); // NOI18N
        addBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBtnMouseClicked(evt);
            }
        });
        getContentPane().add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 620, -1, -1));

        editBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_icon/btnEU_200.png"))); // NOI18N
        editBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editBtnMouseClicked(evt);
            }
        });
        getContentPane().add(editBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 620, -1, -1));

        removeBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        removeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_icon/btnRU_200.png"))); // NOI18N
        removeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeBtnMouseClicked(evt);
            }
        });
        getContentPane().add(removeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 620, -1, -1));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(246, 246, 226));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("APU Medical Center Appointments");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 690, 50));

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

        jScrollPane1.setBackground(new java.awt.Color(247, 246, 247, 0));

        appointTbl.setBackground(new java.awt.Color(0, 10, 40));
        appointTbl.setFont(new java.awt.Font("Georgia", 3, 16)); // NOI18N
        appointTbl.setForeground(new java.awt.Color(254, 254, 254));
        appointTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Index", "Patient", "Doctor", "Date", "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        appointTbl.setToolTipText("");
        appointTbl.setFocusable(false);
        appointTbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(appointTbl);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1035, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(backButtonLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(backButtonLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 720));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_images/management.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, -2, 1200, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseClicked
        // TODO add your handling code here:
        AddAppointmentForm aaf = new AddAppointmentForm(this, true);
        aaf.setVisible(true);
    }//GEN-LAST:event_addBtnMouseClicked

    private void editBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBtnMouseClicked
        // TODO add your handling code here:
//        EditAppointmentForm eaf = EditAppointmentForm(this, true, index, patient, doctor, date, time);
        DefaultTableModel utblModel = (DefaultTableModel) appointTbl.getModel();
        if(!appointTbl.getSelectionModel().isSelectionEmpty()){
            Vector selectedData = (Vector) utblModel.getDataVector().elementAt(appointTbl.getSelectedRow());
            EditAppointmentForm eaf = new EditAppointmentForm(this, true, selectedData.get(0).toString(),selectedData.get(1).toString(),selectedData.get(2).toString(),
                    selectedData.get(3).toString(),selectedData.get(4).toString());
            eaf.setVisible(true);
        }
        else
            JOptionPane.showMessageDialog(this, "Select a row first!!");
    }//GEN-LAST:event_editBtnMouseClicked

    private void removeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeBtnMouseClicked
        // TODO add your handling code here:
        DefaultTableModel atblModel = (DefaultTableModel) appointTbl.getModel();
        if(!appointTbl.getSelectionModel().isSelectionEmpty()){
            Vector tempv = (Vector) atblModel.getDataVector().elementAt(appointTbl.getSelectedRow());
            this.index = tempv.get(0).toString();
            allData = new Vector();
            if (readAndEditArray()) {
                atblModel.removeRow(appointTbl.getSelectedRow());
                atblModel.getDataVector().removeAllElements();
                atblModel.fireTableDataChanged();
                appointTbl.removeAll();
                appointTbl.revalidate();
                JOptionPane.showMessageDialog(this, "Removed Successfull!");
                this.showAppointments();
            }
        }
        else
            JOptionPane.showMessageDialog(this, "Select a row first!!");
    }//GEN-LAST:event_removeBtnMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        AdminPage ap = new AdminPage();
        ap.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void backButtonLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonLblMouseClicked
        AdminPage admPage= new AdminPage();
        admPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonLblMouseClicked

    private void backButtonLblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonLblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonLblActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AppointmentManagementPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppointmentManagementPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppointmentManagementPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppointmentManagementPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppointmentManagementPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addBtn;
    private javax.swing.JTable appointTbl;
    private javax.swing.JButton backButtonLbl;
    private javax.swing.JLabel editBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel removeBtn;
    // End of variables declaration//GEN-END:variables
}
