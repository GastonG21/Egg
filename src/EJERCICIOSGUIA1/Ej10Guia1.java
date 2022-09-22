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
public class Ej10Guia1 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int vlimite;
        int num;
        int suma;
        
        suma = 0;
        
        System.out.println("Ingrese un valor limite");
        vlimite = leer.nextInt();
        
        do {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            
            suma = suma + num;
            
        }while (suma < vlimite);
        
        System.out.println("El valor limite se ha superado " + suma); 
    }
}
