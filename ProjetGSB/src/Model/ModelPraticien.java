/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Entity.Praticien;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Admin
 */
public class ModelPraticien extends AbstractTableModel {

    private String []nomsColonnes;
    private Vector<String[]>rows;
    
    @Override
    public int getRowCount() {
        return rows.size();
    }

    @Override
    public int getColumnCount() {
        return nomsColonnes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return rows.get(rowIndex)[columnIndex]; 
    }
    
    @Override
    public String getColumnName(int numColonne)
    {
        return nomsColonnes[numColonne];
    }
    
    public void LoadDatas(ArrayList<Praticien>desPraticiens){
        nomsColonnes = new String[]{"num","nom","prenom","adresse","cp","ville","note","type code"};
        rows = new Vector<String[]>();
        
        for (Praticien p : desPraticiens){
             rows.add(new String[] {String.valueOf(p.getNumPraticien()),p.getNomPraticien(),p.getPrenomPraticien(),p.getAdressePraticien(),p.getCpPraticien(),p.getVillePraticien(),p.getCoefnotPraticien(),p.getTypPraticien()});
        }
        fireTableDataChanged();
    }
    
}
