/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeday;

/**
 *
 * @author Kirjsten
 */
public class AccountGUI extends javax.swing.JFrame {

    /**
     * Creates new form AccountGUI
     */
    public AccountGUI() {
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

        emailLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        accountBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        emailLabel.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(102, 102, 102));
        emailLabel.setText("Email");
        getContentPane().add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 60, 20));

        usernameLabel.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(102, 102, 102));
        usernameLabel.setText("Username");
        getContentPane().add(usernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 120, 30));

        passwordLabel.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(102, 102, 102));
        passwordLabel.setText("Password");
        getContentPane().add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 130, 30));

        nameLabel.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(102, 102, 102));
        nameLabel.setText("Name");
        getContentPane().add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 110, -1));

        accountBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/accountBackground.png"))); // NOI18N
        getContentPane().add(accountBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-300, -110, 1340, 770));

        setSize(new java.awt.Dimension(753, 508));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountBackground;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
