/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.libraryprogram;

/**
 *
 * @author tiein
 */
import javax.swing.table.*;

public class CustomTableModel extends DefaultTableModel {
    
    int numCols;
    
    CustomTableModel(Object[] columnNames, int rowCount){
        super(columnNames, rowCount);
        numCols = columnNames.length;
    }
    
    @Override
    
    /**
     * Method that always says that cells in the table are uneditable
     */
    public boolean isCellEditable(int row, int col){
        return false;
    }
    
}
