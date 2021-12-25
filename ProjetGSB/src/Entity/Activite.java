/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

public class Activite {
    private int numActivite;
    private String dateActivite;
    private String lieuActivite;
    private String themeActivite;
    private String motifActivite;
    
public Activite(int unActivite, String unDate, String unLieu , String unTheme, String unMotif){
    numActivite  = unActivite;
    dateActivite = unDate;
    lieuActivite= unLieu;
    themeActivite = unTheme;
    motifActivite= unMotif;
}

    /**
     * @return the numActivite
     */
    public int getNumActivite() {
        return numActivite;
    }

    /**
     * @return the dateActivite
     */
    public String getDateActivite() {
        return dateActivite;
    }

    /**
     * @return the lieuActivite
     */
    public String getLieuActivite() {
        return lieuActivite;
    }

    /**
     * @return the themeActivite
     */
    public String getThemeActivite() {
        return themeActivite;
    }

    /**
     * @return the motifActivite
     */
    public String getMotifActivite() {
        return motifActivite;
    }


}