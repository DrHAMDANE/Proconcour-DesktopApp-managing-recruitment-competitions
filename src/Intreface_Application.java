
package application_gestiondesconcours;
import java.sql.*;
import javax.swing.*;
import java.awt.Toolkit;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class Intreface_Application extends javax.swing.JFrame {

    Connection conn=null;
   ResultSet rs=null;
   PreparedStatement pst=null;
    private int port;
    
   public Intreface_Application() {
                
       initComponents();
         conn=ConnectJavaSql.ConnectDb();
    Icon rolloverIcon1 = new ImageIcon("C:\\Users\\GHANYA\\Documents\\NetBeansProjects\\Application_GestionDesConcours\\src\\application_gestiondesconcours\\4.png");
    QR_Button.setRolloverIcon(rolloverIcon1);
    Icon rolloverIcon2 = new ImageIcon("C:\\Users\\GHANYA\\Documents\\NetBeansProjects\\Application_GestionDesConcours\\src\\application_gestiondesconcours\\3.png");
    FILTRAGE_Button.setRolloverIcon(rolloverIcon2);
    Icon rolloverIcon3 = new ImageIcon("C:\\Users\\GHANYA\\Documents\\NetBeansProjects\\Application_GestionDesConcours\\src\\application_gestiondesconcours\\1.png");
    RESET_Button.setRolloverIcon(rolloverIcon3);
    Icon rolloverIcon4 = new ImageIcon("C:\\Users\\GHANYA\\Documents\\NetBeansProjects\\Application_GestionDesConcours\\src\\application_gestiondesconcours\\8.png");
    CALENDER_Button.setRolloverIcon(rolloverIcon4);
    Icon rolloverIcon5 = new ImageIcon("C:\\Users\\GHANYA\\Documents\\NetBeansProjects\\Application_GestionDesConcours\\src\\application_gestiondesconcours\\7.png");
    Archivage_Button.setRolloverIcon(rolloverIcon5);
    Icon rolloverIcon6 = new ImageIcon("C:\\Users\\GHANYA\\Documents\\NetBeansProjects\\Application_GestionDesConcours\\src\\application_gestiondesconcours\\6.png");
    RESULTAT_Button.setRolloverIcon(rolloverIcon6);
    Icon rolloverIcon7 = new ImageIcon("C:\\Users\\GHANYA\\Documents\\NetBeansProjects\\Application_GestionDesConcours\\src\\application_gestiondesconcours\\5.png");
    MAIL_Button.setRolloverIcon(rolloverIcon7);
    Icon rolloverIcon8 = new ImageIcon("C:\\Users\\GHANYA\\Documents\\NetBeansProjects\\Application_GestionDesConcours\\src\\application_gestiondesconcours\\2.png");
   ANNONCE_Button.setRolloverIcon(rolloverIcon8);
    }
   
   
public void close(){
 WindowEvent WinClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
 Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(WinClosingEvent);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        HELP_Button = new javax.swing.JButton();
        GMAIL_Button = new javax.swing.JButton();
        FACEBOOK_Button = new javax.swing.JButton();
        WEBSITE_Button = new javax.swing.JButton();
        TWITER_Button = new javax.swing.JButton();
        YOUTUBE_Button = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        RESULTAT_Button = new javax.swing.JButton();
        RESET_Button = new javax.swing.JButton();
        ANNONCE_Button = new javax.swing.JButton();
        CALENDER_Button = new javax.swing.JButton();
        Archivage_Button = new javax.swing.JButton();
        MAIL_Button = new javax.swing.JButton();
        FILTRAGE_Button = new javax.swing.JButton();
        QR_Button = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LOGICON_APPLICATION");
        setFocusableWindowState(false);
        getContentPane().setLayout(null);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application_gestiondesconcours/rsz_1rsz_contact-us.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 360, 130, 120);

        HELP_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application_gestiondesconcours/Process-Info-icon.png"))); // NOI18N
        HELP_Button.setContentAreaFilled(false);
        HELP_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HELP_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HELP_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(HELP_Button);
        HELP_Button.setBounds(10, 210, 70, 70);

        GMAIL_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application_gestiondesconcours/google.png"))); // NOI18N
        GMAIL_Button.setContentAreaFilled(false);
        GMAIL_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GMAIL_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GMAIL_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(GMAIL_Button);
        GMAIL_Button.setBounds(270, 430, 70, 50);

        FACEBOOK_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application_gestiondesconcours/78.png"))); // NOI18N
        FACEBOOK_Button.setContentAreaFilled(false);
        FACEBOOK_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FACEBOOK_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FACEBOOK_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(FACEBOOK_Button);
        FACEBOOK_Button.setBounds(120, 430, 70, 50);

        WEBSITE_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application_gestiondesconcours/rsz_domain-icon-27.png"))); // NOI18N
        WEBSITE_Button.setContentAreaFilled(false);
        WEBSITE_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        WEBSITE_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WEBSITE_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(WEBSITE_Button);
        WEBSITE_Button.setBounds(10, 110, 70, 80);

        TWITER_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application_gestiondesconcours/78542.png"))); // NOI18N
        TWITER_Button.setContentAreaFilled(false);
        TWITER_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TWITER_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TWITER_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(TWITER_Button);
        TWITER_Button.setBounds(220, 430, 70, 50);

        YOUTUBE_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application_gestiondesconcours/69.png"))); // NOI18N
        YOUTUBE_Button.setContentAreaFilled(false);
        YOUTUBE_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        YOUTUBE_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YOUTUBE_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(YOUTUBE_Button);
        YOUTUBE_Button.setBounds(170, 430, 70, 50);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(100, 100, 220, 0);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Copyright©2016-2017   Tout droits réservés");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(750, 460, 280, 20);

        RESULTAT_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application_gestiondesconcours/checklist_128.png"))); // NOI18N
        RESULTAT_Button.setBorder(null);
        RESULTAT_Button.setContentAreaFilled(false);
        RESULTAT_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RESULTAT_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESULTAT_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(RESULTAT_Button);
        RESULTAT_Button.setBounds(560, 280, 129, 130);

        RESET_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application_gestiondesconcours/Places-trash-full-icon.png"))); // NOI18N
        RESET_Button.setContentAreaFilled(false);
        RESET_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RESET_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESET_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(RESET_Button);
        RESET_Button.setBounds(870, 250, 129, 100);

        ANNONCE_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application_gestiondesconcours/Announcements-icon.png"))); // NOI18N
        ANNONCE_Button.setContentAreaFilled(false);
        ANNONCE_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ANNONCE_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANNONCE_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ANNONCE_Button);
        ANNONCE_Button.setBounds(590, 90, 110, 90);

        CALENDER_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application_gestiondesconcours/agenda.png"))); // NOI18N
        CALENDER_Button.setContentAreaFilled(false);
        CALENDER_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CALENDER_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CALENDER_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CALENDER_Button);
        CALENDER_Button.setBounds(810, 350, 129, 100);

        Archivage_Button.setFont(new java.awt.Font("Tahoma", 1, 14));
        Archivage_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application_gestiondesconcours/Archive(1).png"))); // NOI18N
        Archivage_Button.setBorder(null);
        Archivage_Button.setContentAreaFilled(false);
        Archivage_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Archivage_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Archivage_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Archivage_Button);
        Archivage_Button.setBounds(680, 350, 140, 120);

        MAIL_Button.setFont(new java.awt.Font("Tahoma", 1, 14));
        MAIL_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application_gestiondesconcours/email-server-png-5.png"))); // NOI18N
        MAIL_Button.setBorder(null);
        MAIL_Button.setContentAreaFilled(false);
        MAIL_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MAIL_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAIL_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(MAIL_Button);
        MAIL_Button.setBounds(530, 170, 130, 150);

        FILTRAGE_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FILTRAGE_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application_gestiondesconcours/filter_data.png"))); // NOI18N
        FILTRAGE_Button.setBorder(null);
        FILTRAGE_Button.setContentAreaFilled(false);
        FILTRAGE_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FILTRAGE_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FILTRAGE_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(FILTRAGE_Button);
        FILTRAGE_Button.setBounds(870, 100, 110, 160);

        QR_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        QR_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application_gestiondesconcours/qr-code-scan.png"))); // NOI18N
        QR_Button.setBorder(null);
        QR_Button.setContentAreaFilled(false);
        QR_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        QR_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QR_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(QR_Button);
        QR_Button.setBounds(720, 50, 150, 130);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Pour La Gestion Des Concours");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 40, 220, 20);

        jLabel4.setFont(new java.awt.Font("Algerian", 3, 36));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("LOGICON");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 10, 170, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application_gestiondesconcours/slogon_app.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 70, 70);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 52, 54);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application_gestiondesconcours/interface_backgroung (2).jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1050, 490);

        jButton3.setText("jButton3");
        getContentPane().add(jButton3);
        jButton3.setBounds(460, 270, 73, 23);

        jMenu1.setText("Interface principale");
        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 1067, 551);
    }// </editor-fold>//GEN-END:initComponents

