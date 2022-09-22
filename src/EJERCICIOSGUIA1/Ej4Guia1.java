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
public class Ej4Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese los grados centigrados que desea mostrar en Fahrenheit");
        int grados = leer.nextInt();
        
        float Fahr = 32 + (9*grados/5);
        
        System.out.println("Los grados centigrados("+ grados+"), equivalen a " +Fahr+ " grados Fahrenheit");
    }
    
}
