<?php

$nombres = ['Mauricio', 'Andres','Kvothe','uthred','Raknarck'];

// echo $nombres[0];  Buscar e imprimir un valor en el array

// Primer parametro el valor del array a iterar osea el nombre 
// Segundo Parametro una variable donde se quiere que se guarde el o los valores temporalmente
// Si se quiere saber el indice de cada valor del array se agrega una nueva variable que lo alm acene
// en este caso le llamarenos $indice pero no es obligatorio
foreach ($nombres as $indice => $nombre){
    // echo $nombre . "<br>";
    echo $nombre . " Se encontraba en el indice: $indice" . "<br>";
}