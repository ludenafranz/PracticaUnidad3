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
public class ModeloTablaLaberinto extends AbstractTableModel {
    private String[][] laberinto;

    public String[][] getLaberinto() {
        return laberinto;
    }

    public void setLaberinto(String[][] laberinto) {
        this.laberinto = laberinto;
    }

    @Override
    public int getRowCount() {
        return laberinto.length;
    }

    @Override
    public int getColumnCount() {
        return laberinto[0].length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (laberinto != null && rowIndex >= 0 && rowIndex < laberinto.length && columnIndex >= 0 && columnIndex < laberinto[0].length) {
            return laberinto[rowIndex][columnIndex];
        } else {
            return null;
        }
    }
}
