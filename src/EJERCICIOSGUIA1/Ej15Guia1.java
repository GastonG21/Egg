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
public class Ej15Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] vector = new int[100];
        boolean creciente=false, decreciente=false;
        
        
        for (int i = 0; i < 100; i++) {
            vector[i]= i;
            System.out.println("vector["+vector[i]+"]");
        }
        
        for (int i = vector.length-1; i > 0; i--) {
            
            System.out.println("vector "+vector[i]);
        }
    }    
}