private void Archivage_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Archivage_ButtonActionPerformed
try{
    Archivage arv=new Archivage();
    arv.setVisible(true);
    QR_Button.setEnabled(false);
    FILTRAGE_Button.setEnabled(false);
    RESET_Button.setEnabled(false);
    CALENDER_Button.setEnabled(false);
    RESULTAT_Button.setEnabled(false);
    MAIL_Button.setEnabled(false);
    ANNONCE_Button.setEnabled(false);
    arv.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    arv.addWindowListener(new WindowAdapter() {
    @Override
    public void windowClosing(WindowEvent e) {
    QR_Button.setEnabled(true);
    FILTRAGE_Button.setEnabled(true);
    RESET_Button.setEnabled(true);
    CALENDER_Button.setEnabled(true);
    RESULTAT_Button.setEnabled(true);
    MAIL_Button.setEnabled(true);
    ANNONCE_Button.setEnabled(true);
                 }
            });
}
catch(Exception e){
    JOptionPane.showMessageDialog(null,e);
}
}//GEN-LAST:event_Archivage_ButtonActionPerformed

private void ANNONCE_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANNONCE_ButtonActionPerformed
     Runtime runtime=Runtime.getRuntime();
     try{
        ProcessBuilder builder = new ProcessBuilder(new String[] 
        { "cmd.exe", "/C", "C:\\Program Files (x86)\\Foxit Software\\Foxit Reader\\FoxitReader.exe"});
        Process newProcess = builder.start();
     runtime.exec(new String[]{"C:\\Program Files (x86)\\Foxit Software\\Foxit Reader\\FoxitReader.exe",
                               "C:\\Users\\GHANYA\\Documents\\NetBeansProjects\\Application_GestionDesConcours\\"
                               + " src\\application_gestiondesconcours\\offre_emploi.pdf"});
     }
    catch(Exception e){
    JOptionPane.showMessageDialog(null,e); 
 }
}//GEN-LAST:event_ANNONCE_ButtonActionPerformed

