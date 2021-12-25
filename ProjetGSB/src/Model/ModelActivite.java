/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Entity.Activite;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author stelz
 */
public class ModelActivite extends AbstractTableModel{

    private String[]nomsColonnes;
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
    
     public void LoadDatasActivite(ArrayList<Activite>desActivites){
        nomsColonnes = new String[]{"num","date","lieu","theme","motif"};
        rows = new Vector<String[]>();
        
        for (Activite a  : desActivites){
             rows.add(new String[] {String.valueOf(a.getNumActivite()),a.getDateActivite(),a.getLieuActivite(),a.getThemeActivite(),a.getMotifActivite()});
        }
        fireTableDataChanged();
}
}
