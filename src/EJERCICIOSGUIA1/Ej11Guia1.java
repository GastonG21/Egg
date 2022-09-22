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
public class Ej11Guia1 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int suma=0;
        int resta=0;
        int mul=0;
        int div=0;
        
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        
        System.out.println("Ingrese un segundo numero");
        int num2 = leer.nextInt();
        
        
        int opcion;
        
        do {
        
            System.out.println("MENU");
            System.out.println("1.SUMAR");
            System.out.println("2.RESTAR");
            System.out.println("3.MULTIPLICAR");
            System.out.println("4.DIVIDIR");
            System.out.println("5.SALIR");
            System.out.println("Elija opcion: ");
        
                opcion = leer.nextInt();
        
            switch (opcion) {
            
                case 1:  
                    System.out.println("La suma de "+num+" y de "+ num2+" es: " + (suma = num + num2));
                    break;
                case 2:  
                    System.out.println("La resta de "+num+" y de "+ num2+" es: " + (resta = num - num2));
                    break;
                case 3:  
                    System.out.println("La multiplicacion de "+num+" y de "+ num2+" es: " + (mul = num * num2));
                    break;
                case 4:  
                    System.out.println("La division de "+ num +" y de "+ num2 +" es: " + (div = num / num2));
                    break;
                case 5:
                     System.out.println("Estas seguro que desea salir del programa? (S/N)");
                    String rta = leer.next();
                        if (rta.equals("S") || (rta.equals("s"))) {
                        System.out.println("Gracias por usar nuesta calculadora"); 
                        }else { 
                            if (rta.equals("N") || (rta.equals("n"))){
                              opcion = 0;
                            }
                    }
            }        
        }while (opcion != 5);     
    }
}
