/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_unidad3;

import java.util.Random;

/**
 *
 * @author franz
 */
public class Matrizcontrolador {
    private int file;
    private int colum;
    private Object[][] general;

    public void General(int file,int colum) {
        this.file = file;
        this.colum = colum;
        general = new Object[file][colum];
    }
    public void generalmatriz() {
        Random ra = new Random();
        for (int i = 0; i < file; i++) {
            for (int j = 0; j < colum; j++) {
                general[i][j] = ra.nextInt(31);
            }
        }
    }
    public void eliminarprimo() {
        for (int i = 0; i < file; i++) {
            for (int j = 0; j < colum; j++) {
                if(general[i][j] instanceof Integer && ReconocerPrimo((Integer)general[i][j])){
                    general[i][j] = "-";
                }
            }
        }
    }
    public void eliminarNUM(int num) { 
        for (int i = 0; i < file; i++) {
            for (int j = 0; j < colum; j++) {
                if (general[i][j] instanceof Integer && ((Integer)general[i][j]) == num) {
                general[i][j] = "-";
                }
            }
        }
    }
    public Object[][] getGeneral() {
        return general;
    }
    public boolean ReconocerPrimo(int num){
        if (num <= 1) return false;
        for (int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
