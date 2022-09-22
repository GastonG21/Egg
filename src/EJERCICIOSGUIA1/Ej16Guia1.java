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
public class Ej16Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);   
        
        int vector[] = VAleatorios(); 
        
        System.out.println("Ingrese el numero que desea buscar");
        int buscar = leer.nextInt();
        
        buscarm(buscar, vector);
        
    }
    
    public static int[] VAleatorios() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño de su vector");
        int n = sc.nextInt();
        int[] vector = new int[n];
        
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random()*10);
        }
        return vector;
    }
    
    public static void buscarm(int num, int[]vector){
        boolean noencontrado = true;
        
        
        for (int i = 0; i < vector.length; i++) {
           if(vector[i] == num){ 
               noencontrado = false;
               System.out.println("Se encuentra en la posicion "+i+" del vector");  
           }
        }   
       if (noencontrado){
        System.out.println("No se ha encontrado su numero");
       }
    } 
}
