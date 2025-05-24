// See https://aka.ms/new-console-template for more information


// int a = 10;
// int b = 20;

// if(a > b) {
//     Console.WriteLine("Si a es mayor o igual a b");
// }else {
//     Console.WriteLine("Oye chico asi no es eso");
// }

using System;

namespace HelloWorld
{
    class HelloWorld 
    {
      static void Main(string[] args)
        {
            // comentario simple
            /*
            Comentario Multiline
            */
            Console.WriteLine("Hello, C#!");

            string MyName = "Andres Mauricio Jimenez Chavez";
            // Se le asigna un nuevo valor a la variable
            MyName = "Kvothe the name of the wind";
            Console.WriteLine(MyName);

            int MyInt = 2003;
            MyInt = MyInt + 3;
            MyInt-=4;
            Console.WriteLine(MyInt);

        }

    } 

}

