/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author Admin
 */
public class TypeCode {
    private int typeCode;
    private String typeLib;
    
    public TypeCode(int unCode, String unLib){
        typeCode= unCode;
        typeLib = unLib;
    }

    /**
     * @return the typeCode
     */
    public int getTypeCode() {
        return typeCode;
    }

    /**
     * @return the typeLib
     */
    public String getTypeLib() {
        return typeLib;
    }
}
