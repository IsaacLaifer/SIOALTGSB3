/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vues;
import Entity.Activite;
import Entity.ConnexionBdd;
import Entity.FonctionsMetier;
import Model.ModelActivite;
import Model.ModelPraticien;
import Model.ModelSpecialite;
import java.util.ArrayList;
/**
 *
 * @author stelz
 */
public class frmAddActivite extends javax.swing.JFrame {

    FonctionsMetier fm;
    ModelPraticien mdlPraticien;
    ConnexionBdd cnx;
    
    public frmAddActivite() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPrat = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblActivite = new javax.swing.JTable();
        txtQstn = new javax.swing.JLabel();
        txtOui = new javax.swing.JLabel();
        txtNon = new javax.swing.JLabel();
        txtLog = new javax.swing.JLabel();
        lblAccueilMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 215, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(755, 800));
        jPanel1.setMinimumSize(new java.awt.Dimension(755, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(755, 800));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 37, 129));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ajouter une activitée à un praticien");

        tblPrat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblPrat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPratMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPrat);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 37, 129));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Séléctionner le praticien");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 37, 129));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Quelles activitées ?");

        tblActivite.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblActivite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblActiviteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblActivite);

        txtQstn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtQstn.setForeground(new java.awt.Color(0, 37, 129));
        txtQstn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtQstn.setText("Est-t-il spécialiste dans ce domaine?");

        txtOui.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        txtOui.setForeground(new java.awt.Color(0, 255, 0));
        txtOui.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtOui.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOuiMouseClicked(evt);
            }
        });

        txtNon.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        txtNon.setForeground(new java.awt.Color(255, 0, 0));
        txtNon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNonMouseClicked(evt);
            }
        });

        txtLog.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtLog.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblAccueilMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAccueilMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logoAcceuil.png"))); // NOI18N
        lblAccueilMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAccueilMenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblAccueilMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(257, 257, 257)
                                .addComponent(txtOui, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNon, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtQstn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtQstn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNon, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOui, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtLog, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAccueilMenu)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblPratMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPratMouseClicked
        //Mettre dans le tableau les activités
        ModelActivite mdlActivite = new ModelActivite();
        mdlActivite.LoadActiviteDateLieu(fm.getAllActivLieuDate());
        tblActivite.setModel(mdlActivite);
    }//GEN-LAST:event_tblPratMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        fm = new FonctionsMetier();
        cnx=new ConnexionBdd();
        
        //Mettre dans le tableau les praticiens
        ModelPraticien mdlPrat = new ModelPraticien();
        mdlPrat.LoadIdNomPrenomPrat(fm.getAllIdNomPrenomPrat());
        tblPrat.setModel(mdlPrat);
    
    }//GEN-LAST:event_formWindowOpened

    private void tblActiviteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblActiviteMouseClicked
      
        fm = new FonctionsMetier();
        cnx = new ConnexionBdd();
        
        //Vérifier si le praticien a déjà l'activité séléctioner en récupérant l'id du praticien et l'id de l'activité
        int acNum = Integer.parseInt(tblActivite.getValueAt(tblActivite.getSelectedRow(),0).toString());
        int praNum = Integer.parseInt(tblPrat.getValueAt(tblPrat.getSelectedRow(),0).toString());
         ArrayList <Activite> act=fm.VerifierActivite(praNum, acNum);
         if (act.isEmpty()){
                txtLog.setText("");
                txtQstn.setText("Est-t-il spécialiste dans ce domaine");
                txtOui.setText("oui");
                txtNon.setText("non");
              
         }else{
             txtQstn.setText("");
             txtOui.setText("");
             txtNon.setText("");
             txtLog.setText("Le praticien a déjà cette activité");
             
             
                   
         }
        
        
    }//GEN-LAST:event_tblActiviteMouseClicked

    private void txtOuiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOuiMouseClicked
        fm = new FonctionsMetier();
        cnx = new ConnexionBdd();
        
        // Insertion de l'activité si le praticien est spécialiste
        int acNum = Integer.parseInt(tblActivite.getValueAt(tblActivite.getSelectedRow(),0).toString());
        int praNum = Integer.parseInt(tblPrat.getValueAt(tblPrat.getSelectedRow(),0).toString());
        int speOn=1;
        fm.InsererActivitie(acNum, praNum, speOn);
        
          this.setVisible(false);
             frmAddActivite frmAdd = new frmAddActivite();
             frmAdd.setVisible(true);
    }//GEN-LAST:event_txtOuiMouseClicked

    private void txtNonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNonMouseClicked
        fm = new FonctionsMetier();
        cnx = new ConnexionBdd();
        
        // Insertion de l'activité si le praticien n'est pas spécialiste
        int acNum = Integer.parseInt(tblActivite.getValueAt(tblActivite.getSelectedRow(),0).toString());
        int praNum = Integer.parseInt(tblPrat.getValueAt(tblPrat.getSelectedRow(),0).toString());
        int speOn=0;
        fm.InsererActivitie(acNum, praNum, speOn);
        
        this.setVisible(false);
             frmAddActivite frmAdd = new frmAddActivite();
             frmAdd.setVisible(true);
    }//GEN-LAST:event_txtNonMouseClicked

    private void lblAccueilMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAccueilMenuMouseClicked
        this.setVisible(false);
        frmAccueilActiv frmAccActiv = new frmAccueilActiv();
        frmAccActiv.setVisible(true);
    }//GEN-LAST:event_lblAccueilMenuMouseClicked

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
            java.util.logging.Logger.getLogger(frmAddActivite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAddActivite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAddActivite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAddActivite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAddActivite().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAccueilMenu;
    private javax.swing.JTable tblActivite;
    private javax.swing.JTable tblPrat;
    private javax.swing.JLabel txtLog;
    private javax.swing.JLabel txtNon;
    private javax.swing.JLabel txtOui;
    private javax.swing.JLabel txtQstn;
    // End of variables declaration//GEN-END:variables
}
