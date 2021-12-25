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
    
    /* AFFICHER */
    public ArrayList<Praticien>getAllPraticiens();
    
    public ArrayList<Specialite>getAllSpecialite();
    
    public ArrayList<Specialite>getAllSpecialiteByPraNum(int unNum);
    
    public ArrayList<Activite>getAllActivite();
    
    /* INSERER */
    public void insererSpecialite(int spe_code,String libelle);
    
    public void InsererPraticien(int num, String nom, String prenom, String adresse, String codePostal, String ville, double Note, int typeCode);
    
    /* AUTRES */
    public int getLastIdPraticien();
}
