
package com.mycompany.operadores;

import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {
        
        
//        Scanner teclado = new Scanner(System.in);
//        
//        int numero;
//        int numero2;
//        
//        System.out.println("Digite porfavor el valor de el numero 1: ");
//        numero = teclado.nextInt();
//        
//        System.out.println("Digite porfavor el valor de el numero 2: ");
//        numero2 = teclado.nextInt();
//        
//        
//        int suma = numero + numero2;
//        int resta = numero - numero2;
//        int multiplicacion = numero * numero2;
//        int divicion = numero / numero2;
//        
//        System.out.println("--------------------------------");
//        System.out.println("La suma es: " + suma);
//        System.out.println("La resta es: " + resta);
//        System.out.println("La multiplicacion es: " + multiplicacion);
//        System.out.println("La divicion es: " + divicion);
        
        
        
        System.out.println("     /////////////////////////////    ");
        System.out.println("    //*      ENTRADA DE DATOS    *//    ");
        System.out.println("     /////////////////////////////    ");
        
        
        Scanner tecla = new Scanner(System.in);
        
        String nom;
        
        System.out.println("Ingrese la cadena de texto");
        nom = tecla.next();
        
        System.out.println("El nombre es: " + nom);
        
        nom += " Jimenez";
        System.out.println(nom);
        
        
        
        
    }
}
