/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.libraryprogram;

import java.io.File;
import java.text.ParseException;
import java.time.Instant;
import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.text.MaskFormatter;
import javax.swing.JFileChooser;
import javax.swing.filechooser.*;
import javax.swing.ImageIcon;
import javax.swing.InputVerifier;
import javax.swing.JComponent;

/**
 *
 * @author tiein
 */
public class addScreen extends javax.swing.JFrame {

    /**
     * Creates new form addScreen
     */
    private FileFilter ffilter = new FileFilter() {
        @Override
        public String getDescription() {
            return ("JPEG and PNG Images");
        }

        @Override
        public boolean accept(File f) {
            return getExtension(f).equals("jpg") || getExtension(f).equals("jpeg") || getExtension(f).equals("png") || getExtension(f).equals("");
        }

        private String getExtension(File f) {
            String name = f.getName();
            if (name.lastIndexOf('.') > 0) {
                return (name.substring(name.lastIndexOf('.') + 1));
            } else {
                return "";
            }
        }
    };

    private InputVerifier iv = new InputVerifier() {
        @Override
        public boolean verify(JComponent input) {
            try {
                javax.swing.JFormattedTextField tf = (javax.swing.JFormattedTextField) input;

                String text = tf.getText();

                double rt = Double.parseDouble(text);

                return (rt >= 0 && rt <= 10);
            } catch (Exception e) {
                return false;
            }
        }
    };

    LibraryForm mainForm;
    boolean isEditing;
    int index;

    public addScreen(LibraryForm mf) {
        initComponents();

        mainForm = mf;
        isEditing = false;

        ratingField.setInputVerifier(iv);

        descArea.setText("");
        index = -1;
    }

    public addScreen() {
        initComponents();

        ratingField.setInputVerifier(iv);
        descArea.setText("");
        index = -1;
    }

    public addScreen(LibraryForm mf, int in) {
        initComponents();

        mainForm = mf;
        isEditing = true;
        addButton.setText("Save");

        authorField.setText(mainForm.displayList.get(index).getVar(1));
        titleField.setText(mainForm.displayList.get(index).getTitle());
        datePicker.setDate(mainForm.displayList.get(index).getRDate());
        ratingField.setText(Double.toString(mainForm.displayList.get(index).getRating()));
        descArea.setText(mainForm.displayList.get(index).getDescription());
        isbnField.setText(mainForm.displayList.get(index).getISBN());
        
        try{
            imageButton.setIcon(mainForm.displayList.get(index).getImage());
            imageButton.setText("");
        }catch(NullPointerException npe){
            imageButton.setText("Select cover image...");
        }

        index = in;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        datePicker = new org.jdesktop.swingx.JXDatePicker();
        imageButton = new javax.swing.JButton();
        authorLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        authorField = new javax.swing.JTextField();
        titleField = new javax.swing.JTextField();
        ratingLabel = new javax.swing.JLabel();
        ratingField = new javax.swing.JFormattedTextField();
        outOfTenLabel = new javax.swing.JLabel();
        isbnLabel = new javax.swing.JLabel();
        isbnField = new javax.swing.JTextField();
        descriptionLabel = new javax.swing.JLabel();
        descPane = new javax.swing.JScrollPane();
        descArea = new javax.swing.JTextArea();
        addButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Book");

        imageButton.setText("Select cover image...");
        imageButton.setBorder(null);
        imageButton.setIconTextGap(0);
        imageButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        imageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageButtonActionPerformed(evt);
            }
        });

        authorLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        authorLabel.setText("Author:");

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        titleLabel.setText("Title:");

        dateLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dateLabel.setText("Release Date:");

        ratingLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ratingLabel.setText("Rating:");

        ratingField.setColumns(4);
        ratingField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        outOfTenLabel.setText("/10");

        isbnLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        isbnLabel.setText("ISBN:");

        descriptionLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        descriptionLabel.setText("Description:");

        descPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        descArea.setColumns(20);
        descArea.setRows(5);
        descArea.setWrapStyleWord(true);
        descArea.setMaximumSize(new java.awt.Dimension(505, 2147483647));
        descPane.setViewportView(descArea);

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(imageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(authorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ratingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(isbnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(titleField)
                                    .addComponent(authorField)
                                    .addComponent(datePicker, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addComponent(ratingField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(outOfTenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(isbnField)))
                            .addComponent(descriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descPane))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(authorLabel)
                            .addComponent(authorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titleLabel)
                            .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateLabel)
                            .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ratingLabel)
                            .addComponent(ratingField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(outOfTenLabel))
                        .addGap(21, 21, 21)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isbnLabel)
                            .addComponent(isbnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(imageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descriptionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descPane, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(cancelButton))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageButtonActionPerformed
        JFileChooser fc = new JFileChooser();
        File f;

        fc.setFileFilter(ffilter);
        fc.setAcceptAllFileFilterUsed(false);

        int num = fc.showOpenDialog(mainPanel);

        if (num == JFileChooser.APPROVE_OPTION) {
            f = fc.getSelectedFile();
            imageButton.setText(null);
            System.out.println(f.getAbsolutePath());
            ImageIcon imI = new ImageIcon(f.toString());

            imageButton.setIcon(resizeImage(imI));
        }
    }//GEN-LAST:event_imageButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        //Book returnedBook;

        if (!isEditing) {
            try {
                //if(imageButton.)
                Book returnedBook = new Book(titleField.getText(), authorField.getText(), datePicker.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), java.time.LocalDate.now(),
                        descArea.getText(), Double.parseDouble(ratingField.getText()), isbnField.getText(), (ImageIcon) imageButton.getIcon());
                mainForm.addBookToList(returnedBook);
                this.dispose();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                //if(imageButton.)
                Book returnedBook = new Book(titleField.getText(), authorField.getText(), datePicker.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), java.time.LocalDate.now(),
                        descArea.getText(), Double.parseDouble(ratingField.getText()), isbnField.getText(), (ImageIcon) imageButton.getIcon());

                mainForm.removeFromList(index);
                mainForm.addBookToList(returnedBook);

                this.dispose();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

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
            java.util.logging.Logger.getLogger(addScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField authorField;
    private javax.swing.JLabel authorLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel dateLabel;
    private org.jdesktop.swingx.JXDatePicker datePicker;
    private javax.swing.JTextArea descArea;
    private javax.swing.JScrollPane descPane;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JButton imageButton;
    private javax.swing.JTextField isbnField;
    private javax.swing.JLabel isbnLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel outOfTenLabel;
    private javax.swing.JFormattedTextField ratingField;
    private javax.swing.JLabel ratingLabel;
    private javax.swing.JTextField titleField;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

    private ImageIcon resizeImage(ImageIcon iIcon) {
        int iW = iIcon.getIconWidth();
        int iH = iIcon.getIconHeight();

        int bH = imageButton.getHeight();
        int bW = imageButton.getWidth();

        float widthRatio = (float) bW / iW;
        float heightRatio = (float) bH / iH;

        if (widthRatio < heightRatio) {
            return (ImageIcon) LibraryForm.resizeIcon(iIcon, (int) Math.round(widthRatio * iW * 0.9), (int) Math.round(widthRatio * iH * 0.9));
        } else {
            return (ImageIcon) LibraryForm.resizeIcon(iIcon, (int) Math.round(heightRatio * iW * 0.9), (int) Math.round(heightRatio * iH * 0.9));
        }
    }
}
