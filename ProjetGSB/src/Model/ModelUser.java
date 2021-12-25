/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.Utilisateur;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;


public class ModelUser extends AbstractTableModel
{
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
    
    //void ==> methode qui retourne rien 
    //on appelle sa une procédure
    public void LoadDatas(ArrayList<Utilisateur>desUsers)
    {
        nomsColonnes = new String[]{"Numéro","Nom"};
        rows= new Vector<String[]>();
        
        for (Utilisateur u : desUsers)
        {
            rows.add(new String[] {String.valueOf(u.getIdUtilisateur()),u.getNomUtilisateur()});
        }
        fireTableDataChanged();
    }
}
