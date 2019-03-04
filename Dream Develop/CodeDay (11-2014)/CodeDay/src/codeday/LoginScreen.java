/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeday;

import java.awt.Cursor;


/**
 *
 * @author Kirjsten
 */
public class LoginScreen extends javax.swing.JFrame {

    /**
     * Creates new form LoginScreen
     */
    public LoginScreen() {
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

        textfeildUsername = new javax.swing.JTextField();
        textfeildPassword = new javax.swing.JTextField();
        usernameTextImage = new javax.swing.JLabel();
        passwordTextImage = new javax.swing.JLabel();
        registerButton = new javax.swing.JLabel();
        loginButton = new javax.swing.JLabel();
        loginBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textfeildUsername.setText(" Username");
        textfeildUsername.setBorder(null);
        textfeildUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textfeildUsernameMouseClicked(evt);
            }
        });
        textfeildUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfeildUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(textfeildUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 320, 30));

        textfeildPassword.setText(" Password");
        textfeildPassword.setBorder(null);
        textfeildPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textfeildPasswordMouseClicked(evt);
            }
        });
        textfeildPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfeildPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(textfeildPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 320, 30));

        usernameTextImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/Login/Login Textfeild Username.png"))); // NOI18N
        usernameTextImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameTextImageMouseClicked(evt);
            }
        });
        getContentPane().add(usernameTextImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 210, 340, 50));

        passwordTextImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/Login/Login textfeild password.png"))); // NOI18N
        passwordTextImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordTextImageMouseClicked(evt);
            }
        });
        getContentPane().add(passwordTextImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 280, -1, 50));

        registerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/Login/Register Button.png"))); // NOI18N
        registerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerButtonMouseExited(evt);
            }
        });
        getContentPane().add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 160, 60));

        loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/Login/Login Button.png"))); // NOI18N
        loginButton.setText(" ");
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginButtonMouseExited(evt);
            }
        });
        getContentPane().add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 340, 160, -1));

        loginBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/Login/LoginBackGround.png"))); // NOI18N
        getContentPane().add(loginBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-400, -100, 1360, 750));

        setSize(new java.awt.Dimension(603, 499));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTextImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameTextImageMouseClicked
        //make plain textfeild
        usernameTextImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/Textfeild Empty (white-black boarder).png")));
    }//GEN-LAST:event_usernameTextImageMouseClicked

    private void passwordTextImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordTextImageMouseClicked
        //make plain textfeild
        passwordTextImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/Textfeild Empty (white-black boarder).png")));
    }//GEN-LAST:event_passwordTextImageMouseClicked

    private void registerButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseEntered
        //make mouse look like pointer finger
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_registerButtonMouseEntered

    private void registerButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseExited
        //make mouse back to normal
       setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_registerButtonMouseExited

    private void loginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseEntered
        //make mouse pointer finger
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_loginButtonMouseEntered

    private void loginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseExited
        //make mouse back to normal
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_loginButtonMouseExited

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        //When login button is clicked, do this!
        //dispose login window, open welcome window(if correct login is used)
        dispose();
        new WelcomeGUI().setVisible(true);
    }//GEN-LAST:event_loginButtonMouseClicked

    private void registerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseClicked
        //When Register button is clicked, do this!
        //dispose login window, open register window
        dispose();
        new RegisterGUI().setVisible(true);
    }//GEN-LAST:event_registerButtonMouseClicked

    private void textfeildUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfeildUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfeildUsernameActionPerformed

    private void textfeildPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfeildPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfeildPasswordActionPerformed

    private void textfeildUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textfeildUsernameMouseClicked
        //clear textfeild
        textfeildUsername.setText("");
    }//GEN-LAST:event_textfeildUsernameMouseClicked

    private void textfeildPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textfeildPasswordMouseClicked
        //clear textfeild
        textfeildPassword.setText("");
    }//GEN-LAST:event_textfeildPasswordMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel loginBackground;
    private javax.swing.JLabel loginButton;
    private javax.swing.JLabel passwordTextImage;
    private javax.swing.JLabel registerButton;
    private javax.swing.JTextField textfeildPassword;
    private javax.swing.JTextField textfeildUsername;
    private javax.swing.JLabel usernameTextImage;
    // End of variables declaration//GEN-END:variables
}
