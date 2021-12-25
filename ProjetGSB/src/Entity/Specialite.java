/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author stelz
 */
public class Specialite {
    
    private int speCode;
    private String speLibelle;
    
    public Specialite(int unCode, String unLibelle){
        speCode = unCode;
        speLibelle= unLibelle;
    }

    /**
     * @return the speCode
     */
    public int getSpeCode() {
        return speCode;
    }

    /**
     * @return the speLibelle
     */
    public String getSpeLibelle() {
        return speLibelle;
    }
}
