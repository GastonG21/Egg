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
public class Ej19Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int vectorUno[][] = crearVectorAleatorio();
        mostrarVector(vectorUno);
        int vectorDos[][] = new int[vectorUno.length] [vectorUno.length];
        for (int i = 0; i < vectorUno.length; i++) {
            for (int j = 0; j < vectorUno.length; j++) {
                    vectorDos[i][j] = (vectorUno[i][j])*(-1) ;
            }
        }
        vectorDos[2][2] = 33;
        System.out.println(verAntiMatriz(vectorUno,vectorDos));


    }




    public static void mostrarVector(int[][] vector){
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector.length ; j++) {
                System.out.print("["+vector[i][j]+"]");
            }
            System.out.println();
        }



    }

    public static int[][] crearVectorAleatorio(){
        Scanner sc = new Scanner(System.in);
        int largo;
        System.out.println("Ingresa el largo de el vector");
        largo = Integer.valueOf(sc.nextLine());
        int vectorsin[][] = new int[largo][largo];

        for (int i = 0; i < vectorsin.length; i++) {
            for (int j = 0; j < vectorsin.length; j++) {
                vectorsin[i][j] = (int) (Math.random() * ( (9 - -9) + 1)) + -9;
            }

        }
        return vectorsin;
    }

    public static  int[][] crearVectorAntisimetrcio(int[][] vector){

        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector.length; j++) {
                if (vector[i][j] < 0){
                    vector[i][j] = Math.abs(vector[i][j]) ;
                    continue;
                }

                if (vector[i][j] > 0){
                    vector[i][j] = vector[i][j] - (vector[i][j]*2);
                }
            }
        }
        return vector;


    }


    public static boolean verAntiMatriz(int[][]vectorUno,int[][] vectorDos){
        boolean antiSimetricas = true;

        if(vectorUno.length == vectorDos.length){
            for (int i = 0; i < vectorUno.length; i++) {
                for (int j = 0; j < vectorUno.length ; j++) {
                    if(vectorUno[i][j] == (vectorDos[i][j] = (vectorDos[i][j]) *(-1)) ){

                    }else {
                        antiSimetricas = false;
                        break;
                    }
                }
            }
        }else {
            antiSimetricas = false;
        }

        return  antiSimetricas;

    }

}
