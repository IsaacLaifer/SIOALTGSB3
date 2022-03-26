/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;


public class Praticien {
    
    private int numPraticien;
    private String nomPraticien;
    private String prenomPraticien;
    private String adressePraticien;
    private String cpPraticien;
    private String villePraticien;
    private String coefnotPraticien;
    private String typPraticien;
    
    public Praticien(int unNum, String unNom, String unPrenom, String unAdresse, String unCp, String unVille, String unNote,String unTyp){
        numPraticien = unNum;
        nomPraticien = unNom;
        prenomPraticien = unPrenom;
        adressePraticien = unAdresse;
        cpPraticien = unCp;
        villePraticien = unVille;
        coefnotPraticien = unNote;
        typPraticien = unTyp;
    }
    public Praticien(int unNum, String unNom, String unPrenom){
        numPraticien = unNum;
        nomPraticien = unNom;
        prenomPraticien = unPrenom;
    }

    /**
     * @return the numPraticien
     */
    public int getNumPraticien() {
        return numPraticien;
    }

    /**
     * @return the nomPraticien
     */
    public String getNomPraticien() {
        return nomPraticien;
    }

    /**
     * @return the prenomPraticien
     */
    public String getPrenomPraticien() {
        return prenomPraticien;
    }

    /**
     * @return the adressePraticien
     */
    public String getAdressePraticien() {
        return adressePraticien;
    }

    /**
     * @return the cpPraticien
     */
    public String getCpPraticien() {
        return cpPraticien;
    }

    /**
     * @return the villePraticien
     */
    public String getVillePraticien() {
        return villePraticien;
    }

    /**
     * @return the coefnotPraticien
     */
    public String getCoefnotPraticien() {
        return coefnotPraticien;
    }

    /**
     * @return the typPraticien
     */
    public String getTypPraticien() {
        return typPraticien;
    }
}
