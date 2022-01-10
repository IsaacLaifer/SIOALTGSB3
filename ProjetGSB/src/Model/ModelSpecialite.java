/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.Specialite;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author stelz
 */
public class ModelSpecialite extends AbstractTableModel{
    
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
    
       public void LoadDatasSpe(ArrayList<Specialite>desSpecialites)
    {
        nomsColonnes = new String[]{"CODE","LIBELLE"};
        rows= new Vector<String[]>();
        
        for (Specialite s : desSpecialites)
        {
            rows.add(new String[] {String.valueOf(s.getSpeCode()),s.getSpeLibelle()});
        }
        fireTableDataChanged();
    }

    public void LoadDats2Colonnes(ArrayList<Specialite>allSpecialiteByPra_num) {
        
        nomsColonnes = new String[]{"CODE","LIBELLE"};
        rows= new Vector<>();
        
        for (Specialite sp : allSpecialiteByPra_num)
        {
            rows.add(new String[] {String.valueOf(sp.getSpeCode()),sp.getSpeLibelle()});
        }
        fireTableDataChanged();
    }
    
    public void LoadNomSpe(ArrayList<Specialite>allSpeNom){
        nomsColonnes= new String[]{"NOM"};
        rows = new Vector<>();
        
        for(Specialite sn : allSpeNom){
            rows.add(new String[]{String.valueOf(sn.getSpeLibelle())});
        }
        fireTableDataChanged();
    }
}


