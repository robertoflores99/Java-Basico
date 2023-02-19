/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.caracteres;

import java.util.Scanner;

/**
 *
 * @author Roberto
 */
public class Caracteres {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ejercicio de caracteres");
        String cadena1, cadena2;
        System.out.println("Ingrese la primera oracion: ");
        cadena1 = scan.nextLine();
        System.out.println("Ingrese la segunda oracion: ");
        cadena2 = scan.nextLine();
        System.out.println("La oracion completa es: "+(cadena1+" "+cadena2));
        //Longitud de la oracion
        System.out.println("La longitud de la primera oracion es: "+cadena1.length());
        System.out.println("La longitud de la segunda oracion es: "+cadena2.length());
        //Comparacion de las oraciones
        if(cadena1.equals(cadena2)){
            System.out.println("las dos oraciones son iguales");
        }else{
            System.out.println("las dos oraciones son diferentes");
        }
        //Extraer parte de la oracion
        String extraer;
        //Hola mundo
        //0123456789
        extraer = cadena1.substring(1,6);
        System.out.println("Esta parte se saco de la primera oracion: "+extraer);
    }
}
