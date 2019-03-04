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
public class DreamGUI extends javax.swing.JFrame {

    /**
     * Creates new form DreamGUI
     */
    public DreamGUI() {
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

        textFeilddreamTitle = new javax.swing.JTextField();
        textfeildSearchBar = new javax.swing.JTextField();
        tagsPane = new javax.swing.JScrollPane();
        TextfeildTags = new javax.swing.JTextArea();
        descriotionPane = new javax.swing.JScrollPane();
        TextfeildDescription = new javax.swing.JTextArea();
        textImage = new javax.swing.JLabel();
        createDreamBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textFeilddreamTitle.setText("Title of Dream");
        textFeilddreamTitle.setBorder(null);
        textFeilddreamTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFeilddreamTitleActionPerformed(evt);
            }
        });
        getContentPane().add(textFeilddreamTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 320, 40));

        textfeildSearchBar.setText("Search for Developer or Project");
        textfeildSearchBar.setBorder(null);
        getContentPane().add(textfeildSearchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 190, 20));

        tagsPane.setBorder(null);

        TextfeildTags.setColumns(20);
        TextfeildTags.setRows(5);
        TextfeildTags.setText("tags\n");
        tagsPane.setViewportView(TextfeildTags);

        getContentPane().add(tagsPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 100, 110));

        descriotionPane.setBorder(null);

        TextfeildDescription.setColumns(20);
        TextfeildDescription.setRows(5);
        TextfeildDescription.setText("description...\n");
        TextfeildDescription.setBorder(null);
        descriotionPane.setViewportView(TextfeildDescription);

        getContentPane().add(descriotionPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 270, 260));

        textImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/Textfeild Empty (white-black boarder).png"))); // NOI18N
        getContentPane().add(textImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 340, 60));

        createDreamBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/createdreambackground.png"))); // NOI18N
        getContentPane().add(createDreamBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-310, -10, 1180, 580));

        setSize(new java.awt.Dimension(801, 528));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFeilddreamTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFeilddreamTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFeilddreamTitleActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TextfeildDescription;
    private javax.swing.JTextArea TextfeildTags;
    private javax.swing.JLabel createDreamBackground;
    private javax.swing.JScrollPane descriotionPane;
    private javax.swing.JScrollPane tagsPane;
    private javax.swing.JTextField textFeilddreamTitle;
    private javax.swing.JLabel textImage;
    private javax.swing.JTextField textfeildSearchBar;
    // End of variables declaration//GEN-END:variables
}
