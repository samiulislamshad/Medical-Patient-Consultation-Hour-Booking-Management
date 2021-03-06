/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initialPages;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author SUHA
 */
public class WelcomePage extends javax.swing.JFrame {

    /**
     * Creates new form WelcomePage
     */
    public WelcomePage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public boolean requestingUser(String usr){
//        Submit requested user
        FileWriter fw = null;
        try {
            File rf = new File("PresentUsr.txt");
            if(!rf.exists()){
                rf.createNewFile();
                System.out.println("'PresentUsr.txt' file created.");
            }
            fw = new FileWriter(rf);
            fw.append(usr);
        } catch (IOException ex) {
            return false;
        }finally{
            try {
                fw.flush();
                fw.close();
                return true;
            } catch (IOException ex) {
                return false;
            }
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        adminLblImg = new javax.swing.JLabel();
        doctorLblImg = new javax.swing.JLabel();
        adminLblTxt = new javax.swing.JLabel();
        doctorLblTxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome to APU Medical Center");
        setMaximumSize(new java.awt.Dimension(1200, 720));
        setMinimumSize(new java.awt.Dimension(1200, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0, 50));
        jPanel1.setMaximumSize(new java.awt.Dimension(1200, 720));

        jPanel2.setBackground(new java.awt.Color(47, 79, 110, 60));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 100));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0, 100));
        jLabel3.setFont(new java.awt.Font("Georgia", 0, 45)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 234));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("APU Medical Center");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        adminLblImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminLblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_icon/admin200.png"))); // NOI18N
        adminLblImg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminLblImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminLblImgMouseClicked(evt);
            }
        });

        doctorLblImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        doctorLblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_icon/doctor200.png"))); // NOI18N
        doctorLblImg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        doctorLblImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doctorLblImgMouseClicked(evt);
            }
        });

        adminLblTxt.setBackground(new java.awt.Color(38, 29, 29));
        adminLblTxt.setFont(new java.awt.Font("Georgia", 1, 32)); // NOI18N
        adminLblTxt.setForeground(new java.awt.Color(251, 252, 230));
        adminLblTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminLblTxt.setText("Admin Staff");
        adminLblTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminLblTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminLblTxtMouseClicked(evt);
            }
        });

        doctorLblTxt.setBackground(new java.awt.Color(38, 29, 29));
        doctorLblTxt.setFont(new java.awt.Font("Georgia", 1, 33)); // NOI18N
        doctorLblTxt.setForeground(new java.awt.Color(251, 252, 230));
        doctorLblTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        doctorLblTxt.setText("Doctors");
        doctorLblTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        doctorLblTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doctorLblTxtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(adminLblImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(adminLblTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(214, 214, 214)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(doctorLblImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(doctorLblTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(386, 386, 386)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(298, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminLblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctorLblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminLblTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctorLblTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(213, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 720));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_images/welcome_bg.jpeg"))); // NOI18N
        jLabel1.setAlignmentX(0.5F);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void adminLblImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminLblImgMouseClicked
        // TODO add your handling code here:
        if (requestingUser("admin")) {
            LoginPage lp = new LoginPage();
            lp.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_adminLblImgMouseClicked

    private void doctorLblImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorLblImgMouseClicked
        // TODO add your handling code here:
        if (requestingUser("doctor")) {
            LoginPage lp = new LoginPage();
            lp.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_doctorLblImgMouseClicked

    private void adminLblTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminLblTxtMouseClicked
        // TODO add your handling code here:
        if (requestingUser("admin")) {
            LoginPage lp = new LoginPage();
            lp.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_adminLblTxtMouseClicked

    private void doctorLblTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorLblTxtMouseClicked
        // TODO add your handling code here:
        if (requestingUser("doctor")) {
            LoginPage lp = new LoginPage();
            lp.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_doctorLblTxtMouseClicked

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
            java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminLblImg;
    private javax.swing.JLabel adminLblTxt;
    private javax.swing.JLabel doctorLblImg;
    private javax.swing.JLabel doctorLblTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
