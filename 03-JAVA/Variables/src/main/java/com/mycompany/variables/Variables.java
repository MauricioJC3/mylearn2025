package com.mycompany.variables;

import java.util.Scanner;


public class Variables {

    public static void main(String[] args) {
    
        // Conceptos de Variables
        /*
        int: Son los numero enteros, 1, 2, 3, 4, -1, -2, -3 ...
        float: Hace referencia a valores flotantes, decimales: 1.2, 33.51, -12.22
        double: Son los valores decimales, 1,2 , 4,3 , 5,3
        String: Guarda texto o cadenas: Hola me llamo mauricio
        char: Solo guarda una sola letras: A, B, C, D ...
        boolean: Guarda valores booleanos: true, false
        */
        
        // Creamos nuestra primera variable entera
        int numero = 33;
        System.out.println(numero);
        
        // Creamo nuestras primeras variables en flotantes y decimales
        float numero_flotante = 2.2f;
        System.out.println(numero_flotante);
        
        double numero_double = 3.5;
        System.out.println(numero_double);
        
        // Cramos las variables char y String
        
        String texto = "Hola me llamo Andres Mauricio Jimenez Chavez";
        texto += " Soy de colombia"; // Es lo mismo que hacer texto = texto + "Soy de colombia";
        System.out.println(texto);
        
        char caracteres = 'A';
        System.out.println(caracteres);
        
        // Creamos varaibles Booleans
        boolean variables_booleana = true; // false
        System.out.println(variables_booleana);
        
        System.out.println("     /////////////////////////////    ");
        System.out.println("    //*      ENTRADA DE DATOS    *//    ");
        System.out.println("     /////////////////////////////    ");
        
        
        
        Scanner teclado = new Scanner(System.in);
        
        // Creamos las variables
        int edad;
        String nombre;
        float altura;
        
        System.out.println("Digite su edad: ");
        edad = teclado.nextInt();
        
        System.out.println("Digite su nombre: ");
        nombre = teclado.next();
        
        System.out.println("Digite su altura: ");
        altura = teclado.nextFloat();
        
        System.out.println("La edad es: " + edad);
        System.out.println("El nombre del usuario es: " + nombre);
        System.out.println("La altura del usuario es: " + altura);
        
        
        
        
        
        
        
        
        
        
    }
}
