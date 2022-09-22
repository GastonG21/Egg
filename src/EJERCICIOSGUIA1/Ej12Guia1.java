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
public class Ej12Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in);
        String frase;
        int contadorp = 0;
        int contadorf = 0;
        int fin = 0;
        do {
            System.out.println("Una frase");
            frase = leer.nextLine();
            int largo = frase.length();
            String pcarac = frase.substring(0, 1);
            String fcarac =  frase.substring(largo-1,largo);
            
            if (frase.equals("&&&&&")) {
               fin = 1; 
            }
        if (largo == 5) {
                if (pcarac.equals("X")) {
                   if  (fcarac.equals("O")) {
                       contadorp++;
                   }
                }
            } else {
                contadorf++;
            }
            
            
        } while (fin == 0);
        
        System.out.println("La cantidad de frases correctas introducidas es: " + contadorp);
        System.out.println("La cantidad de frases incorrectas introducidas es: " + contadorf);
    }   
}
