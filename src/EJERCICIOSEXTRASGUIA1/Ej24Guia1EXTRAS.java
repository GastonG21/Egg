/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIOSEXTRASGUIA1;

import java.util.Scanner;

/**
 *
 * @author GastonG
 */
public class Ej24Guia1EXTRAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una posicion de fibonnaci");
        int posicion = leer.nextInt();
        
        int[] vector = new int [posicion];
        dolor(vector,posicion);
        
        for (int i = 0; i != posicion; i++) {
            System.out.print(vector[i] + " ");
        }
    }
    public static void dolor( int vector[], int posicion){
	int num1 = 0;
	int num2 = 1;
	int aux;
        int dolor;
        
	for (int i = 0; i != posicion; i++){
            if (posicion == 1 || posicion == 2) {
                vector[i] = 1;
            } else {
                aux = num1 + num2;
                num1 = num2;
                vector[i] = num1;
                num2 = aux;
            }
        }
    }
    
}
