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
public class Ej20Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        boolean VoF=true;
        boolean VoF1=true;
        boolean VoF2=true;
        
        
        
        System.out.println("Ingrese la dimension de la matriz");
        int m = leer.nextInt();
        int n = leer.nextInt();
        
        int contador = 0;
        int[][] matriz = new int[m][n];
        int[] filas = new int [m];
        int[] columnas = new int[m];
        int[] diagonal = new int[m];
        
        int aux = n;
        
        for (int i = 0; i < m; i++) {
            filas[i] = 0;
            columnas[i]=0;
            diagonal[i]=0;
        }
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                do{
                    System.out.print("Ingrese el valor para Matriz["+i+"]["+j+"](Entre 1 y 9):");   
                    matriz[i][j] = leer.nextInt();
                    if (matriz[i][j] > 9){
                        System.out.println("El valor ingresado es mayor a 9");
                    }
                }while (matriz[i][j] >9);
            }
        }
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                filas[i] = filas[i] + matriz[i][j];
            }
        }
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j){
                   diagonal[0] = diagonal[0] + matriz[i][j];   
                }
            }
        }
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(j == aux-1){
                   diagonal[1] = diagonal[1] + matriz[i][j]; 
                   aux = aux-1;
                }
            }
        }
        
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < m; i++) {
                columnas[i] = columnas[i] + matriz[i][j];
            }
        }
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("");
        }
        
        
        for (int i = 0; i < m; i++) {
            if (filas[0] == filas[i]){
                contador = contador +1;
                if (contador == m) {
                
                    VoF = true;
                    contador = 0;
                }else {
                    VoF = false;
                }
            }
                 
        }     
        
        for (int i = 0; i < m; i++) {
            if(columnas[0] == columnas[i]){
                contador = contador+1;
                 if (contador == m) {
                    VoF1 = true;
                    contador = 0;
                }else{
                    VoF1 = false;
                }
            }
        }
        
        for (int i = 0; i < m; i++) {
            if (diagonal[0]==diagonal[1]) {
                contador = contador +1;
                if(contador == m){
                  VoF2=true;  
                  contador=0;
                }else{
                    VoF2 = false;
                }
            }
        }
        if (VoF == true && VoF1 == true && VoF2 == true) {
            System.out.println("El cuadrado es magico");
        }else { 
            System.out.println("El cuadrado no es magico");
        }
    }      
}
