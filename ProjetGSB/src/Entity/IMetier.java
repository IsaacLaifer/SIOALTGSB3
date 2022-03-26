/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.ArrayList;

public interface IMetier 
{
    public Utilisateur VerifierIdentifiants (String login,String mdp);
    
    public ArrayList<Activite> VerifierActivite (int praNum, int acNum);
    
    /* AFFICHER */
    public ArrayList<Praticien>getAllPraticiens();
    
    public ArrayList<Specialite>getAllSpecialite();
    
    public ArrayList<Specialite>getAllSpecialiteByPraNum(int unNum);
    
    public ArrayList<Activite>getAllActiviteByPraNum(int unNum);
    
    public ArrayList<Activite>getAllActivite();
    
    public ArrayList<TypeCode>getAllTypeCode();
    
    public ArrayList<Specialite>getAllNameSpe();
    
    public ArrayList<Activite>getAllActivLieuDate();
    
    public ArrayList<Praticien>getAllIdNomPrenomPrat();
    
    /* INSERER */
    public void insererSpecialite(int spe_code,String libelle);
    
    public void InsererPraticien(int num, String nom, String prenom, String adresse, String codePostal, String ville, double Note, int typeCode);
    
    public void InsererActivitie(int activNum, int praNumero, int speOn);
    
    /* SUPPRIMER */
    public void deleteSpecialitePraticien(int pra_num , int spe_code);
    
    /* MODIFIER */
    public void modifSpe(int unId, String unNom);
    
    /* AUTRES */
    public int getLastIdPraticien();
    
    public int getLastIdSpecialite();
    
    public int maxcode();
    
    public int countNote(int uneNote);
}
