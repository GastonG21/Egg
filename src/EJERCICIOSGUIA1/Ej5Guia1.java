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
public class Ej5Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero y a continuacion se le mostrara el doble, el triple y la raiz cuadrada de ese numero");
        int num = leer.nextInt();
        
        
        double raiz = Math.sqrt(num);
        int doble = num *2;
        int triple = num*3;
        
        System.out.println("El doble de "+num+" Es: "+doble);
        System.out.println("El triple de "+num+" Es: "+triple);
        System.out.println("la raiz cuadrada de "+num+" Es: "+raiz);
    }  
}
