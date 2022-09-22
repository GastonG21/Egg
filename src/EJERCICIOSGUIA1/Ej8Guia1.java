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
public class Ej8Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        
        System.out.println("Ingrese una palabra o frase de 8 de largo");
        String ingreso = leer.nextLine();
        
        
        if (ingreso.length()==8){
            
            System.out.println("Correcto");
        } else {
            
            System.out.println("Incorrecto");
        } 
    }
}
