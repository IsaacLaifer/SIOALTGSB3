/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

public class Utilisateur 
{
    //car dans la maquette on souhaite afficher sueulement 
    //L'Id et le nom de l'utilisateur 
    
       private int idUtilisateur;
       private String nomUtilisateur;
       private String statutUser;
    
       
       public Utilisateur(int unId,String unNom, String unStatut)
       {
           idUtilisateur=unId;
           nomUtilisateur=unNom;
           statutUser = unStatut;
       }

    /**
     * @return the idUtilisateur
     */
    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    /**
     * @return the nomUtilisateur
     */
    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    /**
     * @return the statutUser
     */
    public String getStatutUser() {
        return statutUser;
    }
}
