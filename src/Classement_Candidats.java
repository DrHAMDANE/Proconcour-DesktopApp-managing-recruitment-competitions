
package application_gestiondesconcours;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Classement_Candidats extends javax.swing.JFrame {

    Connection conn=null;
   ResultSet rs=null;
   PreparedStatement pst=null;
    public Classement_Candidats() {
        initComponents();
        conn=ConnectJavaSql.ConnectDb();

    }
    
    private void update_Matiere(){
    try{
    String sql="select * from matiere";
    pst=conn.prepareStatement(sql);
     rs=pst.executeQuery();
  jTable1.setModel(DbUtils.resultSetToTableModel(rs));
    }
    catch(Exception e){
     JOptionPane.showMessageDialog(null, e);
    }
}
    private void update_Notation(){
    try{
    String sql="select * from notation";
    pst=conn.prepareStatement(sql);
     rs=pst.executeQuery();
  jTable2.setModel(DbUtils.resultSetToTableModel(rs));
    }
    catch(Exception e){
     JOptionPane.showMessageDialog(null, e);
    }
    
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane3 = new javax.swing.JTabbedPane();
        jSlider1 = new javax.swing.JSlider();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        codeMatiere = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        coefMatiere = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        NomMatiere = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        n_inscrip = new javax.swing.JTextField();
        codeMat = new javax.swing.JTextField();
        coefMat = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        nbr_postes = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("APPLICATION_LOGICON");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(102, 0, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Matière", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("  Code Matière");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(10, 110, 108, 17);
        jPanel3.add(codeMatiere);
        codeMatiere.setBounds(130, 110, 120, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Coeff Matière");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(10, 160, 96, 17);
        jPanel3.add(coefMatiere);
        coefMatiere.setBounds(130, 160, 120, 30);

        jButton1.setText("Insérer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(60, 230, 67, 23);

        jButton3.setText("Vider");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(150, 230, 68, 23);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nom Matière");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(20, 60, 100, 20);
        jPanel3.add(NomMatiere);
        NomMatiere.setBounds(130, 60, 120, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(30, 70, 290, 290);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(370, 20, 410, 440);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application_gestiondesconcours/37.jpg"))); // NOI18N
        jLabel8.setLabelFor(codeMatiere);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 0, 820, 490);

        jTabbedPane1.addTab("Matière", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(jTable2);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(380, 30, 393, 402);

        jPanel4.setBackground(new java.awt.Color(204, 51, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Notation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel3.setText("N°inscription");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel6.setText("Code Matière");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel7.setText("Note Matière");

        n_inscrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n_inscripActionPerformed(evt);
            }
        });

        coefMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coefMatActionPerformed(evt);
            }
        });

        jButton2.setText("Insérer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Vider");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(2, 2, 2)))
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(coefMat, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(codeMat, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(n_inscrip, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                .addGap(53, 53, 53))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n_inscrip, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(codeMat, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(coefMat, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        jPanel2.add(jPanel4);
        jPanel4.setBounds(38, 96, 312, 292);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application_gestiondesconcours/36.jpg"))); // NOI18N
        jPanel2.add(jLabel10);
        jLabel10.setBounds(0, 0, 820, 490);

        jTabbedPane1.addTab("Notation", jPanel2);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jPanel5.add(jScrollPane3);
        jScrollPane3.setBounds(312, 20, 490, 402);

        jPanel6.setBackground(new java.awt.Color(51, 153, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Postes Ouverts", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nbr Postes Ouverts");

        jButton5.setText("classer");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(nbr_postes, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(nbr_postes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButton5)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel6);
        jPanel6.setBounds(10, 124, 300, 211);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application_gestiondesconcours/35.jpg"))); // NOI18N
        jPanel5.add(jLabel9);
        jLabel9.setBounds(0, 0, 820, 480);

        jTabbedPane1.addTab("Classement", jPanel5);

        jMenu1.setText("Gestion des notes");
        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try
{    String sql="insert into matiere(nomMat,codeMat,coefMat)values(?,?,?)";
     pst=conn.prepareStatement(sql);
     pst.setString(1,NomMatiere.getText());
     pst.setString(2,codeMatiere.getText());
     pst.setString(3,coefMatiere.getText());
     pst.execute();    
}
     catch(Exception e){
     JOptionPane.showMessageDialog(null, e);}
     update_Matiere();   
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
try
{    String sql="delete from matiere";
     pst=conn.prepareStatement(sql);
     pst.execute();
     jTable1.setModel(DbUtils.resultSetToTableModel(rs));
}
     catch(Exception e){
     JOptionPane.showMessageDialog(null, e);}
 
}//GEN-LAST:event_jButton3ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
try
{    String sql="insert into notation(N_INSCRI,CodeMat,NoteMat)values(?,?,?)";
     pst=conn.prepareStatement(sql);
     pst.setString(1,n_inscrip.getText());
     pst.setString(2,codeMat.getText());
     pst.setString(3,coefMat.getText());
     pst.execute();
     
}
     catch(Exception e){
     JOptionPane.showMessageDialog(null, e);}
     update_Notation();
}//GEN-LAST:event_jButton2ActionPerformed

private void coefMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coefMatActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_coefMatActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
try
{    String sql="delete from notation";
     pst=conn.prepareStatement(sql);
     pst.execute();
     jTable2.setModel(DbUtils.resultSetToTableModel(rs));
}
     catch(Exception e){
     JOptionPane.showMessageDialog(null, e);}
}//GEN-LAST:event_jButton4ActionPerformed

private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
try{
 String sql=" declare "
         + " CURSOR candidat_note IS "
         + " SELECT liste_candidats.n_inscri, nom, prenom, date_nais,MATIERE.codemat, "
         + " ((NVL(noteMat,0)*coefMat))note "
         + " FROM liste_candidats, NOTATION, MATIERE "
         + " WHERE liste_candidats.n_inscri=NOTATION.n_inscri "
         + " AND NOTATION.codemat=MATIERE.codemat; "
         + " nbe INTEGER; "
         + " rg INTEGER; "
         + " moy NUMBER(5,2); "
         + " aucun_candidat EXCEPTION; "
         + " i INTEGER;"
         + " CURSOR candidat_classe IS"
         + " SELECT n_inscri, nom, prenom, date_nais,(SUM(moyMat)/SUM(coefMat))moyenne"
         + " FROM RESULTAT,matiere"
         + " GROUP BY n_inscri, nom, prenom, date_nais"
         + " ORDER BY moyenne DESC;"
         + " CURSOR candidat_non_note IS"
         + " SELECT n_inscri, nom,prenom,date_nais FROM liste_candidats"
         + " WHERE n_inscri NOT IN (SELECT DISTINCT n_inscri FROM NOTATION);"
         + " BEGIN"
         + " DELETE FROM RESULTAT;"
         + " DELETE FROM CLASSEMENT;"
         + " SELECT COUNT(*) INTO nbe FROM liste_candidats;"
         + " IF nbe=0 THEN"
         + " RAISE aucun_candidat;"
         + " END IF;"
         + " FOR e IN candidat_note LOOP"
         + " INSERT INTO RESULTAT"
         + " VALUES (e.n_inscri,e.nom,e.prenom,e.date_nais,e.codemat,e.note);"
         + " END LOOP;"
         + " FOR f IN candidat_non_note LOOP"
         + " INSERT INTO RESULTAT"
         + " VALUES (f.n_inscri,f.nom,f.prenom,f.date_nais,NULL,0);"
         + " END LOOP;"
         + " moy:=21;"
         + " rg:=-1;"
         + " i:=1;"
         + " FOR f IN candidat_classe LOOP"
         + " IF moy>f.moyenne THEN"
         + " rg:=i;"
         + " END IF;"
         + " INSERT INTO CLASSEMENT"
         + " VALUES (f.n_inscri, f.nom, f.prenom, f.date_nais, f.moyenne, rg); "
         + " moy:=f.moyenne;"
         + " i:=i+1;"
         + " END LOOP;"
         + " COMMIT;"
         + " EXCEPTION"
         + " WHEN aucun_candidat THEN"
         + " INSERT INTO RESULTAT"
         + " VALUES(0,'Aucun etudiant',NULL,NULL,NULL,NULL);"
         + " END;";
   
 CallableStatement cs = conn.prepareCall(sql);
cs.execute();
String sql1="declare"
        + " CURSOR classement_candidats IS"
        + " select * FROM classement where (moyenne >= 10.00);"
        + " nbr_p INTEGER := ?; "
        + " np INTEGER;"
        + " comp INTEGER;"
        + " aucun_admis EXCEPTION;"
        + " begin"
        + " delete from liste_admis;"
        + " delete from liste_attentes;"
        + " comp:=nbr_p;"
        + " for e in classement_candidats loop"
        + " begin"
        + " if (e.rang <= nbr_p and comp >=1) then"
        + " insert into liste_admis values(e.n_inscri, e.nom, e.prenom, e.date_nais, e.moyenne, e.rang);"
        + " comp:=comp-1;"
        + " else "
        + " insert into liste_attentes values(e.n_inscri, e.nom, e.prenom, e.date_nais, e.moyenne, e.rang);"
        + " end if;"
        + " end;"
        + " END LOOP;"
        + " SELECT COUNT(*) INTO np FROM liste_admis;"
        + " IF np=0 THEN RAISE aucun_admis;"
        + " END IF;"
        + " EXCEPTION"
        + " WHEN aucun_admis THEN"
        + " DBMS_OUTPUT.PUT_LINE('AUCUN ADMIS');"
        + " END;";
      CallableStatement cs1 = conn.prepareCall(sql1);
      cs1.setString(1,nbr_postes.getText());cs1.execute();
      String sqls=" select * from CLASSEMENT";
     pst=conn.prepareStatement(sqls); rs=pst.executeQuery();
     jTable3.setModel(DbUtils.resultSetToTableModel(rs));}
     catch(Exception e){
            JOptionPane.showMessageDialog(null, e);}
}//GEN-LAST:event_jButton5ActionPerformed

private void n_inscripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n_inscripActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_n_inscripActionPerformed

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
            java.util.logging.Logger.getLogger(Classement_Candidats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Classement_Candidats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Classement_Candidats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Classement_Candidats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Classement_Candidats().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NomMatiere;
    private javax.swing.JTextField codeMat;
    private javax.swing.JTextField codeMatiere;
    private javax.swing.JTextField coefMat;
    private javax.swing.JTextField coefMatiere;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField n_inscrip;
    private javax.swing.JTextField nbr_postes;
    // End of variables declaration//GEN-END:variables
}
