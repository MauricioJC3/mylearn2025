 <?php

for ($i=1; $i <= 20; $i++) { 

    // if ($i == 11){
    //     break; // Se sale del bloque osea llega hasta la condicion
    // }

    // if($i == 7 || $i == 15){
    //     continue; // Me va a llevar a la parte final del bucle y va a ignorar el numero 7 en este caso
    //     // Osea permite agregar condiciones para no ejecutar ciertas cosas y despues poder continuar
    // }

    // Si se quiere que se cierre la ejecusion o que termine el programa se puede utilizar 
    // Exit o die
    if($i == 7 || $i == 15){
        exit();
        // die();
    }


    echo $i . "<br>";
}

echo "Esta linea no se ejecutara";
// echo "Saliste del bloque";

