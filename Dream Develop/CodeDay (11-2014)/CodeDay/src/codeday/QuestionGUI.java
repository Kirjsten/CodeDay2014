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
public class QuestionGUI extends javax.swing.JFrame {

    /**
     * Creates new form QuestionGUI
     */
    public QuestionGUI() {
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

        dreamerButton = new javax.swing.JLabel();
        developerButton = new javax.swing.JLabel();
        questionBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dreamerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/Question/Dreamer Button.png"))); // NOI18N
        dreamerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dreamerButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dreamerButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dreamerButtonMouseExited(evt);
            }
        });
        getContentPane().add(dreamerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 280, 70));

        developerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/Question/Developer Button.png"))); // NOI18N
        developerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                developerButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                developerButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                developerButtonMouseExited(evt);
            }
        });
        getContentPane().add(developerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 280, 70));

        questionBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/Question/Question Page (Dreamer or Developer) Background.png"))); // NOI18N
        getContentPane().add(questionBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-320, -100, 1370, -1));

        setSize(new java.awt.Dimension(799, 564));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dreamerButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dreamerButtonMouseEntered
        // turn mouse into hand cursor
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_dreamerButtonMouseEntered

    private void developerButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_developerButtonMouseEntered
        //turn mouse into hand cursor
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_developerButtonMouseEntered

    private void dreamerButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dreamerButtonMouseExited
        // turn mouse into default cursor
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_dreamerButtonMouseExited

    private void developerButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_developerButtonMouseExited
        // turn mouse into default cursor
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_developerButtonMouseExited

    private void dreamerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dreamerButtonMouseClicked
        //bring user to welcome page
        dispose();
        new WelcomeGUI().setVisible(true);
    }//GEN-LAST:event_dreamerButtonMouseClicked

    private void developerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_developerButtonMouseClicked
        //bring user to welcome page
        dispose();
        new WelcomeGUI().setVisible(true);
    }//GEN-LAST:event_developerButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel developerButton;
    private javax.swing.JLabel dreamerButton;
    private javax.swing.JLabel questionBackground;
    // End of variables declaration//GEN-END:variables
}
