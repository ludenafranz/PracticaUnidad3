/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistar.Tablas;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author franz
 */
public class ModeloTablaMatriz extends AbstractTableModel {
    private Object[][] matriz;

    public Object[][] getMatriz() {
        return matriz;
    }
    
    public void setMatriz(Object[][] matriz) {
        this.matriz = matriz;
    }

    @Override
    public int getRowCount() {
        return matriz.length;
    }

    @Override
    public int getColumnCount() {
        return matriz[0].length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       if (matriz != null && rowIndex >= 0 && rowIndex < matriz.length && columnIndex >= 0 && columnIndex < matriz[0].length) {
           return matriz[rowIndex][columnIndex];   
        } else {
            return null;
        }
    }
}
