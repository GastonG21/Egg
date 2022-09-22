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
public class Ej1Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num;
        int num2;
        int resultado;
        
        System.out.println("Ingrese su primer numero");
        num = leer.nextInt();
        
        System.out.println("Ingrese su segundo numero");
        num2= leer.nextInt();
        
        resultado = num + num2;
        
        System.out.println("El resultado de los numeros ingresados es: " + resultado);
        
        
        
        
    }
    
}
