
package initialPages;


import userManagement.UserManagementPage;
import appointmentManagement.AppointmentManagementPage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import reportManagement.ReportManagementPage;

public class DoctorPage extends javax.swing.JFrame {
    public static String username="";
    
    static void signout() {
        
    }

    public DoctorPage() {
        initComponents();
    }

    DoctorPage(String usrname) {
        username=usrname;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        profileEdit = new javax.swing.JLabel();
        profileEditorbtn = new javax.swing.JLabel();
        patientHandlebtn = new javax.swing.JLabel();
        profileEdit1 = new javax.swing.JLabel();
        signoutlbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Doctor Homepage");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        profileEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_icon/doctorprofille.png"))); // NOI18N
        profileEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profileEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileEditMouseClicked(evt);
            }
        });

        profileEditorbtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        profileEditorbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profileEditorbtn.setText("Profile");
        profileEditorbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        profileEditorbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileEditorbtnMouseClicked(evt);
            }
        });

        patientHandlebtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        patientHandlebtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patientHandlebtn.setText("Patient Handle");
        patientHandlebtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        patientHandlebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patientHandlebtnMouseClicked(evt);
            }
        });

        profileEdit1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profileEdit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_icon/patienthandle.png"))); // NOI18N
        profileEdit1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profileEdit1.setMaximumSize(new java.awt.Dimension(200, 200));
        profileEdit1.setMinimumSize(new java.awt.Dimension(200, 200));
        profileEdit1.setPreferredSize(new java.awt.Dimension(200, 200));
        profileEdit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileEdit1MouseClicked(evt);
            }
        });

        signoutlbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        signoutlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signoutlbl.setText("Signout");
        signoutlbl.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        signoutlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signoutlblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1153, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(signoutlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(profileEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profileEditorbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(profileEdit1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientHandlebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {patientHandlebtn, profileEdit, profileEdit1, profileEditorbtn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signoutlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(profileEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(profileEditorbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(profileEdit1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(patientHandlebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {patientHandlebtn, profileEditorbtn});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void profileEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileEditMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_profileEditMouseClicked

    private void profileEdit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileEdit1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_profileEdit1MouseClicked

    private void profileEditorbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileEditorbtnMouseClicked
        // TODO add your handling code here:
        DoctorProfileEdit dpe = new DoctorProfileEdit();
        dpe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_profileEditorbtnMouseClicked

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

    private void patientHandlebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientHandlebtnMouseClicked
        PatientHandler pHandler= new PatientHandler();
        pHandler.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_patientHandlebtnMouseClicked

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
            java.util.logging.Logger.getLogger(DoctorPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel patientHandlebtn;
    private javax.swing.JLabel profileEdit;
    private javax.swing.JLabel profileEdit1;
    private javax.swing.JLabel profileEditorbtn;
    private javax.swing.JLabel signoutlbl;
    // End of variables declaration//GEN-END:variables
}