private void QR_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QR_ButtonActionPerformed
  try{
  CodeurDecodeurQR q=new CodeurDecodeurQR();
  q.setVisible(true);
  q.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
  Archivage_Button.setEnabled(false);
  FILTRAGE_Button.setEnabled(false);
  RESET_Button.setEnabled(false);
  CALENDER_Button.setEnabled(false);
  RESULTAT_Button.setEnabled(false);
  MAIL_Button.setEnabled(false);
  ANNONCE_Button.setEnabled(false);
  q.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
  q.addWindowListener(new WindowAdapter() {
  @Override
  public void windowClosing(WindowEvent e) {
  Archivage_Button.setEnabled(true);
  FILTRAGE_Button.setEnabled(true);
  RESET_Button.setEnabled(true);
  CALENDER_Button.setEnabled(true);
  RESULTAT_Button.setEnabled(true);
  MAIL_Button.setEnabled(true);
  ANNONCE_Button.setEnabled(true);
                 }});
}//GEN-LAST:event_QR_ButtonActionPerformed
catch(Exception e){
    JOptionPane.showMessageDialog(null,e); 
 }
} 


private void FILTRAGE_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FILTRAGE_ButtonActionPerformed
  SelectionDesListes s=new SelectionDesListes();
  s.setVisible(true);
  QR_Button.setEnabled(false);
  Archivage_Button.setEnabled(false);
  RESET_Button.setEnabled(false);
  CALENDER_Button.setEnabled(false);
  RESULTAT_Button.setEnabled(false);
  MAIL_Button.setEnabled(false);
  ANNONCE_Button.setEnabled(false);
  s.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
  s.addWindowListener(new WindowAdapter() {
  @Override
  public void windowClosing(WindowEvent e) {
  QR_Button.setEnabled(true);
  Archivage_Button.setEnabled(true);
  RESET_Button.setEnabled(true);
  CALENDER_Button.setEnabled(true);
  RESULTAT_Button.setEnabled(true);
  MAIL_Button.setEnabled(true);
  ANNONCE_Button.setEnabled(true);
                 }
            });
}//GEN-LAST:event_FILTRAGE_ButtonActionPerformed

