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
public class Ej9Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase o palabra");
        String palabra = leer.nextLine();
        
        if (palabra.substring(0,1).equals("A")){
            
            System.out.println("Correcto");
        } else{
            System.out.println("Incorrecto");
        }
    }
}
