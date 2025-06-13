

package com.mycompany.mavenproject1;

import java.util.Scanner;


public class Mavenproject1 {

    public static void main(String[] args) {
        
        System.out.println("     /////////////////////////////    ");
        System.out.println("    //*      EJERCISIO 1    *//    ");
        System.out.println("     /////////////////////////////    ");
        
      // 1. Hallar la superficie de un cuadrado conociendo el valor de un lado
      // Superficie = lado * lado
      
        Scanner teclado = new Scanner(System.in);
      
        float superficie;
        float lado1;
      
        System.out.println("Ingrese por favor el valor del lado");
        lado1 = teclado.nextFloat();
        
        
        superficie = lado1 * lado1;
        
        System.out.println("La superficie del cuadrado es: " + superficie);
        
        
        System.out.println("     /////////////////////////////    ");
        System.out.println("    //*      EJERCISIO 2    *//    ");
        System.out.println("     /////////////////////////////    ");
        // 2. Hallar la suma de tres numeros conociendo los numeros.
        
        int num1, num2, num3;
        int suma;
        
        
        System.out.println("Ingrese por favor el valor del primer numero");
        num1 = teclado.nextInt();
        
        System.out.println("Ingrese por favor el valor del segundo numero");
        num2 = teclado.nextInt();
        
        System.out.println("Ingrese por favor el valor del tercer numero");
        num3 = teclado.nextInt();
        
        
        suma = num1 + num2 + num3;
        
        System.out.println("La suma de los tres numero es: " + suma);
        
        
        
        
        System.out.println("     /////////////////////////////    ");
        System.out.println("    //*      EJERCISIO 3    *//    ");
        System.out.println("     /////////////////////////////    ");
        
        // 3. Realizar la carga del lado de un cuadrado, mostrar por pantalla el perimetro de el mismmo,
        // El perimetro de un cuadrado se calcula multiplicando el valor del lado por cuatro
        
        
        float lad;
        float perimetro;
        
        System.out.println("Ingrese por favor el lado del cuadrado");
        lad = teclado.nextFloat();
        
        perimetro = lad * 4;
        
        System.out.println("El perimetro de un cuadrado es: " + perimetro);
        
        
        System.out.println("     /////////////////////////////    ");
        System.out.println("    //*      EJERCISIO 4    *//    ");
        System.out.println("     /////////////////////////////    ");
       
        /*
        Crear una aplicacion que dado a 2 valores a calcular la suma, resta, 
        multiplicacion y division de dichos valores
        */
        
        int nume1, nume2;
        int sum, res, mul, div;
        
        System.out.println("Ingrese por favor el primer valor: ");
        nume1 = teclado.nextInt();
        
        System.out.println("Ingrese por favor el segundo valor: ");
        nume2 = teclado.nextInt();
        
        sum = nume1 + nume2;
        res = nume1 - nume2;
        mul = nume1 * nume2;
        div = nume1 / nume2;
        
        System.out.println("El valor de la suma es: " + sum);
        System.out.println("El valor de la resta es: " + res);
        System.out.println("El valor de la multiplicacion es: " + mul);
        System.out.println("El valor de la division es: " + div);
      
        
        System.out.println("     /////////////////////////////    ");
        System.out.println("    //*      EJERCISIO 5    *//    ");
        System.out.println("     /////////////////////////////    ");
        
        /*
        Crear una aplicacion que calcule el area de un triangulo, conociendo 
        base y altura
        
        Area = base * altura
               -------------
                     2
        
        */
        
        double base;
        double altura;
        double area;
        
        System.out.println("Ingrese por favor la base del triangulo: ");
        base = teclado.nextDouble();
        
        System.out.println("Ingrese por favor la altura del triangulo: ");
        altura = teclado.nextDouble();
        
        area = base * altura / 2;
        
        System.out.println("El area del triangulo es: " + area);
        
        
        
        System.out.println("     /////////////////////////////    ");
        System.out.println("    //*      EJERCISIO 6    *//    ");
        System.out.println("     /////////////////////////////    ");
          
        
        
        
        
        
        
        
        
        
        
    }
    
}
