/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initialPages;

import static initialPages.LoginPage.mobile;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author hasin
 */
public class DoctorProfileEdit extends javax.swing.JFrame {

    public static String oldNum;

    /**
     * Creates new form DoctorProfileEdit
     */
    public DoctorProfileEdit() {
        initComponents();
        oldNum = LoginPage.mobile;
        mobilelbl.setText("Mobile: " + oldNum);
        usernamelbl.setText("Username: " + LoginPage.doctor);
    }

    DoctorProfileEdit(String docUserName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        changePass = new javax.swing.JLabel();
        chngNumberBtn = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        usernamelbl = new javax.swing.JLabel();
        mobilelbl = new javax.swing.JLabel();
        bckbtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        changePass.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        changePass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        changePass.setText("Change Password");
        changePass.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        changePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changePassMouseClicked(evt);
            }
        });

        chngNumberBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        chngNumberBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chngNumberBtn.setText("Change Number");
        chngNumberBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        chngNumberBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chngNumberBtnMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("My Profile");

        usernamelbl.setText("Username: ");

        mobilelbl.setText("Mobile: ");

        bckbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bckbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bckbtn.setText("Back");
        bckbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bckbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bckbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(usernamelbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mobilelbl)
                .addGap(213, 213, 213))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(chngNumberBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(changePass, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bckbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(bckbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernamelbl)
                    .addComponent(mobilelbl))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chngNumberBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changePass, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(162, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changePassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePassMouseClicked
        // TODO add your handling code here:
        String oldPass = JOptionPane.showInputDialog("Old Password");
        String usrname = checkPass(oldPass);
        if (!usrname.isEmpty()) {
            String newPass = JOptionPane.showInputDialog("New Password");
            String newRePass = JOptionPane.showInputDialog("Re-type new Password");

            if (newPass.equals(newRePass)) {
                //Change authdata
                BufferedReader br = null;
                FileWriter fw = null;
                try {
                    File rf = new File("AuthData.txt");
                    if (!rf.exists()) {
                        rf.createNewFile();
                        System.out.println("'AuthData.txt' file created.");
                    }
                    br = new BufferedReader(new FileReader(rf));
                    Object[] lines = br.lines().toArray();
                    for (int i = 0; i < lines.length; i++) {
                        String line = lines[i].toString().trim();
                        String[] row = line.split(",");

                        if (!(usrname.equals(row[1]) && oldNum.equals(row[3]))) {
                            //write to new file
                            File file = new File("new temp file.txt");
                            if (!file.exists()) {
                                file.createNewFile();
                                System.out.println("'new temp file.txt' file created.");
                            }

                            fw = new FileWriter(file, true);
                            fw.write(row[0] + "," + row[1] + "," + row[2] + "," + row[3] + "," + row[4] + "," + row[5] + "\n");
                            fw.flush();
                            fw.close();
                        } else {
                            //change and write to new file
                            File file = new File("new temp file.txt");
                            if (!file.exists()) {
                                file.createNewFile();
                                System.out.println("'new temp file.txt' file created.");
                            }
                            fw = new FileWriter(file, true);
                            fw.write(row[0] + "," + row[1] + "," + row[2] + "," + row[3] + "," + newPass + "," + row[5] + "\n");
                            fw.flush();
                            fw.close();
                        }
                    }

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Technical Error");
                } finally {
                    try {
                        br.close();

                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(this, "Authentication Discarded. Technical Error");;
                    }
                }
                //rename new file and delete old file
                File f1 = new File("AuthData.txt");
                File f2 = new File("new temp file.txt");

                boolean b = f1.delete();
                Boolean x = f2.renameTo(f1);
                System.out.println(b);
                System.out.println(x);
                LoginPage lp = new LoginPage();
                lp.setVisible(true);
                this.dispose();

                /*
                File rf = new File("AuthData.txt");
                try {
                    BufferedReader br = new BufferedReader(new FileReader(rf));
                    Object[] lines = br.lines().toArray();

                    for (int i = 0; i < lines.length; i++) {

                        String line = lines[i].toString().trim();
                        String[] row = line.split(",");

                        if (usrname.equals(row[1]) && oldPass.equals(row[4])) {
                            //change
                            try {

                                FileWriter fw = new FileWriter(rf, true);
                                System.out.println("kaj");
                                System.out.println(row[0] + "," + usrname + "," + row[2] + "," + row[3] + "," + newPass + "," + row[5] + "\n");
                                fw.append(row[0] + "," + usrname + "," + row[2] + "," + row[3] + "," + newPass + "," + row[5] + "\n");
                                System.out.println("Password changed");
                            } catch (Exception e) {
                                System.out.println("Password change failed");
                            }
                            //initiate signout
                            try {
                                System.out.println("kaj");
                                File file = new File("LoginReference.txt");
                                file.delete();
                            } catch (Exception ex) {
                                Logger.getLogger(DoctorPage.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            //LoginPage
                            LoginPage lp = new LoginPage();
                            lp.setVisible(true);
                            this.dispose();
                        }
                    }
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(DoctorProfileEdit.class.getName()).log(Level.SEVERE, null, ex);
                }*/
            } else {
                JOptionPane.showMessageDialog(this, "Password Mismatch");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Incorrect Old Password ");
        }
    }//GEN-LAST:event_changePassMouseClicked

    private void chngNumberBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chngNumberBtnMouseClicked
        String newNum = JOptionPane.showInputDialog("Enter mobile number");
        this.dispose();
        changeNum(oldNum, newNum);
        LoginPage lp = new LoginPage();
        lp.setVisible(true);
        


    }//GEN-LAST:event_chngNumberBtnMouseClicked

    private void bckbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bckbtnMouseClicked
        DoctorPage dp = new DoctorPage();
        dp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bckbtnMouseClicked

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
            java.util.logging.Logger.getLogger(DoctorProfileEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorProfileEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorProfileEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorProfileEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorProfileEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bckbtn;
    private javax.swing.JLabel changePass;
    private javax.swing.JLabel chngNumberBtn;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel mobilelbl;
    private javax.swing.JLabel usernamelbl;
    // End of variables declaration//GEN-END:variables

    private String checkPass(String oldPass) {
        Boolean x = false;
        String username = "";
        BufferedReader br = null;
        File rf = new File("LoginReference.txt");
        try {
            br = new BufferedReader(new FileReader(rf));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DoctorProfileEdit.class.getName()).log(Level.SEVERE, null, ex);
        }
        Object[] lines = br.lines().toArray();
        for (int i = 0; i < lines.length; i++) {
            String line = lines[i].toString().trim();
            String[] row = line.split(",");

            if (oldPass.equals(row[1])) {
                x = true;
                username = row[0];
            } else {
                x = false;
            }
        }
        return username;
    }

    private void changeNum(String oldNum, String newNum) {
        String user = LoginPage.doctor;

        BufferedReader br = null;
        FileWriter fw = null;
        try {
            File rf = new File("AuthData.txt");
            if (!rf.exists()) {
                rf.createNewFile();
                System.out.println("'AuthData.txt' file created.");
            }
            br = new BufferedReader(new FileReader(rf));
            Object[] lines = br.lines().toArray();
            for (int i = 0; i < lines.length; i++) {
                String line = lines[i].toString().trim();
                String[] row = line.split(",");

                if (!(user.equals(row[1]) && oldNum.equals(row[3]))) {
                    //write to new file
                    File file = new File("new temp file.txt");
                    if (!file.exists()) {
                        file.createNewFile();
                        System.out.println("'new temp file.txt' file created.");
                    }

                    fw = new FileWriter(file, true);
                    fw.write(row[0] + "," + row[1] + "," + row[2] + "," + row[3] + "," + row[4] + "," + row[5] + "\n");
                    fw.flush();
                    fw.close();
                } else {
                    //change and write to new file
                    File file = new File("new temp file.txt");
                    if (!file.exists()) {
                        file.createNewFile();
                        System.out.println("'new temp file.txt' file created.");
                    }
                    fw = new FileWriter(file, true);
                    fw.write(row[0] + "," + row[1] + "," + row[2] + "," + newNum + "," + row[4] + "," + row[5] + "\n");
                    fw.flush();
                    fw.close();
                }
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Technical Error");
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Authentication Discarded. Technical Error");;
            }
        }
        //rename new file and delete old file
        File f1 = new File("AuthData.txt");
        File f2 = new File("new temp file.txt");

        boolean b = f1.delete();
        Boolean x = f2.renameTo(f1);
        System.out.println(b);
        System.out.println(x);

    }
}
