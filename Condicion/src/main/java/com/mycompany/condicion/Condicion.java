/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.condicion;

/**
 *
 * @author Roberto
 */
public class Condicion {

    public static void main(String[] args) {
        System.out.println("Ejercicio de condicion");
        int numero1,numero2;
        numero1 = 12;
        numero2 = 7;
        //LOGICOS
        System.out.println("El numero1 es igual al numero2: ");
        System.out.println(numero1==numero2);
        System.out.println("El numero1 es diferente al numero2: ");
        System.out.println(numero1!=numero2);
        System.out.println("El numero1 es menor y igual al numero2: ");
        System.out.println(numero1<=numero2);
        System.out.println("El numero1 es mayor y igual al numero2: ");
        System.out.println(numero1>=numero2);
        //IF / IF....ELSE
        if(numero1==numero2){
            System.out.println("El numero1 es igual al numero2");
        }
        if(numero1>=numero2){
            System.out.println("El numero1 es mayor y igual al numero2");
        }else{
            System.out.println("El numero1 es menor al numero2");
        }
        int mes;
        mes=9;
        switch(mes){
            case 1:
                System.out.println("El mes es enero");
                break;
            case 2:
                System.out.println("El mes es febrero");
                break;
            //...
            case 8:
                System.out.println("El mes es agosto");
                break;
            default:
                System.out.println("El mes no esta registrado");
        }
        
    }
}
