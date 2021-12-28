/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.UIManager.getString;


public class FonctionsMetier implements IMetier
{
    //ces 3 objets sont obligatoires pour faire les requetes 
    private ResultSet rs;
    private PreparedStatement ps;
    private Connection maCnx;
    
    @Override
    public Utilisateur VerifierIdentifiants(String login, String mdp) {
        Utilisateur u = null;
        try {
            maCnx=ConnexionBdd.getCnx();
            
            //on ecrit dans le ps la requete
            ps= maCnx.prepareStatement("Select idUser, nomUser, statutUser from users where loginUser = '"+login+"' AND pwdUser='"+mdp+"'");
            
            rs=ps.executeQuery();
            
            //rs.next retourne boolean donc si c'est vrai 
            if(rs.next())
            {
                //on met 1 car il ya une seule colonne 
                //car dans le select on a mit seulement le statutUser
                u = new Utilisateur(Integer.parseInt(rs.getString(1)), rs.getString(2),rs.getString(3));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return u;
    }

    @Override
    public ArrayList<Praticien> getAllPraticiens() {
        ArrayList<Praticien>mesPraticiens = new ArrayList <Praticien>();
        try {
            maCnx=ConnexionBdd.getCnx();
            //on ecrit dans le ps la requete
            ps= maCnx.prepareStatement("select PRA_NUM,PRA_NOM,PRA_PRENOM,PRA_ADRESSE,PRA_CP,PRA_VILLE,PRA_COEFNOTORIETE,typeCode from praticien");
            
            rs=ps.executeQuery();
            while(rs.next())
            {
                Praticien p = new Praticien((rs.getInt(1)),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
                mesPraticiens.add(p);
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesPraticiens;
    }

    @Override
    public ArrayList<Specialite> getAllSpecialite() {
          ArrayList<Specialite>mesSpecialites = new ArrayList <Specialite>();
        try {
            maCnx=ConnexionBdd.getCnx();
            //on ecrit dans le ps la requete
            ps= maCnx.prepareStatement("select SPE_CODE, SPE_LIBELLE from specialite");
            
            rs=ps.executeQuery();
            while(rs.next())
            {
                Specialite s = new Specialite((rs.getInt(1)),rs.getString(2));
                mesSpecialites.add(s);
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesSpecialites; 
    }

    @Override
    public ArrayList<Activite> getAllActivite() {
        ArrayList<Activite>mesActivites = new ArrayList <Activite>();
        try {
            maCnx=ConnexionBdd.getCnx();
            //on ecrit dans le ps la requete
            ps= maCnx.prepareStatement("select AC_NUM, AC_DATE, AC_LIEU, AC_THEME, AC_MOTIF from activite_compl");
            
            rs=ps.executeQuery();
            while(rs.next())
            {
                Activite a = new Activite((rs.getInt(1)),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
                mesActivites.add(a);
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesActivites; 
    }

    @Override
    public void insererSpecialite(int spe_code, String libelle) {
        try {        
            maCnx=ConnexionBdd.getCnx(); //initialiser la requete

            ps= maCnx.prepareStatement("INSERT INTO `specialite`(`SPE_CODE`, `SPE_LIBELLE`) VALUES ('"+spe_code+"','"+libelle+"')");
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @Override
    public ArrayList<Specialite> getAllSpecialiteByPraNum(int unNum) {
        ArrayList<Specialite>mesSpecialites = new ArrayList<Specialite>();
        try {
        maCnx=ConnexionBdd.getCnx();
        ps= maCnx.prepareStatement("SELECT SPE_CODE , SPE_LIBELLE FROM SPECIALITE INNER JOIN posseder on specialite.SPE_CODE = posseder.codeSpe where pra_num ="+unNum);
        rs=ps.executeQuery(); 
            while(rs.next())
            {
                Specialite s = new Specialite((rs.getInt(1)),rs.getString(2));
                mesSpecialites.add(s);
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesSpecialites;
     }

    @Override
    public int getLastIdPraticien() {
               int idPrat = 0;
        try {
            maCnx=ConnexionBdd.getCnx();
            ps=maCnx.prepareStatement("SELECT max(pra_num) from praticien");
            rs=ps.executeQuery();
            rs.next();
            idPrat = rs.getInt(1) + 1;
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idPrat;
    }
    
    
    @Override
    public void InsererPraticien(int num, String nom, String prenom, String adresse, String codePostal, String ville, double note, int typeCode) {
        try {
            maCnx=ConnexionBdd.getCnx();
            String maSQL = "INSERT INTO praticien(PRA_NUM,PRA_NOM,PRA_PRENOM,PRA_ADRESSE,PRA_CP,PRA_VILLE,PRA_COEFNOTORIETE,typeCode) VALUES ('"+num+"','"+nom+"','"+prenom+"','"+adresse+"','"+codePostal+"','"+ville+"','"+note+"','"+typeCode+"')";
            ps= maCnx.prepareStatement(maSQL);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<TypeCode> getAllTypeCode() {
        ArrayList<TypeCode>mesTypeCode = new ArrayList <TypeCode>();
        try {
            maCnx=ConnexionBdd.getCnx();
            //on ecrit dans le ps la requete
            ps= maCnx.prepareStatement("select TYP_CODE, TYP_LIBELLE from type_praticien");
            rs=ps.executeQuery();
            while(rs.next())
            {
                TypeCode tc = new TypeCode((rs.getInt(1)),rs.getString(2));
                mesTypeCode.add(tc);
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesTypeCode; 
    }

    @Override
    public void deleteSpecialitePraticien(int pra_num, int spe_code) {
        try {
            maCnx=ConnexionBdd.getCnx();
            String maSQL = "DELETE FROM  posseder where PRA_NUM = '"+pra_num+"' AND codeSpe ='"+spe_code+"'";
            ps= maCnx.prepareStatement(maSQL);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<Specialite> getAllNameSpe() {
        ArrayList<Specialite>mesNomSpecialites = new ArrayList<>();
        try {
            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("SELECT SPE_LIBELLE from specialite");
            rs = ps.executeQuery();
            
            while(rs.next()){
                Specialite ns = new Specialite(rs.getString(1));
                mesNomSpecialites.add(ns);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesNomSpecialites;
    } 

    @Override
    public ArrayList<Activite> getAllActivLieuDate() {
        ArrayList<Activite>mesLieuDateActivite = new ArrayList<>();
        try { 
            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("SELECT AC_NUM, AC_DATE, AC_LIEU from activite_compl");
            rs = ps.executeQuery();
            
            while(rs.next()){
                Activite adl = new Activite(rs.getInt(1),rs.getString(2),rs.getString(3));
                mesLieuDateActivite.add(adl);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesLieuDateActivite;
    }

    @Override
    public ArrayList<Praticien> getAllIdNomPrenomPrat() {
        ArrayList<Praticien>mesIdNomPrenomPrat = new ArrayList<>();
        try {
            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("SELECT PRA_NUM,PRA_NOM,PRA_PRENOM from praticien");
            rs= ps.executeQuery();
            
            while(rs.next()){
                Praticien pinp = new Praticien(rs.getInt(1),rs.getString(2),rs.getString(3));
                mesIdNomPrenomPrat.add(pinp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesIdNomPrenomPrat;
    }
    
}
