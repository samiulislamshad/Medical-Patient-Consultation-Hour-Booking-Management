/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userManagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author SUHA
 */
public class EditUserForm extends javax.swing.JDialog {

    /**
     * Creates new form EditUserForm
     */
    public UserManagementPage jparent;
    String index;
//    String[] editedline;
    Vector allData;
//    String usrname,email, contact, password, authuser;
    public EditUserForm(UserManagementPage parent, boolean modal, String index, String usrname, String email, String contact, String password, String authuser ) {
        super(parent, modal);
        jparent = parent;
        this.index = index;
//        editedline = new String[]{index, usrname, email, contact, password, authuser};
        allData = new Vector();
        initComponents();
        setupPrevdata(usrname, email, contact, password, authuser);
    }

    
    // Custom Methods
    public void setupPrevdata(String usrname, String email, String contact, String password, String authuser){
        this.usernameTf.setText(usrname);
        this.emailTf.setText(email);
        this.contactTf.setText(contact);
        this.passwordTf.setText(password);
        if (authuser.equals("admin")) {
            this.adminRb.setSelected(true);
        } else {
            this.doctorRb.setSelected(true);
        }
    }
    
    private boolean checkEmail(String email){
        String emailRegex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null | email == "") 
            return false; 
        else
            return pat.matcher(email).matches(); 
    }
    
    private boolean checkContactno(String cno){
        Pattern p = Pattern.compile("(\\+(\\d+)0|0)?[1-9][0-9]{9}"); 
	Matcher m = p.matcher(cno);
        
        if ("".equals(cno)) 
            return false; 
        else
            return (m.find() && m.group().equals(cno));
    }
    
    private boolean writeFile(){
        FileWriter fw = null;
        try {
            File rf = new File("AuthData.txt");
            if(!rf.exists()){
                rf.createNewFile();
                System.out.println("'AuthData.txt' file created.");
            }
            fw = new FileWriter(rf);
            for (int i = 0; i < this.allData.size(); i++) {
                fw.append(this.allData.get(i).toString()+"\n");
            }
            JOptionPane.showMessageDialog(this, "New user data has been added successfull!");
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
        String authuser;
        if(this.adminRb.isSelected()){
            authuser = "admin";
        }
        else{
            authuser = "doctor";
        }
        try {
            File rf = new File("AuthData.txt");
            if(!rf.exists()){
                rf.createNewFile();
                System.out.println("'AuthData.txt' file created.");
            }
            br = new BufferedReader(new FileReader(rf));
            Object[] lines = br.lines().toArray();
            for(int i=0; i < lines.length; i++){
                String[] linerow = lines[i].toString().trim().split(",");
                if (linerow[0].equals(this.index))
                    this.allData.add(index+","+usernameTf.getText()+","+emailTf.getText()+","+contactTf.getText()+","+passwordTf.getText()+","+authuser);
                else
                    this.allData.add(lines[i].toString());
            }
            br.close();
            return writeFile();
        } catch (IOException ex) {
            try {
                br.close();
                return false;
            } catch (IOException ex1) {
                JOptionPane.showMessageDialog(this, "Authentication Discarded. Technical Error");;
            }
            JOptionPane.showMessageDialog(this, "Authentication Discarded. Technical Error");
        }
        return false;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        signupLbl = new javax.swing.JLabel();
        usernameLbl = new javax.swing.JLabel();
        emailLbl = new javax.swing.JLabel();
        contactLbl = new javax.swing.JLabel();
        passwordLbl = new javax.swing.JLabel();
        adminRb = new javax.swing.JRadioButton();
        doctorRb = new javax.swing.JRadioButton();
        submitBtn = new javax.swing.JButton();
        usernameTf = new javax.swing.JTextField();
        emailTf = new javax.swing.JTextField();
        contactTf = new javax.swing.JTextField();
        passwordTf = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 250, 80));

        signupLbl.setFont(new java.awt.Font("Comic Sans MS", 0, 25)); // NOI18N
        signupLbl.setForeground(new java.awt.Color(45, 38, 38));
        signupLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signupLbl.setText("Edit User Info");

        usernameLbl.setFont(new java.awt.Font("Roboto", 2, 20)); // NOI18N
        usernameLbl.setForeground(new java.awt.Color(45, 38, 38));
        usernameLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        usernameLbl.setText("Username");
        usernameLbl.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        emailLbl.setFont(new java.awt.Font("Roboto", 2, 20)); // NOI18N
        emailLbl.setForeground(new java.awt.Color(45, 38, 38));
        emailLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        emailLbl.setText("Email");
        emailLbl.setFocusable(false);
        emailLbl.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        contactLbl.setFont(new java.awt.Font("Roboto", 2, 20)); // NOI18N
        contactLbl.setForeground(new java.awt.Color(45, 38, 38));
        contactLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        contactLbl.setText("Contact No");
        contactLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        passwordLbl.setFont(new java.awt.Font("Roboto", 2, 20)); // NOI18N
        passwordLbl.setForeground(new java.awt.Color(45, 38, 38));
        passwordLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        passwordLbl.setText("Password");
        passwordLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        adminRb.setBackground(new java.awt.Color(50,50,50,20));
        buttonGroup1.add(adminRb);
        adminRb.setFont(new java.awt.Font("Roboto", 2, 20)); // NOI18N
        adminRb.setForeground(new java.awt.Color(30, 30, 30));
        adminRb.setSelected(true);
        adminRb.setText("Admin Staff");
        adminRb.setMargin(new java.awt.Insets(0, 10, 0, 10));
        adminRb.setRequestFocusEnabled(false);
        adminRb.setRolloverEnabled(false);
        adminRb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminRbMouseClicked(evt);
            }
        });
        adminRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminRbActionPerformed(evt);
            }
        });

        doctorRb.setBackground(new java.awt.Color(50,50,50,20));
        buttonGroup1.add(doctorRb);
        doctorRb.setFont(new java.awt.Font("Roboto", 2, 20)); // NOI18N
        doctorRb.setForeground(new java.awt.Color(30, 30, 30));
        doctorRb.setText("Doctor");
        doctorRb.setMargin(new java.awt.Insets(0, 10, 0, 10));
        doctorRb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doctorRbMouseClicked(evt);
            }
        });

        submitBtn.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        usernameTf.setFont(new java.awt.Font("Georgia", 0, 20)); // NOI18N
        usernameTf.setForeground(new java.awt.Color(68, 68, 68));
        usernameTf.setMargin(new java.awt.Insets(0, 15, 0, 10));

        emailTf.setFont(new java.awt.Font("Georgia", 0, 20)); // NOI18N
        emailTf.setForeground(new java.awt.Color(68, 68, 68));
        emailTf.setMargin(new java.awt.Insets(0, 15, 0, 10));

        contactTf.setFont(new java.awt.Font("Georgia", 0, 20)); // NOI18N
        contactTf.setForeground(new java.awt.Color(68, 68, 68));
        contactTf.setMargin(new java.awt.Insets(0, 15, 0, 10));

        passwordTf.setFont(new java.awt.Font("Georgia", 0, 20)); // NOI18N
        passwordTf.setForeground(new java.awt.Color(68, 68, 68));
        passwordTf.setMargin(new java.awt.Insets(0, 15, 0, 10));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(signupLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(adminRb)
                        .addGap(93, 93, 93)
                        .addComponent(doctorRb)
                        .addGap(172, 172, 172))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(contactLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emailTf)
                            .addComponent(usernameTf)
                            .addComponent(contactTf)
                            .addComponent(passwordTf, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(137, 137, 137))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(signupLbl)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailTf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(contactLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(contactTf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordTf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminRb)
                    .addComponent(doctorRb))
                .addGap(18, 18, 18)
                .addComponent(submitBtn)
                .addGap(34, 34, 34))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void adminRbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminRbMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_adminRbMouseClicked

    private void adminRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminRbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminRbActionPerformed

    private void doctorRbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorRbMouseClicked
        // TODO add your handling code here
    }//GEN-LAST:event_doctorRbMouseClicked

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        String usrname = this.usernameTf.getText();
        String email = this.emailTf.getText();
        String contact = this.contactTf.getText();
        String password = this.passwordTf.getText();
        String authuser;
        if(this.adminRb.isSelected()){
            authuser = "admin";
        }
        else{
            authuser = "doctor";
        }

        if (usrname.contains(",") || email.contains(",") || contact.contains(",") || password.contains(",")) {
            JOptionPane.showMessageDialog(this, "Comma is not allowed!");
        }
        else if("".equals(usrname)){
            JOptionPane.showMessageDialog(this, "Username can't be empty!");
        }
        else if(!checkEmail(email)){
            JOptionPane.showMessageDialog(this, "Invalid Email!");
        }
        else if(!checkContactno(contact)){
            JOptionPane.showMessageDialog(this, "Invalid Contact No!");
        }
        else if("".equals(password)){
            JOptionPane.showMessageDialog(this, "Password an't be empty!");
        }
        else{
            //            Writing Data to a file
            if (readAndEditArray()) {
                this.jparent.showUsers();
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Error Occured in Editing");
            }
        }
    }//GEN-LAST:event_submitBtnActionPerformed

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
            java.util.logging.Logger.getLogger(EditUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditUserForm dialog = new EditUserForm(new UserManagementPage(), true, "","","","","","");
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton adminRb;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel contactLbl;
    private javax.swing.JTextField contactTf;
    private javax.swing.JRadioButton doctorRb;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField emailTf;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JPasswordField passwordTf;
    private javax.swing.JLabel signupLbl;
    public javax.swing.JButton submitBtn;
    private javax.swing.JLabel usernameLbl;
    private javax.swing.JTextField usernameTf;
    // End of variables declaration//GEN-END:variables
}
