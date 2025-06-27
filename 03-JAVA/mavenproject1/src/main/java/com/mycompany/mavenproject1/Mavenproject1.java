

package com.mycompany.mavenproject1;

import java.util.Scanner;


public class Mavenproject1 {

    public static void main(String[] args) {
        
//        System.out.println("     /////////////////////////////    ");
//        System.out.println("    //*      EJERCISIO 1    *//    ");
//        System.out.println("     /////////////////////////////    ");
//        
//      // 1. Hallar la superficie de un cuadrado conociendo el valor de un lado
//      // Superficie = lado * lado
//      
        Scanner teclado = new Scanner(System.in);
//      
//        float superficie;
//        float lado1;
//      
//        System.out.println("Ingrese por favor el valor del lado");
//        lado1 = teclado.nextFloat();
//        
//        
//        superficie = lado1 * lado1;
//        
//        System.out.println("La superficie del cuadrado es: " + superficie);
//        
//        
//        System.out.println("     /////////////////////////////    ");
//        System.out.println("    //*      EJERCISIO 2    *//    ");
//        System.out.println("     /////////////////////////////    ");
//        // 2. Hallar la suma de tres numeros conociendo los numeros.
//        
//        int num1, num2, num3;
//        int suma;
//        
//        
//        System.out.println("Ingrese por favor el valor del primer numero");
//        num1 = teclado.nextInt();
//        
//        System.out.println("Ingrese por favor el valor del segundo numero");
//        num2 = teclado.nextInt();
//        
//        System.out.println("Ingrese por favor el valor del tercer numero");
//        num3 = teclado.nextInt();
//        
//        
//        suma = num1 + num2 + num3;
//        
//        System.out.println("La suma de los tres numero es: " + suma);
//        
//        
//        
//        
//        System.out.println("     /////////////////////////////    ");
//        System.out.println("    //*      EJERCISIO 3    *//    ");
//        System.out.println("     /////////////////////////////    ");
//        
//        // 3. Realizar la carga del lado de un cuadrado, mostrar por pantalla el perimetro de el mismmo,
//        // El perimetro de un cuadrado se calcula multiplicando el valor del lado por cuatro
//        
//        
//        float lad;
//        float perimetro;
//        
//        System.out.println("Ingrese por favor el lado del cuadrado");
//        lad = teclado.nextFloat();
//        
//        perimetro = lad * 4;
//        
//        System.out.println("El perimetro de un cuadrado es: " + perimetro);
//        
//        
//        System.out.println("     /////////////////////////////    ");
//        System.out.println("    //*      EJERCISIO 4    *//    ");
//        System.out.println("     /////////////////////////////    ");
//       
//        /*
//        Crear una aplicacion que dado a 2 valores a calcular la suma, resta, 
//        multiplicacion y division de dichos valores
//        */
//        
//        int nume1, nume2;
//        int sum, res, mul, div;
//        
//        System.out.println("Ingrese por favor el primer valor: ");
//        nume1 = teclado.nextInt();
//        
//        System.out.println("Ingrese por favor el segundo valor: ");
//        nume2 = teclado.nextInt();
//        
//        sum = nume1 + nume2;
//        res = nume1 - nume2;
//        mul = nume1 * nume2;
//        div = nume1 / nume2;
//        
//        System.out.println("El valor de la suma es: " + sum);
//        System.out.println("El valor de la resta es: " + res);
//        System.out.println("El valor de la multiplicacion es: " + mul);
//        System.out.println("El valor de la division es: " + div);
//      
//        
//        System.out.println("     /////////////////////////////    ");
//        System.out.println("    //*      EJERCISIO 5    *//    ");
//        System.out.println("     /////////////////////////////    ");
//        
//        /*
//        Crear una aplicacion que calcule el area de un triangulo, conociendo 
//        base y altura
//        
//        Area = base * altura
//               -------------
//                     2
//        
//        */
//        
//        double base;
//        double altura;
//        double area;
//        
//        System.out.println("Ingrese por favor la base del triangulo: ");
//        base = teclado.nextDouble();
//        
//        System.out.println("Ingrese por favor la altura del triangulo: ");
//        altura = teclado.nextDouble();
//        
//        area =( base * altura ) / 2;
//        
//        System.out.println("El area del triangulo es: " + area);
//        
//        
//        
//        System.out.println("     /////////////////////////////    ");
//        System.out.println("    //*      EJERCISIO 6    *//    ");
//        System.out.println("     /////////////////////////////    ");
//          
// 
//        /*
//        Crear una aplicacion que calcule el sueldo de un empleado.
//        */       
//        
//        double sueldo;
//        double horas_trabajadas;
//        double dias_trabajados;
//        
//        System.out.print("Ingrese por favor la cantidad de horas trabajadas por el empleado: ");
//        horas_trabajadas = teclado.nextDouble();
//        
//        
//        System.out.print("Ingrese por favor los dias que trabajo ele empleado: ");
//        dias_trabajados = teclado.nextDouble();
//        
//        sueldo = horas_trabajadas * dias_trabajados;
//        
//        System.out.println("El sueldo del empleado segun dias y horas dadas es de; " + sueldo);
//        
//        
//        
//        System.out.println("     /////////////////////////////    ");
//        System.out.println("    //*      EJERCISIO 7    *//    ");
//        System.out.println("     /////////////////////////////    ");
//                
//        
//        // Crear una aplicacion que halle el promedio de 5 notas de un alumno
//        /*
//        promedio = (nota1 + nota2 )
//                    --------------
//                           2 // segun la cantidad de notas en este caso serian 5
//        */
//        
//        double nota1, nota2, nota3, nota4, nota5;
//        double promedio;
//        
//        System.out.print("Ingrese La primera nota porfavor: ");
//        nota1 = teclado.nextDouble();
//        
//        System.out.print("Ingrese La segunda nota porfavor: ");
//        nota2 = teclado.nextDouble();
//     
//        System.out.print("Ingrese La tercera nota porfavor: ");
//        nota3 = teclado.nextDouble();
//     
//        System.out.print("Ingrese La cuarta nota porfavor: ");
//        nota4 = teclado.nextDouble();
//     
//        System.out.print("Ingrese La quinta nota porfavor: ");
//        nota5 = teclado.nextDouble();
//        
//        promedio = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
//     
//        
//        System.out.println("El promedio es: " + promedio);
//        
//
//        
//          System.out.println("     /////////////////////////////    ");
//          System.out.println("    //*      EJERCISIO 8    *//    ");
//          System.out.println("     /////////////////////////////    ");
//                
//        
//        /*
//          Se debe desarrollador un programa que pida el ingreso del precio de un articulo y la cantidad que
//          lleva el cliente. mostear lo que debe abonar el comprador.
//          
//          abono = precio * cantidad
//          
//          */
//        
//        float precio_articulo;
//        int cantidad_producto;
//        float total;
//        
//        System.out.print("Ingrese por favor el precio del producto: ");
//        precio_articulo = teclado.nextFloat();
//        
//        System.out.print("Ingrese por favor la cantidad del producto que desea llevar: ");
//        cantidad_producto = teclado.nextInt();
//        
//        total = precio_articulo * cantidad_producto;
//        
//        System.out.println("El preecio a pagar por el comprador es de: " + total);
//        
//
//          System.out.println("     /////////////////////////////    ");
//          System.out.println("    //*      EJERCISIO 9    *//    ");
//          System.out.println("     /////////////////////////////    ");
//                
//          /*
//          Crear una aplicacion que calcule la edad de una persona,
//          para calcular la edad necesitaremos su fecha de nacimiento y fecha actual
//          
//          */
//        
//          int fecha_nacimiento;
//          int fecha_actual;
//          int edad;
//          
//          System.out.print("Ingrese por favor la fecha de nacimeinto: ");
//          fecha_nacimiento = teclado.nextInt();
//          
//          System.out.print("Ingrese por favor la fecha actual: ");
//          fecha_actual = teclado.nextInt();
//          
//          edad = fecha_actual - fecha_nacimiento;
//          
//          System.out.println("La edad de la persona es: " +  edad);
          

//
//
//
//          System.out.println("     /////////////////////////////    ");
//          System.out.println("     //*      EJERCISIO 10    *//    ");
//          System.out.println("     /////////////////////////////    ");
//                
          
//          /*
//          Crear una aplicacion que calcule el area de un trapecio
//          
//          S = h *( B + b )
//                --------
//                    2
//          
//          h -> Altura
//          B -> base mayor
//          b -> base menor
//          
//          */
//          
//          double h;
//          double B;
//          double b;
//          double area_trapecio;
//          
//          System.out.println("Ingrese por favor el valor de h,'Altura': ");
//          h = teclado.nextDouble();
//          
//          System.out.println("Ingrese por favor el valor de B,'Base mayor': ");
//          B = teclado.nextDouble();
//          
//          System.out.println("Ingrese por favor el valor de b,'base menor': ");
//          b = teclado.nextDouble();
//          
//          area_trapecio = h * (B + b) / 2;        
//          
//          System.out.println("El area del trapecio es: " + area_trapecio);
//        

//
//          System.out.println("     /////////////////////////////    ");
//          System.out.println("     //*      EJERCISIO 11    *//    ");
//          System.out.println("     /////////////////////////////    ");
//               

//          /*
//          Crear una aplicacion que nos pida dos caracteres
//          por teclado, y dados esos caracteres sumarlos y mostrarlos
//          */
//          
//          
//          char letra_a;
//          char letra_e;
//          String suma_caracter = " ";
//                  
//          System.out.println("Ingrese la primera letra: ");
//          letra_a = teclado.next().charAt(0);
//          
//          System.out.println("Ingrese la segunda letra: ");
//          letra_e = teclado.next().charAt(0);
//          
//         //suma_caracter += letra_a + " " + letra_e;// Muestra las letras
//         suma_caracter += letra_a + letra_e; 
//          System.out.println("La suma de caracteres es: " + suma_caracter );
       
          
//          
//          
//
//          System.out.println("     /////////////////////////////    ");
//          System.out.println("     //*      EJERCISIO 12    *//    ");
//          System.out.println("     /////////////////////////////    ");
//
//
//          /*
//           Crear una aplicacion que nos pida 2 cadenas(String)
//           por teclado, y de dicha cadena mostrar su combinacion o 
//           sumar por pantalla
//          */
//          
//          String cadena_numero1 = "";
//          String cadena_numero2 = "";
//          String suma_cadenass = "";
//          
//          System.out.println("Por favor ingrese la primera cadena: ");
//          cadena_numero1 = teclado.next();
//          
//          System.out.println("Por favor ingrese la primera cadena: ");
//          cadena_numero2 = teclado.next();
//          
//          
//         suma_cadenass = cadena_numero1 + " " + cadena_numero2;
//         
//         System.out.println("El valor de la cadena es: " + suma_cadenass);
//         
//         
          

//          System.out.println("     /////////////////////////////    ");
//          System.out.println("     //*      EJERCISIO 13    *//    ");
//          System.out.println("     /////////////////////////////    ");          
//          
//          
//          /*
//            Crear una aplicacion que calcule un numero a un exponente X.
//          */
//          
//          
//          int numero;
//          int exponente;
//          
//          System.out.println("Ingrese el numero: ");
//          numero = teclado.nextInt();
//          
//          
//          System.out.println("Ingrese el exponente: ");
//          exponente = teclado.nextInt();
//          
//          
//          
//          int resultado_exp = (int) Math.pow(numero, exponente);
//          
//          System.out.println("El numero " + numero + " Elevado al exponente " 
//                  + exponente + " es: " +resultado_exp);
//        
//          
//
//
//          System.out.println("     /////////////////////////////    ");
//          System.out.println("     //*      EJERCISIO 14    *//    ");
//          System.out.println("     /////////////////////////////    ");           
//          
//          /*
//          Crear una aplicacion que calcule el area de un circulo
//          
//          */
//          
//          double area_circulo;
//          double resul_area_circulo;
//          
//          System.out.println("Ingrese el area del circulo: ");
//          area_circulo = teclado.nextDouble();
//          
//          resul_area_circulo = Math.PI * (area_circulo * area_circulo);
//          
//          System.out.println("El valor del area del circulo es: " + resul_area_circulo);
//          
//          
//          
//          System.out.println("     /////////////////////////////    ");
//          System.out.println("     //*      EJERCISIO 15    *//    ");
//          System.out.println("     /////////////////////////////    "); 
//          
//          
//          /*
//          Crear una aplicacion que calcule la raiz cuadrada de un numero 
//          */
//          
//          double numero_raiz;
//          double raiz_cuadrada;
//          
//          System.out.println("Ingrese por favor el numero del cual desea saber su raiz cuadrada: ");
//          numero_raiz = teclado.nextDouble();
//          
//          raiz_cuadrada = Math.sqrt(numero_raiz);
//
//          
//          
//         System.out.println("La raiz cuadrada del numero es: " + raiz_cuadrada);
//          

          
          System.out.println("     /////////////////////////////    ");
          System.out.println("     //*      EJERCISIO 16    *//    ");
          System.out.println("     /////////////////////////////    "); 
          
          /*
          Crear una aplicacion que te pida 3 numeros por teclado 
          y una ves dados los numeros calcular su promedio y finalmente 
          muestra su promedio al cubo
          */



        
    }
    
}
