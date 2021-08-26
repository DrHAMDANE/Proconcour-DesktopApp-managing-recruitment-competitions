
package application_gestiondesconcours;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import javax.swing.*;
import java.io.*;
import javax.imageio.ImageIO;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;
import java.awt.*;
import java.awt.image.*;
import java.util.HashMap;
import java.util.Map;
public class CodeurDecodeurQR extends javax.swing.JFrame {
    public CodeurDecodeurQR() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        Delete_button = new javax.swing.JButton();
        Save_button = new javax.swing.JButton();
        GenerateQR_button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jTextArea3 = new javax.swing.JTextArea();
        search_button = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        Encode_button = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGICON_APPLICATION");
        getContentPane().setLayout(null);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(102, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Entrer la chaine à coder", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(80, 19, 290, 290);

        jPanel2.setBackground(new java.awt.Color(102, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Code QR généré", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 249, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(380, 20, 300, 290);

        Delete_button.setBackground(new java.awt.Color(102, 0, 0));
        Delete_button.setFont(new java.awt.Font("Tahoma", 1, 11));
        Delete_button.setForeground(new java.awt.Color(255, 255, 255));
        Delete_button.setText("Supprimer");
        Delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(Delete_button);
        Delete_button.setBounds(400, 340, 100, 30);

        Save_button.setBackground(new java.awt.Color(102, 0, 0));
        Save_button.setFont(new java.awt.Font("Tahoma", 1, 11));
        Save_button.setForeground(new java.awt.Color(255, 255, 255));
        Save_button.setText("Sauvgarder");
        Save_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(Save_button);
        Save_button.setBounds(510, 340, 100, 30);

        GenerateQR_button.setBackground(new java.awt.Color(102, 0, 0));
        GenerateQR_button.setFont(new java.awt.Font("Tahoma", 1, 11));
        GenerateQR_button.setForeground(new java.awt.Color(255, 255, 255));
        GenerateQR_button.setText("Générer");
        GenerateQR_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateQR_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(GenerateQR_button);
        GenerateQR_button.setBounds(290, 340, 100, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application_gestiondesconcours/153856-digital_art-red-simple_background-flowers-texture-736x459.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 720, 390);

        jTabbedPane1.addTab("CODER", jPanel1);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 243, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel9);
        jPanel9.setBounds(2244, 51, 323, 243);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setBorder(null);
        jPanel5.add(jTextArea3);
        jTextArea3.setBounds(2242, 71, 206, 278);

        search_button.setBackground(new java.awt.Color(102, 0, 0));
        search_button.setFont(new java.awt.Font("Tahoma", 1, 11));
        search_button.setForeground(new java.awt.Color(255, 255, 255));
        search_button.setText("Rechercher");
        search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_buttonActionPerformed(evt);
            }
        });
        jPanel5.add(search_button);
        search_button.setBounds(180, 340, 99, 30);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField1);
        jTextField1.setBounds(290, 340, 290, 30);

        Encode_button.setBackground(new java.awt.Color(102, 0, 0));
        Encode_button.setFont(new java.awt.Font("Tahoma", 1, 11));
        Encode_button.setForeground(new java.awt.Color(255, 255, 255));
        Encode_button.setText("Décoder");
        Encode_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Encode_buttonActionPerformed(evt);
            }
        });
        jPanel5.add(Encode_button);
        Encode_button.setBounds(600, 340, 82, 30);

        jPanel7.setBackground(new java.awt.Color(102, 0, 0));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chaine décodée ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.add(jPanel7);
        jPanel7.setBounds(410, 10, 280, 300);

        jPanel8.setBackground(new java.awt.Color(102, 0, 0));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Image QR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 258, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 254, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.add(jPanel8);
        jPanel8.setBounds(100, 10, 290, 300);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application_gestiondesconcours/153856-digital_art-red-simple_background-flowers-texture-736x459.jpg"))); // NOI18N
        jPanel5.add(jLabel1);
        jLabel1.setBounds(0, 0, 710, 390);

        jTabbedPane1.addTab("DECODER", jPanel5);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 710, 420);

        jMenu1.setText(" Code QR");
        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 724, 470);
    }// </editor-fold>//GEN-END:initComponents
FileOutputStream fout;
ByteArrayOutputStream out;

private void GenerateQR_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateQR_buttonActionPerformed
  try{
    if(jTextArea1.getText().length()==0)
    return;
    String  t=jTextArea1.getText();
    out=QRCode.from(t).withSize(250,250).to(ImageType.PNG).stream();
    fout=new FileOutputStream(new File("temp.png"));  
    fout.write(out.toByteArray());
    fout.flush();
    fout.close();
    BufferedImage miQr=ImageIO.read(new File("temp.png"));
    JLabel label=new JLabel(new ImageIcon(miQr));
    Graphics g=jPanel6.getGraphics();
    g.drawImage(miQr,0,0, label);
  }
catch(Exception e){
    JOptionPane.showMessageDialog(null,e);
}
}//GEN-LAST:event_GenerateQR_buttonActionPerformed

private void Save_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_buttonActionPerformed
JFileChooser fc=new JFileChooser();
 int rv=fc.showDialog(jPanel1, null);
 if(rv==JFileChooser.APPROVE_OPTION){
    try{
         String ru=fc.getSelectedFile().getAbsolutePath()+ ".png";
         fout=new FileOutputStream(new File(ru));
         fout.write(out.toByteArray());
         fout.flush();
         fout.close();
    }
     catch(Exception e){
         JOptionPane.showMessageDialog(null,e);
      }}
}//GEN-LAST:event_Save_buttonActionPerformed

private void Delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_buttonActionPerformed
jTextArea1.setText(null);
}//GEN-LAST:event_Delete_buttonActionPerformed

Map hintMap = new HashMap();
private void Encode_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Encode_buttonActionPerformed
try{
    String filePath=jTextField1.getText();
    BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(
    new BufferedImageLuminanceSource(
    ImageIO.read(new FileInputStream(filePath)))));
    Result qrCodeResult = new MultiFormatReader().decode(binaryBitmap,hintMap);
    String m=qrCodeResult.getText();
    jTextArea2.setText(m);
}
catch(Exception e){
    JOptionPane.showMessageDialog(null,e);}
}//GEN-LAST:event_Encode_buttonActionPerformed

private void search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_buttonActionPerformed
try{
    JFileChooser fc=new JFileChooser();
    fc.showOpenDialog(null);
    File F=fc.getSelectedFile();
    String filename=F.getAbsolutePath();
    jTextField1.setText(filename);
    BufferedImage miQr=ImageIO.read(new File(filename));
    JLabel label=new JLabel(new ImageIcon(miQr));
    Graphics g=jPanel3.getGraphics();
    g.drawImage(miQr,1,1, label);
}
catch(Exception e){
    JOptionPane.showMessageDialog(null,e);
      }
}//GEN-LAST:event_search_buttonActionPerformed

private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(CodeurDecodeurQR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CodeurDecodeurQR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CodeurDecodeurQR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CodeurDecodeurQR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new CodeurDecodeurQR().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete_button;
    private javax.swing.JButton Encode_button;
    private javax.swing.JButton GenerateQR_button;
    private javax.swing.JButton Save_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton search_button;
    // End of variables declaration//GEN-END:variables
}
