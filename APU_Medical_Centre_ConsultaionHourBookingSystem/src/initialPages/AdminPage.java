/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initialPages;

/**
 *
 * @author SUHA
 */

import userManagement.UserManagementPage;
import appointmentManagement.AppointmentManagementPage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import reportManagement.ReportManagementPage;

public class AdminPage extends javax.swing.JFrame {

    /**
     * Creates new form AdminPage
     */
    public AdminPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPnl = new javax.swing.JPanel();
        ttlLbl = new javax.swing.JLabel();
        usersmngLbl = new javax.swing.JLabel();
        appointmentmngLbl = new javax.swing.JLabel();
        reportmngLbl = new javax.swing.JLabel();
        signoutlbl = new javax.swing.JLabel();
        usersmngBtn = new javax.swing.JLabel();
        appointmentmngBtn = new javax.swing.JLabel();
        reportmngBtn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Panel");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPnl.setBackground(new java.awt.Color(0,0,0,10));

        ttlLbl.setFont(new java.awt.Font("Georgia", 0, 48)); // NOI18N
        ttlLbl.setForeground(new java.awt.Color(245, 243, 243));
        ttlLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ttlLbl.setText("APU Medical Center");

        usersmngLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_icon/doctor200.png"))); // NOI18N
        usersmngLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        usersmngLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersmngLblMouseClicked(evt);
            }
        });

        appointmentmngLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_icon/apntm_200.png"))); // NOI18N
        appointmentmngLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        appointmentmngLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appointmentmngLblMouseClicked(evt);
            }
        });
        appointmentmngLbl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                appointmentmngLblKeyPressed(evt);
            }
        });

        reportmngLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_icon/report_200.png"))); // NOI18N
        reportmngLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reportmngLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportmngLblMouseClicked(evt);
            }
        });
        reportmngLbl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                reportmngLblKeyPressed(evt);
            }
        });

        signoutlbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        signoutlbl.setForeground(new java.awt.Color(255, 255, 255));
        signoutlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signoutlbl.setText("Signout");
        signoutlbl.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        signoutlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signoutlblMouseClicked(evt);
            }
        });

        usersmngBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usersmngBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_icon/btnU.png"))); // NOI18N
        usersmngBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        usersmngBtn.setMaximumSize(new java.awt.Dimension(200, 34));
        usersmngBtn.setMinimumSize(new java.awt.Dimension(200, 34));
        usersmngBtn.setPreferredSize(new java.awt.Dimension(200, 34));
        usersmngBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersmngBtnMouseClicked(evt);
            }
        });

        appointmentmngBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appointmentmngBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_icon/btnA.png"))); // NOI18N
        appointmentmngBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        appointmentmngBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appointmentmngBtnMouseClicked(evt);
            }
        });

        reportmngBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportmngBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_icon/btnR.png"))); // NOI18N
        reportmngBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reportmngBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportmngBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainPnlLayout = new javax.swing.GroupLayout(mainPnl);
        mainPnl.setLayout(mainPnlLayout);
        mainPnlLayout.setHorizontalGroup(
            mainPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(usersmngLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(usersmngBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ttlLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(129, 129, 129)
                .addGroup(mainPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(appointmentmngBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(appointmentmngLbl))
                .addGap(132, 132, 132)
                .addGroup(mainPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(reportmngLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reportmngBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signoutlbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(162, 162, 162))
        );
        mainPnlLayout.setVerticalGroup(
            mainPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPnlLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(mainPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainPnlLayout.createSequentialGroup()
                        .addGroup(mainPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ttlLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(signoutlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(110, 110, 110)
                        .addGroup(mainPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usersmngLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reportmngLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(appointmentmngLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(appointmentmngBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usersmngBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reportmngBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(194, Short.MAX_VALUE))
        );

        getContentPane().add(mainPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 720));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_images/extra_bg.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, -2, 1200, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void reportmngLblKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reportmngLblKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_reportmngLblKeyPressed

    private void reportmngLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportmngLblMouseClicked
        // TODO add your handling code here:
        ReportManagementPage rrp = new ReportManagementPage();
        rrp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_reportmngLblMouseClicked

    private void appointmentmngLblKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_appointmentmngLblKeyPressed
        // TODO add your handling code here:
        AppointmentManagementPage amp = new AppointmentManagementPage();
        amp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_appointmentmngLblKeyPressed

    private void appointmentmngLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointmentmngLblMouseClicked
        // TODO add your handling code here:
        AppointmentManagementPage amp = new AppointmentManagementPage();
        amp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_appointmentmngLblMouseClicked

    private void usersmngLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersmngLblMouseClicked
        // TODO add your handling code here:
        UserManagementPage ump = new UserManagementPage();
        ump.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_usersmngLblMouseClicked

    private void usersmngBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersmngBtnMouseClicked
        // TODO add your handling code here:
        UserManagementPage ump = new UserManagementPage();
        ump.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_usersmngBtnMouseClicked

    private void appointmentmngBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointmentmngBtnMouseClicked
        // TODO add your handling code here:
        AppointmentManagementPage amp = new AppointmentManagementPage();
        amp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_appointmentmngBtnMouseClicked

    private void reportmngBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportmngBtnMouseClicked
        // TODO add your handling code here:
        ReportManagementPage rrp = new ReportManagementPage();
        rrp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_reportmngBtnMouseClicked

    private void signoutlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signoutlblMouseClicked
        FileWriter fw = null;
        try {
            File file = new File("LoginReference.txt");
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("'LoginReference.txt' file created.");
            }else{
                file.delete();
            }
        } catch (IOException ex) {
            Logger.getLogger(DoctorPage.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            LoginPage lp=new LoginPage();
            lp.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_signoutlblMouseClicked

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
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appointmentmngBtn;
    private javax.swing.JLabel appointmentmngLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel mainPnl;
    private javax.swing.JLabel reportmngBtn;
    private javax.swing.JLabel reportmngLbl;
    private javax.swing.JLabel signoutlbl;
    private javax.swing.JLabel ttlLbl;
    private javax.swing.JLabel usersmngBtn;
    private javax.swing.JLabel usersmngLbl;
    // End of variables declaration//GEN-END:variables
}
