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
public class Laberintocontroller {
    private int filas;
    private int columna;
    private String[][] laberinto;
    public void setlaberinto(int filas, int columna) {
        this.filas=filas;
        this.columna=columna;
        laberinto = new String[filas][columna];
    }
    public void generalLaberinto(){
        Random ran = new Random();
        int min = 40;
        int max = 60;
        int porciento = ran.nextInt(max-min+1)+ min;
        int paredes = (filas*columna*porciento)/100;
        for(int i = 0; i < filas;i++){
            for(int j = 0; j < columna;j++){
                laberinto[i][j] = " ";
            }
        }
        laberinto[0][0]="S";
        laberinto[filas-1][columna-1]="E";
        
        int contador = 0;
        while (contador < paredes) {
            int i = ran.nextInt(filas);
            int j = ran.nextInt(columna);
            if (laberinto[i][j].equals(" ")) {
                laberinto[i][j] = "|";
                contador++;
            }
        }
    }
    public String[][] getLaberinto() {
        return laberinto;
    }
}