private void MAIL_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAIL_ButtonActionPerformed
try{
    EnvoiConvocation con=new EnvoiConvocation();
    con.setVisible(true);
    con.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    QR_Button.setEnabled(false);
    Archivage_Button.setEnabled(false);
    RESET_Button.setEnabled(false);
    CALENDER_Button.setEnabled(false);
    RESULTAT_Button.setEnabled(false);
    FILTRAGE_Button.setEnabled(false);
    ANNONCE_Button.setEnabled(false);
    con.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    con.addWindowListener(new WindowAdapter() {
    @Override
    public void windowClosing(WindowEvent e) {
    QR_Button.setEnabled(true);
    Archivage_Button.setEnabled(true);
    RESET_Button.setEnabled(true);
    CALENDER_Button.setEnabled(true);
    RESULTAT_Button.setEnabled(true);
    FILTRAGE_Button.setEnabled(true);
    ANNONCE_Button.setEnabled(true);            
                 }});
}
catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
}
}//GEN-LAST:event_MAIL_ButtonActionPerformed

private void CALENDER_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CALENDER_ButtonActionPerformed
  Calender c=new Calender();
  c.setVisible(true);
  QR_Button.setEnabled(false);
  FILTRAGE_Button.setEnabled(false);
  RESET_Button.setEnabled(false);
  Archivage_Button.setEnabled(false);
  RESULTAT_Button.setEnabled(false);
  MAIL_Button.setEnabled(false);
  ANNONCE_Button.setEnabled(false);
  c.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
  c.addWindowListener(new WindowAdapter() {
 @Override
  public void windowClosing(WindowEvent e) {
  QR_Button.setEnabled(true);
  Archivage_Button.setEnabled(true);
  RESET_Button.setEnabled(true);
  MAIL_Button.setEnabled(true);
  RESULTAT_Button.setEnabled(true);
  FILTRAGE_Button.setEnabled(true);
  ANNONCE_Button.setEnabled(true);    
                
                 }
            });
}//GEN-LAST:event_CALENDER_ButtonActionPerformed

