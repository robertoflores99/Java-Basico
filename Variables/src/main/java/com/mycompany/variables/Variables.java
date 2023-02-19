/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.variables;

import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author Roberto
 */
public class Variables {

    public static void main(String[] args) {
        //Declarar variable de entrada de datos
        Scanner scan = new Scanner(System.in);
        //Variables:
        int entero;
        String cadena;
        double decimal;
        char letra;
        boolean logica;
        //Entrada y Salida
        /*
        System.out.println("Ejercicio de caracteres");
        Forma 1:
        System.out.print("Digite una cadena:");
        cadena = scan.nextLine();
        System.out.println("Mi cadena es:"+cadena);
        Forma 2 (interfaz):
        cadena = JOptionPane.showInputDialog("Digite una cadena");
        JOptionPane.showMessageDialog(null, "La cadena es:"+cadena);
        */
        /*
        System.out.println("Ejercicio de enteros");
        Forma 1:
        System.out.println("Digite un entero: ");
        entero = scan.nextInt();
        System.out.println("El numero entero es: "+entero);
        Forma 2:
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero: "));
        JOptionPane.showMessageDialog(null, "El numero entero es: "+entero);
        */
        /*
        System.out.println("Ejercicio de Caracter");
        Forma 1:
        System.out.println("Digite un Caracter: ");
        letra = scan.next().charAt(0);
        System.out.println("El caracter es: "+letra);
        Forma 2:
        letra = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
        JOptionPane.showMessageDialog(null, "El caracter es: "+letra);
        */
        /*
        System.out.println("Ejercicio de decimal");
        Forma 1:
        System.out.println("Digite un decimal: ");
        decimal = scan.nextDouble();
        System.out.println("El decimal es: "+decimal);
        Forma 2:
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: "));
        JOptionPane.showMessageDialog(null, "El decimal es: "+decimal);
        */
        System.out.println("Ejercicio de bolean");
        logica = true;
        System.out.println("El valor boleano es: "+logica);
        JOptionPane.showMessageDialog(null, "El boleano es: "+logica);
    }
}
