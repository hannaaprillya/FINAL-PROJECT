/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        usernameTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        userTypeCombo = new javax.swing.JComboBox<>();
        passwordTxt = new javax.swing.JPasswordField();
        registerBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setForeground(new java.awt.Color(255, 153, 153));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("BUDI LUHUR");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 30, 120, 29);

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Username");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 108, 59, 16);

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Password");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(23, 154, 56, 16);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(289, 232, 0, 0);

        loginBtn.setForeground(new java.awt.Color(0, 0, 0));
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        jPanel1.add(loginBtn);
        loginBtn.setBounds(258, 250, 59, 28);

        usernameTxt.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(usernameTxt);
        usernameTxt.setBounds(114, 102, 203, 28);

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Role");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(23, 199, 26, 16);

        userTypeCombo.setForeground(new java.awt.Color(0, 0, 0));
        userTypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pemilik Toko", "Staff Gudang" }));
        jPanel1.add(userTypeCombo);
        userTypeCombo.setBounds(114, 194, 203, 26);

        passwordTxt.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(passwordTxt);
        passwordTxt.setBounds(114, 148, 203, 28);

        registerBtn.setForeground(new java.awt.Color(0, 0, 0));
        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });
        jPanel1.add(registerBtn);
        registerBtn.setBounds(114, 250, 75, 28);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        Operations operations = new Operations();

        try {
            String usernameStr = usernameTxt.getText();
            String passwordStr = passwordTxt.getText();
            String usertypeStr = userTypeCombo.getSelectedItem().toString();

            if (operations.isLogin(usernameStr, passwordStr, usertypeStr, this)) {
                if (userTypeCombo.getSelectedItem().toString() == "Pemilik Toko") {
                    menu DashBoard = new menu();
                    DashBoard.setVisible(true);
                    this.dispose();
                } else {
                    barangUser brg = new barangUser();
                    brg.setVisible(true);
                    this.dispose();
                }

            } else {
                JOptionPane.showMessageDialog(this, "Username atau Password Salah");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please type correct information");
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        // TODO add your handling code here:
        dispose();
        Register reg = new Register();
        reg.setVisible(true);
        
    }//GEN-LAST:event_registerBtnActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JButton registerBtn;
    private javax.swing.JComboBox<String> userTypeCombo;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
