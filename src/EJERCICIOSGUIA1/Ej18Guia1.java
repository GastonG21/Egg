/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIOSGUIA1;

import java.util.Scanner;

/**
 *
 * @author GastonG
 */
public class Ej18Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int[][] matriz = VAleatorios();
        
        System.out.println("Matriz A");
         for (int i = 0; i < 4; i++) {
             System.out.println();
             for (int j = 0; j < 4; j++) {
                 System.out.print(matriz[i][j]+" ");
             }
        }
        System.out.println("");
        
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                int aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
                
            }
        }
        
        System.out.println("Matriz B(Traspuesta)");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("");
        }
    }
    
    public static int[][] VAleatorios() {
        Scanner sc = new Scanner(System.in);
        
        int[][] matriz = new int[4][4];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
               matriz[i][j] = (int) (Math.random() * ( (9 - -9) + 1)) + -9;
            }
        }
        return matriz;
    }
    
}
