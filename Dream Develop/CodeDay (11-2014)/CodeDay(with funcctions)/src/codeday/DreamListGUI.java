/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeday;

import java.awt.Cursor;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author Kirjsten
 */
public class DreamListGUI extends javax.swing.JFrame {

    /**
     * Creates new form DreamListGUI
     */
    public DreamListGUI() {
        initComponents();
        changeIcon();
        //get users dream titles
        dreamTitle1.setText("");
        dreamTitle2.setText("");
        dreamTitle3.setText("");
        dreamTitle4.setText("");
        dreamTitle5.setText("");
        dreamTitle6.setText("");
    }
     public void changeIcon()
    {
        URL url = getClass().getResource("/AppPackage/MiniIcon.png");
         if (url != null) 
         {
            ImageIcon icon = new ImageIcon(url);
            Image image = icon.getImage();
            this.setIconImage(image);
        } else {
            System.err.println("Couldn't find icon file");
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

        dreamTitle1 = new javax.swing.JLabel();
        dreamTitle2 = new javax.swing.JLabel();
        dreamTitle3 = new javax.swing.JLabel();
        dreamTitle4 = new javax.swing.JLabel();
        dreamTitle5 = new javax.swing.JLabel();
        dreamTitle6 = new javax.swing.JLabel();
        dreamListBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dreamTitle1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        dreamTitle1.setForeground(new java.awt.Color(0, 153, 255));
        dreamTitle1.setText("Dream Title 1");
        dreamTitle1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dreamTitle1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dreamTitle1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dreamTitle1MouseExited(evt);
            }
        });
        getContentPane().add(dreamTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 180, 40));

        dreamTitle2.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        dreamTitle2.setForeground(new java.awt.Color(0, 153, 255));
        dreamTitle2.setText("Dream Title 2");
        dreamTitle2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dreamTitle2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dreamTitle2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dreamTitle2MouseExited(evt);
            }
        });
        getContentPane().add(dreamTitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 180, 40));

        dreamTitle3.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        dreamTitle3.setForeground(new java.awt.Color(0, 153, 255));
        dreamTitle3.setText("Dream Title 3");
        dreamTitle3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dreamTitle3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dreamTitle3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dreamTitle3MouseExited(evt);
            }
        });
        getContentPane().add(dreamTitle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 180, 40));

        dreamTitle4.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        dreamTitle4.setForeground(new java.awt.Color(0, 153, 255));
        dreamTitle4.setText("Dream Title 4");
        dreamTitle4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dreamTitle4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dreamTitle4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dreamTitle4MouseExited(evt);
            }
        });
        getContentPane().add(dreamTitle4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 180, 40));

        dreamTitle5.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        dreamTitle5.setForeground(new java.awt.Color(0, 153, 255));
        dreamTitle5.setText("Dream Title 5");
        dreamTitle5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dreamTitle5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dreamTitle5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dreamTitle5MouseExited(evt);
            }
        });
        getContentPane().add(dreamTitle5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 180, 40));

        dreamTitle6.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        dreamTitle6.setForeground(new java.awt.Color(0, 153, 255));
        dreamTitle6.setText("Dream Title 6");
        dreamTitle6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dreamTitle6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dreamTitle6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dreamTitle6MouseExited(evt);
            }
        });
        getContentPane().add(dreamTitle6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 180, 40));

        dreamListBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/myDreamsBackground.png"))); // NOI18N
        getContentPane().add(dreamListBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-370, -100, 1360, 770));

        setSize(new java.awt.Dimension(685, 531));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dreamTitle2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dreamTitle2MouseEntered
        //change mouse cursor to hand pointer
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_dreamTitle2MouseEntered

    private void dreamTitle1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dreamTitle1MouseEntered
        //change mouse cursor to hand pointer
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_dreamTitle1MouseEntered

    private void dreamTitle3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dreamTitle3MouseEntered
       //change mouse cursor to hand pointer
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_dreamTitle3MouseEntered

    private void dreamTitle4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dreamTitle4MouseEntered
        //change mouse cursor to hand pointer
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_dreamTitle4MouseEntered

    private void dreamTitle5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dreamTitle5MouseEntered
        //change mouse cursor to hand pointer
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_dreamTitle5MouseEntered

    private void dreamTitle6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dreamTitle6MouseEntered
        //change mouse cursor to hand pointer
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_dreamTitle6MouseEntered

    private void dreamTitle2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dreamTitle2MouseExited
        //change mouse cursor to default cursor
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_dreamTitle2MouseExited

    private void dreamTitle1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dreamTitle1MouseExited
        //change mouse cursor to default cursor
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_dreamTitle1MouseExited

    private void dreamTitle3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dreamTitle3MouseExited
        //change mouse cursor to default cursor
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_dreamTitle3MouseExited

    private void dreamTitle4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dreamTitle4MouseExited
       //change mouse cursor to default cursor
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_dreamTitle4MouseExited

    private void dreamTitle5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dreamTitle5MouseExited
        //change mouse cursor to default cursor
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_dreamTitle5MouseExited

    private void dreamTitle6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dreamTitle6MouseExited
        ///change mouse cursor to default cursor
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_dreamTitle6MouseExited

    private void dreamTitle2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dreamTitle2MouseClicked
        //Open DreamEditGUI
        //user can edit there dream
        new DreamEditGUI().setVisible(true);
    }//GEN-LAST:event_dreamTitle2MouseClicked

    private void dreamTitle1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dreamTitle1MouseClicked
        //Open DreamEditGUI
        //user can edit there dream
        new DreamEditGUI().setVisible(true);
    }//GEN-LAST:event_dreamTitle1MouseClicked

    private void dreamTitle3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dreamTitle3MouseClicked
        //Open DreamEditGUI
        //user can edit there dream
        new DreamEditGUI().setVisible(true);
    }//GEN-LAST:event_dreamTitle3MouseClicked

    private void dreamTitle4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dreamTitle4MouseClicked
        //Open DreamEditGUI
        //user can edit there dream
        new DreamEditGUI().setVisible(true);
    }//GEN-LAST:event_dreamTitle4MouseClicked

    private void dreamTitle5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dreamTitle5MouseClicked
        //Open DreamEditGUI
        //user can edit there dream
        new DreamEditGUI().setVisible(true);
    }//GEN-LAST:event_dreamTitle5MouseClicked

    private void dreamTitle6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dreamTitle6MouseClicked
        //Open DreamEditGUI
        //user can edit there dream
        new DreamEditGUI().setVisible(true);
    }//GEN-LAST:event_dreamTitle6MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dreamListBackground;
    private javax.swing.JLabel dreamTitle1;
    private javax.swing.JLabel dreamTitle2;
    private javax.swing.JLabel dreamTitle3;
    private javax.swing.JLabel dreamTitle4;
    private javax.swing.JLabel dreamTitle5;
    private javax.swing.JLabel dreamTitle6;
    // End of variables declaration//GEN-END:variables
}
