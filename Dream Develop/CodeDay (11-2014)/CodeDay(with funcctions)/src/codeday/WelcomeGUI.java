/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeday;

import java.awt.Cursor;
import java.awt.Image;
import java.io.File;
import java.io.PrintWriter;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author Kirjsten
 */
public class WelcomeGUI extends javax.swing.JFrame {

    private Person person = new Person();
    private PrintWriter pw;
    /**
     * Creates new form WelcomeGUI
     */
    public WelcomeGUI(Person per) {
        initComponents();
        //initialize person
        person = per;
        
        //method changes icon, look to changeIcon text file
        changeIcon();
        
        //Dream Titles
        dreamTitle1.setText("");
        dreamTitle2.setText("");
        dreamTitle3.setText("");
        
        //Project Titles
        projectTitle1.setText("");
        projectTitle2.setText("");
        projectTitle3.setText("");
        
        //change name
        String name = person.getUserName();
        welcomeName.setText(name+"!");
        
        //if person has personalized icon
        //replace image path with personalized icon
        String path = "/AppPackage/Welcome/IconWelcome.png";
        topCornerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource(path)));
        
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

        topCornerIcon = new javax.swing.JLabel();
        developButton = new javax.swing.JLabel();
        dreamButton = new javax.swing.JLabel();
        accountButton = new javax.swing.JLabel();
        dreamTitle1 = new javax.swing.JLabel();
        dreamTitle2 = new javax.swing.JLabel();
        dreamTitle3 = new javax.swing.JLabel();
        blueViewAllButton = new javax.swing.JLabel();
        redViewAllButton = new javax.swing.JLabel();
        projectTitle1 = new javax.swing.JLabel();
        projectTitle2 = new javax.swing.JLabel();
        projectTitle3 = new javax.swing.JLabel();
        welcomeName = new javax.swing.JLabel();
        welcomeBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        topCornerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/Welcome/IconWelcome.png"))); // NOI18N
        getContentPane().add(topCornerIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, -6, 180, 140));

        developButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/Welcome/DevelopeWelcomeButton.png"))); // NOI18N
        developButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                developButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                developButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                developButtonMouseExited(evt);
            }
        });
        getContentPane().add(developButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 220, 100));

        dreamButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/Welcome/DreamWelcomeButton.png"))); // NOI18N
        dreamButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dreamButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dreamButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dreamButtonMouseExited(evt);
            }
        });
        getContentPane().add(dreamButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 280, 100));

        accountButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/Welcome/AccountWelcomeButton.png"))); // NOI18N
        accountButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accountButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accountButtonMouseExited(evt);
            }
        });
        getContentPane().add(accountButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 210, 100));

        dreamTitle1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        dreamTitle1.setForeground(new java.awt.Color(0, 102, 255));
        dreamTitle1.setText("Dream Title");
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
        getContentPane().add(dreamTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 170, 30));

        dreamTitle2.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        dreamTitle2.setForeground(new java.awt.Color(0, 102, 255));
        dreamTitle2.setText("Dream Title");
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
        getContentPane().add(dreamTitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 180, 30));

        dreamTitle3.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        dreamTitle3.setForeground(new java.awt.Color(0, 102, 255));
        dreamTitle3.setText("Dream Title");
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
        getContentPane().add(dreamTitle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 180, 30));

        blueViewAllButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/Welcome/Blue View All.png"))); // NOI18N
        blueViewAllButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blueViewAllButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                blueViewAllButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                blueViewAllButtonMouseExited(evt);
            }
        });
        getContentPane().add(blueViewAllButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 170, 50));

        redViewAllButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/Welcome/Red View All.png"))); // NOI18N
        redViewAllButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                redViewAllButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                redViewAllButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                redViewAllButtonMouseExited(evt);
            }
        });
        getContentPane().add(redViewAllButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 180, 50));

        projectTitle1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        projectTitle1.setForeground(new java.awt.Color(255, 0, 0));
        projectTitle1.setText("Project Title");
        projectTitle1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                projectTitle1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                projectTitle1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                projectTitle1MouseExited(evt);
            }
        });
        getContentPane().add(projectTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, -1));

        projectTitle2.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        projectTitle2.setForeground(new java.awt.Color(255, 0, 0));
        projectTitle2.setText("Project Title");
        projectTitle2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                projectTitle2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                projectTitle2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                projectTitle2MouseExited(evt);
            }
        });
        getContentPane().add(projectTitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, -1, -1));

        projectTitle3.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        projectTitle3.setForeground(new java.awt.Color(255, 0, 0));
        projectTitle3.setText("Project Title");
        projectTitle3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                projectTitle3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                projectTitle3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                projectTitle3MouseExited(evt);
            }
        });
        getContentPane().add(projectTitle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, -1, -1));

        welcomeName.setFont(new java.awt.Font("Roboto", 0, 52)); // NOI18N
        welcomeName.setForeground(new java.awt.Color(255, 255, 255));
        welcomeName.setText("Name!");
        getContentPane().add(welcomeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 220, 70));

        welcomeBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/Welcome/Welcome Background.png"))); // NOI18N
        getContentPane().add(welcomeBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-340, -100, 1350, 760));

        setSize(new java.awt.Dimension(735, 519));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void developButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_developButtonMouseClicked
        //Go to the "create a new project" page (DevelopGUI)
        new DevelopGUI().setVisible(true);
    }//GEN-LAST:event_developButtonMouseClicked

    private void dreamButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dreamButtonMouseClicked
        // go to the "create a new dream" page (DreamGUI)
        new DreamGUI().setVisible(true);
    }//GEN-LAST:event_dreamButtonMouseClicked

    private void accountButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountButtonMouseClicked
        // go to the "edit account" page (AccountGUI)
        new AccountGUI().setVisible(true);
    }//GEN-LAST:event_accountButtonMouseClicked

    private void redViewAllButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redViewAllButtonMouseClicked
        // go to the "list of projects" page (DevelopListGUI)
        new DevelopListGUI().setVisible(true);
    }//GEN-LAST:event_redViewAllButtonMouseClicked

    private void blueViewAllButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blueViewAllButtonMouseClicked
        // go to the "list of dreams" page (DreamListGUI)
        new DreamListGUI().setVisible(true);
    }//GEN-LAST:event_blueViewAllButtonMouseClicked

    private void developButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_developButtonMouseEntered
        //turn mouse into hand cursor
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_developButtonMouseEntered

    private void developButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_developButtonMouseExited
        //turn mouse into default cursor
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_developButtonMouseExited

    private void dreamButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dreamButtonMouseEntered
        // turn mouse into hand cursor
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_dreamButtonMouseEntered

    private void dreamButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dreamButtonMouseExited
        //turn mouse into default cursor
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_dreamButtonMouseExited

    private void accountButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountButtonMouseEntered
        //turn mouse into hand cursor
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_accountButtonMouseEntered

    private void accountButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountButtonMouseExited
        //turn mouse into default cursor
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_accountButtonMouseExited

    private void blueViewAllButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blueViewAllButtonMouseEntered
        // turn mouse into hand cursor
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_blueViewAllButtonMouseEntered

    private void blueViewAllButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blueViewAllButtonMouseExited
        //turn mouse into default cursor
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_blueViewAllButtonMouseExited

    private void redViewAllButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redViewAllButtonMouseEntered
        // turn mouse into hand cursor
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_redViewAllButtonMouseEntered

    private void redViewAllButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redViewAllButtonMouseExited
        //turn mouse into default cursor
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_redViewAllButtonMouseExited

    private void dreamTitle1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dreamTitle1MouseClicked
        //go to "edit dream" page (DreamEditGUI)
        //When this dream is selected, it can be edited in the next page
        new DreamEditGUI().setVisible(true);

    }//GEN-LAST:event_dreamTitle1MouseClicked

    private void dreamTitle3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dreamTitle3MouseClicked
       //go to "edit dream" page (DreamEditGUI)
        //When this dream is selected, it can be edited in the next page
        new DreamEditGUI().setVisible(true);

    }//GEN-LAST:event_dreamTitle3MouseClicked

    private void dreamTitle2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dreamTitle2MouseClicked
        //go to "edit dream" page (DreamEditGUI)
        //When this dream is selected, it can be edited in the next page
        new DreamEditGUI().setVisible(true);

    }//GEN-LAST:event_dreamTitle2MouseClicked

    private void projectTitle1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projectTitle1MouseClicked
        //go to "edit project" page (DevelopEditGUI)
        //When this project is selected, it can be edited in the next page
         new DevelopEditGUI().setVisible(true);
    }//GEN-LAST:event_projectTitle1MouseClicked

    private void projectTitle2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projectTitle2MouseClicked
       //go to "edit project" page (DevelopEditGUI)
        //When this project is selected, it can be edited in the next page
         new DevelopEditGUI().setVisible(true);
    }//GEN-LAST:event_projectTitle2MouseClicked

    private void projectTitle3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projectTitle3MouseClicked
        //go to "edit project" page (DevelopEditGUI)
        //When this project is selected, it can be edited in the next page
         new DevelopEditGUI().setVisible(true);
    }//GEN-LAST:event_projectTitle3MouseClicked

    private void dreamTitle1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dreamTitle1MouseEntered
        // turn mouse into hand cursor
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_dreamTitle1MouseEntered

    private void dreamTitle1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dreamTitle1MouseExited
        //turn mouse into default cursor
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_dreamTitle1MouseExited

    private void dreamTitle3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dreamTitle3MouseEntered
        //turn mouse into hand cursor
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_dreamTitle3MouseEntered

    private void dreamTitle3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dreamTitle3MouseExited
        //turn mouse into default cursor
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_dreamTitle3MouseExited

    private void dreamTitle2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dreamTitle2MouseEntered
        //turn mouse into hand cursor
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_dreamTitle2MouseEntered

    private void dreamTitle2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dreamTitle2MouseExited
        //turn mouse into default cursor
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_dreamTitle2MouseExited

    private void projectTitle1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projectTitle1MouseEntered
        // turn mouse into hand cursor
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_projectTitle1MouseEntered

    private void projectTitle1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projectTitle1MouseExited
        //turn mouse into default cursor
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_projectTitle1MouseExited

    private void projectTitle2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projectTitle2MouseEntered
        // turn mouse into hand cursor
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_projectTitle2MouseEntered

    private void projectTitle3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projectTitle3MouseEntered
        // turn mouse into default cursor
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_projectTitle3MouseEntered

    private void projectTitle3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projectTitle3MouseExited
        // TODO add your handling code here:
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_projectTitle3MouseExited

    private void projectTitle2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projectTitle2MouseExited
        // TODO add your handling code here:
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_projectTitle2MouseExited

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountButton;
    private javax.swing.JLabel blueViewAllButton;
    private javax.swing.JLabel developButton;
    private javax.swing.JLabel dreamButton;
    private javax.swing.JLabel dreamTitle1;
    private javax.swing.JLabel dreamTitle2;
    private javax.swing.JLabel dreamTitle3;
    private javax.swing.JLabel projectTitle1;
    private javax.swing.JLabel projectTitle2;
    private javax.swing.JLabel projectTitle3;
    private javax.swing.JLabel redViewAllButton;
    private javax.swing.JLabel topCornerIcon;
    private javax.swing.JLabel welcomeBackground;
    private javax.swing.JLabel welcomeName;
    // End of variables declaration//GEN-END:variables
}
