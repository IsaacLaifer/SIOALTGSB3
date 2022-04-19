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
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.UIManager.getString;


public class FonctionsMetier implements IMetier
{
    //ces 3 objets sont obligatoires pour faire les requetes 
    private ResultSet rs;
    private PreparedStatement ps;
    private Connection maCnx;
    
    @Override // Fonction qui permet de vérifier les identifants
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

    @Override // Fonction qui permet d'obtenir la liste des praticiens
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

    @Override // Fonction qui permet d'obtenir la liste des spécialités
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

    @Override // Fonction qui permet d'obtenir la liste des activités
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

    @Override // Fonction qui permet d'inserer une activiter
    public void insererSpecialite(int spe_code, String libelle) {
        try {        
            maCnx=ConnexionBdd.getCnx(); //initialiser la requete

            ps= maCnx.prepareStatement("INSERT INTO `specialite`(`SPE_CODE`, `SPE_LIBELLE`) VALUES ('"+spe_code+"','"+libelle+"')");
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @Override // Fonction qui permet d'avoir la liste des spécialités d'un praticien
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

    @Override // Fonction qui permet d'avoir l'id du dernier praticien et d'ajouter 1 pour avoir celui du nouveau
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
    
    
    @Override // Fonction qui permet d'inserer un praticien
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

    @Override // Fonction qui permet d'avoir la liste des type code
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

    @Override // Fonction qui permet de supprimer une spécialité d'un praticien
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

    @Override // Fonction qui permet d'avoir la liste des noms des spécialités
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

    @Override // Fonction qui permet d'avoir la liste des activités
    public ArrayList<Activite> getAllActivLieuDate() {
        ArrayList<Activite>mesLieuDateActivite = new ArrayList<>();
        try { 
            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("SELECT AC_NUM, AC_DATE, AC_LIEU, AC_THEME from activite_compl");
            rs = ps.executeQuery();
            
            while(rs.next()){
                Activite adl = new Activite(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
                mesLieuDateActivite.add(adl);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesLieuDateActivite;
    }

    @Override // Fonction qui permet d'avoir la liste des praticiens ( id , nom , prénom )
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

    @Override // Fonction qui permet d'avoir la liste des activités d'un praticien
    public ArrayList<Activite> getAllActiviteByPraNum(int unNum) {
        
        ArrayList<Activite>mesActiviteByNum = new ArrayList<>();
        
        try {
            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("SELECT AC_NUM, AC_DATE , AC_LIEU , AC_THEME  FROM activite_compl INNER JOIN praticien INNER JOIN inviter ON activite_compl.AC_NUM = inviter.AC_NUMERO WHERE inviter.PRA_NUMERO = praticien.PRA_NUM AND praticien.PRA_NUM ="+unNum);
            rs = ps.executeQuery();
            
            while(rs.next())
            {
                Activite andl = new Activite((rs.getInt(1)),rs.getString(2),rs.getString(3), rs.getString(4));
                mesActiviteByNum.add(andl);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return mesActiviteByNum;
    }

    @Override // Fonction qui permet d'insérer une activité
    public void InsererActivitie(int activNum, int praNumero, int speOn) {
        try {
            maCnx=ConnexionBdd.getCnx(); //initialiser la requete
            ps= maCnx.prepareStatement("INSERT INTO inviter(AC_NUMERO,PRA_NUMERO,SPECIALISTEON) VALUES ('"+activNum+"','"+praNumero+"','"+speOn+"')");
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override // Fonction qui permet de vérifier si un praticien à déjà l'activité
    public ArrayList<Activite> VerifierActivite(int praNum, int acNum) {
         ArrayList<Activite>mesActivites = new ArrayList<>();
        try {
            
            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("SELECT AC_NUM, AC_DATE , AC_LIEU , AC_THEME  FROM activite_compl INNER JOIN praticien INNER JOIN inviter ON activite_compl.AC_NUM = inviter.AC_NUMERO WHERE inviter.PRA_NUMERO = praticien.PRA_NUM AND praticien.PRA_NUM ='"+praNum+"' AND inviter.AC_NUMERO ='"+acNum+"'");
            rs = ps.executeQuery();
            
             while(rs.next())
            {
                Activite andl = new Activite((rs.getInt(1)),rs.getString(2),rs.getString(3), rs.getString(4));
                mesActivites.add(andl);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesActivites;
    }

    @Override // Fonction qui permet d'avoir le dernier id des spécialité et faire + 1 pour avoir celui a inserer
    public int getLastIdSpecialite() {
        int idSpe = 0;
        
          try {
              maCnx=ConnexionBdd.getCnx();
              ps=maCnx.prepareStatement("SELECT max(SPE_CODE) from specialite");
              rs=ps.executeQuery();
              rs.next();
              idSpe = rs.getInt(1) + 1;
          } catch (SQLException ex) {
              Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
          }
          return idSpe;        
    }

    @Override // Fonction qui permet de modifier la spécialité
    public void modifSpe(int unId, String unNom) {
        try {
            maCnx=ConnexionBdd.getCnx();
            String maSQL = "UPDATE specialite SET SPE_LIBELLE='"+unNom+"' WHERE SPE_CODE=" +unId+"";
            ps=maCnx.prepareStatement(maSQL);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override // Fonction qui permet d'avoir le typecode max des praticien
    public int maxcode() {
       int  code = 0;
        try {
            maCnx=ConnexionBdd.getCnx();
            ps=maCnx.prepareStatement("SELECT max(TYP_Code) from type_praticien");
            rs=ps.executeQuery();
            rs.next();
            code = rs.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return code;
    }

    @Override // Fonction qui permet de compter le nombre de praticien avec une note supérieur a celui en paramètre
    public int countNote(int uneNote) {
        int cNote = 0;
        try {
            maCnx=ConnexionBdd.getCnx();
            ps=maCnx.prepareStatement("SELECT COUNT(p.PRA_NUM) FROM praticien AS p WHERE p.PRA_COEFNOTORIETE >"+uneNote+"");
            rs=ps.executeQuery();
            rs.next();
            cNote=rs.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cNote;
    }

   
    // Fonction qui permet d'avoir la liste des praticien avec leurs note
    public HashMap<String,Integer> GetDatasGraphiqueNote() throws SQLException 
    {
        HashMap<String, Integer> datas = new HashMap();
        
        maCnx = ConnexionBdd.getCnx();
        ps = maCnx.prepareStatement("SELECT PRA_NOM , PRA_COEFNOTORIETE FROM praticien ORDER BY praticien.PRA_COEFNOTORIETE ASC");
            rs = ps.executeQuery();
            while(rs.next())
            {
                datas.put(rs.getString(1), rs.getInt(2));
            }
        
        return datas;
    }
    
    // Fonction qui permet d'avoir le nombre de praticien par spécialité
    public HashMap<Integer,String[]> GetDatasGraphique3()
    {
        HashMap<Integer,String[]> datas = new HashMap();
        try {
            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("SELECT specialite.spe_libelle, COUNT(praticien.pra_nom) , specialite.SPE_LIBELLE as t FROM specialite, praticien, posseder where posseder.pra_num=praticien.PRA_NUM and posseder.codeSpe=specialite.SPE_CODE GROUP BY specialite.spe_libelle");
            rs = ps.executeQuery();
            int cpt = 1;
            while(rs.next())
            {
                datas.put(cpt,new String[]{rs.getString(1), rs.getString(2),rs.getString(3)});
                cpt++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datas;
    }

    // Fonction qui permet d'avoir le typecode avec le libellé associé pour le combobox
    public int getTypeCode(String unLib) {
       int idtypcode = 0;
        
          try {
              maCnx=ConnexionBdd.getCnx();
              ps=maCnx.prepareStatement("SELECT TYP_CODE FROM type_praticien WHERE TYP_LIBELLE ='"+unLib+"'"); 
              rs=ps.executeQuery();
              rs.next();
              idtypcode = rs.getInt(1);
          } catch (SQLException ex) {
              Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
          }
          return idtypcode;    
    }
}
