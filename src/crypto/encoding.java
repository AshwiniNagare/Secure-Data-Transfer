/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author HP
 */
public class encoding extends javax.swing.JFrame {
    BufferedImage sourceImage =null, EmbeddedImage=null;
     JScrollPane originalPane = new JScrollPane(),
    embeddedPane = new JScrollPane();
    public encoding() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextMessage = new javax.swing.JTextArea();
        jLabel1source1 = new javax.swing.JLabel();
        jLabel1source2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        jTextMessage.setColumns(20);
        jTextMessage.setRows(5);
        jTextMessage.setBorder(javax.swing.BorderFactory.createTitledBorder("Message Box"));
        jScrollPane1.setViewportView(jTextMessage);

        jLabel1source1.setAutoscrolls(true);
        jLabel1source1.setBorder(javax.swing.BorderFactory.createTitledBorder("Source Image"));
        jLabel1source1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1source2.setAutoscrolls(true);
        jLabel1source2.setBorder(javax.swing.BorderFactory.createTitledBorder("Embedded Image"));
        jLabel1source2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton1.setText("OPEN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("ENCODE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("SAVE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("RESET");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1source1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1source2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1source2, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(jLabel1source1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private File showFileDialog(final boolean open){
        JFileChooser chooser =new JFileChooser("open an image");
        FileFilter filefilter =new FileFilter(){
            @Override
            public boolean accept(File file) {
                String name=file.getName().toLowerCase();
                if(open){
                    return file.isDirectory()|| name.endsWith(".jpg")||name.endsWith(".jpeg")||name.endsWith(".png")
                            ||name.endsWith(".bmg");
                }
                 return file.isDirectory()||name.endsWith(".png")||name.endsWith(".bmg");  
            }
            public String getDescription(){
                if(open)
                    return "image(*.jpg,*.jpeg,*.png,*.bmg)";
                return "image(*.png,*.bmg)";
            }   
        };
        chooser.setAcceptAllFileFilterUsed(false);
        chooser.addChoosableFileFilter(filefilter);
        
        File file=null;
        if(open && chooser.showOpenDialog(this)==chooser.APPROVE_OPTION)
            file=chooser.getSelectedFile();
        else if(!open && chooser.showSaveDialog(this)==chooser.APPROVE_OPTION)
            file=chooser.getSelectedFile();
        return file;
        
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        File file=showFileDialog(true);
        if(file==null){
            return;
        }
        try {
            sourceImage= ImageIO.read(file);
            /*Image dimg = sourceImage.getScaledInstance(jLabel1source.getWidth(), jLabel1source.getHeight(),
        Image.SCALE_SMOOTH);*/
            jLabel1source1.setIcon(new ImageIcon(sourceImage)); 
            //JLabel l = new JLabel(new ImageIcon(sourceImage));
            //originalPane.getViewport().add(l);
            this.validate();
        } catch (IOException ex) {
            
           
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(jTextMessage.equals(" ")|| sourceImage==null){
            JOptionPane.showMessageDialog(this, "no message has been embedded","No picture or message found",JOptionPane.ERROR_MESSAGE);
            return;
        }
        String Message = jTextMessage.getText();
        EmbeddedImage = sourceImage.getSubimage(0,0,sourceImage.getWidth(),sourceImage.getHeight());
        EmbedMessage(EmbeddedImage, Message);
        jLabel1source2.setIcon(new ImageIcon(EmbeddedImage)); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         if(EmbeddedImage == null) {
       JOptionPane.showMessageDialog(this, "No message has been embedded!", 
         "Nothing to save", JOptionPane.ERROR_MESSAGE);
       return;
      }
   File file = showFileDialog(false);
    String name = file.getName();
    String ext = name.substring(name.lastIndexOf(".")+1).toLowerCase();
    if(!ext.equals("png") && !ext.equals("bmp") &&   !ext.equals("dib")) {
          ext = "png";
          file = new File(file.getAbsolutePath()+".png");
          }
    try {
       if(file.exists()) file.delete();
       ImageIO.write(EmbeddedImage, ext.toUpperCase(), file);
       } catch(Exception ex) { ex.printStackTrace(); }
    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jTextMessage.setText("");
        sourceImage=null;
        EmbeddedImage=null;
        jLabel1source2.setIcon(null);
        jLabel1source1.setIcon(null); 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void EmbedMessage(BufferedImage img, String mess){
        int messageLength = mess.length();
        int imageWidth = img.getWidth(), imageHeight = img.getHeight(),
       imageSize = imageWidth * imageHeight;
    if(messageLength * 8 + 32 > imageSize) {
       JOptionPane.showMessageDialog(this, "Message is too long for the chosen image",
          "Message too long!", JOptionPane.ERROR_MESSAGE);
       return;
       }
    embedInteger(img, messageLength, 0, 0);
 
    byte b[] = mess.getBytes();
    for(int i=0; i<b.length; i++)
       embedByte(img, b[i], i*8+32, 0);     
    }
    
    private void embedInteger(BufferedImage img, int n, int start, int storageBit) {
    int maxX = img.getWidth(), maxY = img.getHeight(), 
       startX = start/maxY, startY = start - startX*maxY, count=0;
    for(int i=startX; i<maxX && count<32; i++) {
       for(int j=startY; j<maxY && count<32; j++) {
          int rgb = img.getRGB(i, j), bit = getBitValue(n, count);
          rgb = setBitValue(rgb, storageBit, bit);
          img.setRGB(i, j, rgb);
          count++;
          }
       }
    }
    
    private void embedByte(BufferedImage img, byte b, int start, int storageBit) {
    int maxX = img.getWidth(), maxY = img.getHeight(), 
       startX = start/maxY, startY = start - startX*maxY, count=0;
    for(int i=startX; i<maxX && count<8; i++) {
       for(int j=startY; j<maxY && count<8; j++) {
          int rgb = img.getRGB(i, j), bit = getBitValue(b, count);
          rgb = setBitValue(rgb, storageBit, bit);
          img.setRGB(i, j, rgb);
          count++;
          }
       }
    }
    
    private int getBitValue(int n, int location) {
    int v = n & (int) Math.round(Math.pow(2, location));
    return v==0?0:1;
    }
 
 private int setBitValue(int n, int location, int bit) {
    int toggle = (int) Math.pow(2, location), bv = getBitValue(n, location);
    if(bv == bit)
       return n;
    if(bv == 0 && bit == 1)
       n |= toggle;
    else if(bv == 1 && bit == 0)
       n ^= toggle;
    return n;
    }
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
            java.util.logging.Logger.getLogger(encoding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(encoding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(encoding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(encoding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new encoding().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1source1;
    private javax.swing.JLabel jLabel1source2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextMessage;
    // End of variables declaration//GEN-END:variables
}
