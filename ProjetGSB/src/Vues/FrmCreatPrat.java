/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vues;

import Entity.ConnexionBdd;
import Entity.FonctionsMetier;
import Model.ModelTypeCode;

/**
 *
 * @author stelz
 */
public class FrmCreatPrat extends javax.swing.JFrame {

    FonctionsMetier fm;
    ModelTypeCode mdlTypeCode;
    
    /**
     * Creates new form FrmCreatPrat
     */
    public FrmCreatPrat() {
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
        jLabel2 = new javax.swing.JLabel();
        txtNumPrat = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNomPrat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtVillePrat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrenomPrat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNotePrat = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCodePostalPrat = new javax.swing.JTextField();
        txtAdressePrat = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTypePrat = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnInsererPrat = new javax.swing.JButton();
        lblAccueilMenu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTypeCode = new javax.swing.JTable();
        lblErreur = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 215, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(745, 800));
        jPanel1.setMinimumSize(new java.awt.Dimension(745, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(745, 800));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 37, 129));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INSERER UN PRATICIEN");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 37, 129));
        jLabel2.setText("Numéro du praticien");

        txtNumPrat.setEditable(false);
        txtNumPrat.setBackground(new java.awt.Color(166, 166, 166));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 37, 129));
        jLabel3.setText("Nom du praticien");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 37, 129));
        jLabel4.setText("Ville du praticien");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 37, 129));
        jLabel5.setText("Prénom  du praticien");

        txtPrenomPrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrenomPratActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 37, 129));
        jLabel6.setText("Note du praticien");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 37, 129));
        jLabel7.setText("Code postal du praticien");

        txtAdressePrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdressePratActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 37, 129));
        jLabel8.setText("Adresse du praticien");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 37, 129));
        jLabel9.setText("Type du praticien");

        btnInsererPrat.setBackground(new java.awt.Color(0, 0, 255));
        btnInsererPrat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnInsererPrat.setText("INSERER");
        btnInsererPrat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInsererPratMouseClicked(evt);
            }
        });

        lblAccueilMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAccueilMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/homeLogo.png"))); // NOI18N
        lblAccueilMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAccueilMenuMouseClicked(evt);
            }
        });

        tblTypeCode.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblTypeCode.setGridColor(new java.awt.Color(255, 0, 0));
        tblTypeCode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTypeCodeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTypeCode);

        lblErreur.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblErreur.setForeground(new java.awt.Color(255, 0, 0));
        lblErreur.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 37, 129));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Liste des type code");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAdressePrat)
                    .addComponent(txtNomPrat)
                    .addComponent(txtPrenomPrat)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                        .addComponent(txtNumPrat))
                    .addComponent(jLabel8))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCodePostalPrat)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtVillePrat)
                    .addComponent(txtNotePrat)
                    .addComponent(jLabel6)
                    .addComponent(txtTypePrat))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblErreur, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(btnInsererPrat, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblAccueilMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumPrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrenomPrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtVillePrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomPrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNotePrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAdressePrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTypePrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodePostalPrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addComponent(lblErreur, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnInsererPrat)
                .addGap(30, 30, 30)
                .addComponent(lblAccueilMenu)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ConnexionBdd cnx = new ConnexionBdd(); 
        fm = new FonctionsMetier();
        int idLastPrat = fm.getLastIdPraticien();
        txtNumPrat.setText(String.valueOf(idLastPrat));
        
        mdlTypeCode = new ModelTypeCode();
        mdlTypeCode.LoadTypeCode(fm.getAllTypeCode());
        tblTypeCode.setModel(mdlTypeCode);
    }//GEN-LAST:event_formWindowOpened

    private void txtPrenomPratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrenomPratActionPerformed
        
    }//GEN-LAST:event_txtPrenomPratActionPerformed

    private void btnInsererPratMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsererPratMouseClicked
        ConnexionBdd cnx = new ConnexionBdd();
        fm = new FonctionsMetier();
        
        if(txtPrenomPrat.getText().compareTo("")==0){
            lblErreur.setText("Entrer un prénom");
        }else if(txtNomPrat.getText().compareTo("")==0){
            lblErreur.setText("Entrer un nom");
        }else if(txtAdressePrat.getText().compareTo("")==0){
            lblErreur.setText("Entrer une adresse");
        }else if(txtCodePostalPrat.getText().compareTo("")==0){
            lblErreur.setText("Entrer un code postal");
        }else if(txtVillePrat.getText().compareTo("")==0){
            lblErreur.setText("Entrer la ville");
        }else if(txtNotePrat.getText().compareTo("")==0){
            lblErreur.setText("Entrer la note");
        }else if(txtTypePrat.getText().compareTo("")==0){
            lblErreur.setText("Entrer le type");
        }
        
        else{
        String TP = txtTypePrat.getText();
        String N = txtNotePrat.getText();
        double notePrat = Double.parseDouble(N);
        int typePrat = Integer.parseInt(TP);
        int idLastPrat = fm.getLastIdPraticien();
        fm.InsererPraticien(idLastPrat,txtNomPrat.getText(),txtPrenomPrat.getText(),txtAdressePrat.getText(),txtCodePostalPrat.getText(),txtVillePrat.getText(),notePrat,typePrat);
      
        }
        
    }//GEN-LAST:event_btnInsererPratMouseClicked

    private void lblAccueilMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAccueilMenuMouseClicked
        this.setVisible(false);
        frmAccueilPrat frmAccPrat = new frmAccueilPrat();
        frmAccPrat.setVisible(true);
    }//GEN-LAST:event_lblAccueilMenuMouseClicked

    private void tblTypeCodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTypeCodeMouseClicked
        String typeCode = tblTypeCode.getValueAt(tblTypeCode.getSelectedRow(),0).toString();
        txtTypePrat.setText(typeCode);
    }//GEN-LAST:event_tblTypeCodeMouseClicked

    private void txtAdressePratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdressePratActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdressePratActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCreatPrat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCreatPrat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCreatPrat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCreatPrat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCreatPrat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsererPrat;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAccueilMenu;
    private javax.swing.JLabel lblErreur;
    private javax.swing.JTable tblTypeCode;
    private javax.swing.JTextField txtAdressePrat;
    private javax.swing.JTextField txtCodePostalPrat;
    private javax.swing.JTextField txtNomPrat;
    private javax.swing.JTextField txtNotePrat;
    private javax.swing.JTextField txtNumPrat;
    private javax.swing.JTextField txtPrenomPrat;
    private javax.swing.JTextField txtTypePrat;
    private javax.swing.JTextField txtVillePrat;
    // End of variables declaration//GEN-END:variables
}
