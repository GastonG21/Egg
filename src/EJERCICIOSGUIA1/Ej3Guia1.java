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
public class Ej3Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String Frase;
        
        
        System.out.println("Ingrese una frase");
        
       Frase = leer.nextLine();
       
       
        System.out.println(Frase.toLowerCase());
        System.out.println(Frase.toUpperCase());
    }
    
}