private void RESULTAT_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESULTAT_ButtonActionPerformed
try{
    Classement_Candidats c=new Classement_Candidats();
    c.setVisible(true);
    QR_Button.setEnabled(false);
    FILTRAGE_Button.setEnabled(false);
    RESET_Button.setEnabled(false);
    CALENDER_Button.setEnabled(false);
    Archivage_Button.setEnabled(false);
    MAIL_Button.setEnabled(false);
    ANNONCE_Button.setEnabled(false);
    c.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    c.addWindowListener(new WindowAdapter() {
    @Override
    public void windowClosing(WindowEvent e) {
    QR_Button.setEnabled(true);
    FILTRAGE_Button.setEnabled(true);
    RESET_Button.setEnabled(true);
    CALENDER_Button.setEnabled(true);
    Archivage_Button.setEnabled(true);
    MAIL_Button.setEnabled(true);
    ANNONCE_Button.setEnabled(true);
                 }
            });
}//GEN-LAST:event_RESULTAT_ButtonActionPerformed
catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    
}}
private void RESET_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESET_ButtonActionPerformed
int p=JOptionPane.showConfirmDialog(null,"voulez vous réinitialiser votre"
        + " base de données","Réinitatiser",JOptionPane.YES_NO_OPTION);
 if(p==0){
  try{
     String sql1="delete from liste_inscris";
     pst=conn.prepareStatement(sql1); pst.execute();
     String sql2="delete from liste_candidats";
     pst=conn.prepareStatement(sql2);pst.execute();
     String sql3="delete  from liste_admis";
     pst=conn.prepareStatement(sql3);pst.execute();
     String sql4="delete from liste_attentes";
     pst=conn.prepareStatement(sql4);pst.execute();
     String sql5="delete from matiere";
     pst=conn.prepareStatement(sql5);pst.execute();
      String sql6="delete from classement";
     pst=conn.prepareStatement(sql5);pst.execute();
      String sql7="delete from notation";
     pst=conn.prepareStatement(sql5);pst.execute();
      String sql8="delete from resultat";
     pst=conn.prepareStatement(sql5);pst.execute();
     JOptionPane.showMessageDialog(null,"votre base de"
             + " données a été réintialiser");  
  }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
    }  
}
}//GEN-LAST:event_RESET_ButtonActionPerformed
  
private void YOUTUBE_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YOUTUBE_ButtonActionPerformed
try{
    String URL ="https://www.youtoube.com/";
    java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));
}
catch(Exception e){
    JOptionPane.showMessageDialog(null, e.getMessage());
}                                               

}//GEN-LAST:event_YOUTUBE_ButtonActionPerformed

private void WEBSITE_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WEBSITE_ButtonActionPerformed
 try {
        Runtime runtime=Runtime.getRuntime();
        ProcessBuilder builder = new ProcessBuilder(new String[] 
        { "cmd.exe", "/C", "C:\\wamp\\wampmanager.exe"});
        Process newProcess = builder.start();
        runtime.exec(new String[]{"C:\\Program Files (x86)\\"
                + " baidu\\Baidu Browser\\spark.exe","http://localhost/ProConcours/"});
 }
catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
}
}//GEN-LAST:event_WEBSITE_ButtonActionPerformed

private void HELP_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HELP_ButtonActionPerformed
Help h=new Help();
h.setVisible(true);
}//GEN-LAST:event_HELP_ButtonActionPerformed

private void FACEBOOK_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FACEBOOK_ButtonActionPerformed
try{
    String URL ="https://www.facebook.com/";
    java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));
}
catch(Exception e){
    JOptionPane.showMessageDialog(null, e.getMessage());
}//GEN-LAST:event_FACEBOOK_ButtonActionPerformed
}

private void TWITER_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TWITER_ButtonActionPerformed
try{
    String URL ="https://www.Twitter.com/";
    java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));
}
catch(Exception e){
    JOptionPane.showMessageDialog(null, e.getMessage());
}//GEN-LAST:event_TWITER_ButtonActionPerformed
}

private void GMAIL_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GMAIL_ButtonActionPerformed
try{
    String URL ="https://www.Gmail.com/";
    java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));
}
catch(Exception e){
    JOptionPane.showMessageDialog(null, e.getMessage());
}
}//GEN-LAST:event_GMAIL_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Intreface_Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Intreface_Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Intreface_Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Intreface_Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Intreface_Application().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton ANNONCE_Button;
    public javax.swing.JButton Archivage_Button;
    public javax.swing.JButton CALENDER_Button;
    public javax.swing.JButton FACEBOOK_Button;
    public javax.swing.JButton FILTRAGE_Button;
    public javax.swing.JButton GMAIL_Button;
    public javax.swing.JButton HELP_Button;
    public javax.swing.JButton MAIL_Button;
    public javax.swing.JButton QR_Button;
    public javax.swing.JButton RESET_Button;
    public javax.swing.JButton RESULTAT_Button;
    public javax.swing.JButton TWITER_Button;
    public javax.swing.JButton WEBSITE_Button;
    public javax.swing.JButton YOUTUBE_Button;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
