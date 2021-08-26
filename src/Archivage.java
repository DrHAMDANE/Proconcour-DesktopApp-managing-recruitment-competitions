
package application_gestiondesconcours;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.psafix.folderchooser.JFolderChooser;


public class Archivage extends javax.swing.JFrame {

    static public void zipFolder(String srcFolder, String destZipFile) throws Exception {
      ZipOutputStream zip = null;
      FileOutputStream fileWriter = null;
      fileWriter = new FileOutputStream(destZipFile);
      zip = new ZipOutputStream(fileWriter);
      addFolderToZip("", srcFolder, zip);
      zip.flush();
      zip.close();}
    static private void addFileToZip(String path, String srcFile, ZipOutputStream zip)
      throws Exception {
      File folder = new File(srcFile);
      if (folder.isDirectory()) {
      addFolderToZip(path, srcFile, zip);}
      else {
      byte[] buf = new byte[1024];
      int len;
      FileInputStream in = new FileInputStream(srcFile);
      zip.putNextEntry(new ZipEntry(path + "/" + folder.getName()));
      while ((len = in.read(buf)) > 0) {
        zip.write(buf, 0, len);}}}
    static private void addFolderToZip(String path, String srcFolder, ZipOutputStream zip)
      throws Exception {
      File folder = new File(srcFolder);
      for (String fileName : folder.list()) {
      if (path.equals("")) {
      addFileToZip(folder.getName(), srcFolder + "/" + fileName, zip);} 
      else {
      addFileToZip(path + "/" + folder.getName(), srcFolder + "/" + fileName, zip);}}}
    
    public Archivage() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("APPLICATION_LOGICON");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 204, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton1.setText("chercher fichier");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(167, 390, 130, 30);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(318, 390, 230, 30);

        jButton3.setBackground(new java.awt.Color(0, 204, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton3.setText("archiver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(580, 390, 80, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application_gestiondesconcours/calendrier.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 710, 450);

        jTabbedPane1.addTab("archiver_fichier", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);
        jPanel2.add(jTextField2);
        jTextField2.setBounds(292, 370, 270, 30);

        jButton2.setBackground(new java.awt.Color(255, 204, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton2.setText("chercher dossier");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(110, 370, 160, 30);

        jButton4.setBackground(new java.awt.Color(0, 204, 51));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton4.setText("archiver");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(590, 370, 80, 30);

        jLabel1.setBackground(new java.awt.Color(0, 204, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application_gestiondesconcours/calendrier.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 717, 450);

        jTabbedPane1.addTab("archiver_dossier", jPanel2);

        jMenu1.setText("Archivage");
        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try{
    JFileChooser fc=new JFileChooser();
    fc.showOpenDialog(null);
    File F=fc.getSelectedFile();
    String filename=F.getAbsolutePath();
    jTextField1.setText(filename);}
catch(Exception e){
  JOptionPane.showMessageDialog(null,e);  
}
}//GEN-LAST:event_jButton1ActionPerformed

private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextField1ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
try{
    String filePath=jTextField1.getText();
    String D1=filePath.substring(0,filePath.lastIndexOf('.'));
    System.out.println(D1);
    String D2=filePath.substring(filePath.lastIndexOf('\\')+1,filePath.length());
    System.out.println(D2);
    String D3=D2.substring(0,D2.lastIndexOf('.'));
    System.out.println(D3);
    FileInputStream fis = new FileInputStream(filePath);
    ZipOutputStream zos=new ZipOutputStream (new FileOutputStream(D1.concat(".zip")));
    zos.putNextEntry(new ZipEntry(D3.concat(".pdf")));
    byte[] buffer=new byte[1024];
    int bytesRead;
    while((bytesRead=fis.read(buffer))>0){
        zos.write(buffer,0,bytesRead);
        }
    zos.closeEntry();
    zos.close(); 
    fis.close();
    JOptionPane.showMessageDialog(null,"archivage valide,l'emplacement"
            + " d'archive est celle du fichier");
}
catch(Exception e){
   JOptionPane.showMessageDialog(null,"error");
} 
}//GEN-LAST:event_jButton3ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  try{
    JFolderChooser fc=new JFolderChooser();
    fc.showOpenDialog(null);
    File F=fc.getSelectedFile();
    String foldername=F.getAbsolutePath();
    jTextField2.setText(foldername);}
  catch(Exception e){
    JOptionPane.showMessageDialog(null,e);  
 }
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
try{
    String folderPath=jTextField2.getText();
    zipFolder(folderPath,folderPath.concat(".zip"));
    JOptionPane.showMessageDialog(null,"archivage valide,"
        + " l'emplacement d'archive est celle du dossier");
}
catch (Exception e){
  JOptionPane.showMessageDialog(null,e);  
}   
}//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Archivage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Archivage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Archivage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Archivage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Archivage().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}