/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arreglo_y_matrices;

/**
 *
 * @author Roberto
 */
public class Arreglo_y_Matrices {

    public static void main(String[] args) {
        //Arreglo
        System.out.println("Ejercicio de Arreglo: ");
        int arreglo[]={1,3,5,7,9};
        for (int i = 0; i<arreglo.length; i++){
            System.out.println("el numero "+(i+1)+" es: "+arreglo[i]);
        }
        //Matriz
        System.out.println("Ejercicio de Matriz: ");
        int matriz[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        for (int i = 0; i<matriz.length; i++){
            for (int j = 0; j<matriz[i].length; j++){
                System.out.println("el numero ["+(i+1)+"]["+(j+1)+"] es: "+matriz[i][j]);
            }
            System.out.println(" ");
        }
    }
}
