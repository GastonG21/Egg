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
public class Ej14Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de euros que desea convertir");
        int euro = leer.nextInt();
        
        cambioMoneda(euro);   
    }
    
    
    public static void cambioMoneda(int euro) {
    
        double libras;
        double dolar;
        double yenes;
    
        libras = euro * 0.81;
        dolar = euro * 1.28611;
        yenes = euro * 129.852;
    
            System.out.println("El cambio de divisas es: ");
            System.out.println("Su cambio de "+ euro +" euros es igual a: "+ libras + " libras" );
            System.out.println("Su cambio de "+ euro +" euros es igual a: "+ dolar + " dolares" );
            System.out.println("Su cambio de "+ euro +" euros es igual a: "+ yenes + " yenes" );
    }  
}
