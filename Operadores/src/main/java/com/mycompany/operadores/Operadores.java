/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.operadores;

import java.util.Scanner;

/**
 *
 * @author Roberto
 */
public class Operadores {

    public static void main(String[] args) {
        System.out.println("Ejercicio de operadores");
        Scanner scan = new Scanner(System.in);
        int numero1;
        int numero2;
        System.out.println("Ingrese el primer numero: ");
        numero1=scan.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numero2=scan.nextInt();
        System.out.println("La suma es: "+(numero1+numero2));
        System.out.println("La resta es: "+(numero1-numero2));
        System.out.println("La multiplicacion es: "+(numero1*numero2));
        System.out.println("La division es: "+(numero1/numero2));
        System.out.println("El resto es: "+(numero1%numero2));
        
    }
}
