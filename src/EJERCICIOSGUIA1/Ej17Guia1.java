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
public class Ej17Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
       int vector[] = VAleatorios();
       
       
       contabilizar(vector);
       
    }
    
    public static int[] VAleatorios() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño de su vector");
        int n = sc.nextInt();
        int[] vector = new int[n];
        
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random()*50000);
        }
        return vector;
    }
    
    public static void contabilizar(int[] vector){
        
        int cont1=0, cont2=0, cont3=0, cont4=0, cont5=0;
        
        
        for (int i = 0; i < vector.length; i++) {
           if(Integer.toString(vector[i]).length() == 1){
                cont1++;
           }else if (Integer.toString(vector[i]).length() == 2){
               cont2++;
           }else if (Integer.toString(vector[i]).length() == 3){
               cont3++;
           }else if (Integer.toString(vector[i]).length() == 4){
               cont4++;
           }else if (Integer.toString(vector[i]).length() == 5){
               cont5++;
           }

            //switch (Integer.toString(vector[i]).length()) {
                //case 1:
                    //cont1++;
                    //break;
                //case 2:
                    //cont2++;
                    //break;
                //case 3:
                    //cont3++;
                    //break;
                //case 4:
                    //cont4++;
                    //break;
               // case 5:
                    //cont5++;
                    //break;
                //default:
                    //break;
           // }
        }
        
        System.out.println("La cantidad de numeros de 1 digito es: "+cont1);
        System.out.println("La cantidad de numeros de 2 digito es: "+cont2);
        System.out.println("La cantidad de numeros de 3 digito es: "+cont3);
        System.out.println("La cantidad de numeros de 4 digito es: "+cont4);
        System.out.println("La cantidad de numeros de 5 digito es: "+cont5);
    }
    
}
