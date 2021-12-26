/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Entity.TypeCode;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Admin
 */
public class ModelTypeCode extends AbstractTableModel{
     private String []nomsColonnes;
    //String car tout ce quon va mettre dedans sera considéré comme du String
    private Vector<String[]>rows;

    @Override
    public int getRowCount() 
    {
        return rows.size();
    }

    @Override
    public int getColumnCount() 
    {
        return nomsColonnes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) 
    {
        return rows.get(rowIndex)[columnIndex];
    }
    
    @Override
    public String getColumnName(int numColonne)
    {
        return nomsColonnes[numColonne];
    }
    
    public void LoadTypeCode(ArrayList<TypeCode>desTypeCode)
    {
        nomsColonnes = new String[]{"Type Code","Libellé"};
        rows= new Vector<String[]>();
        
        for (TypeCode tc : desTypeCode)
        {
            rows.add(new String[] {String.valueOf(tc.getTypeCode()),tc.getTypeLib()});
        }
        fireTableDataChanged();
    }
}
