<?php
 
 $base = 5; // numero a multiplicar 
 $exp  = 4; // l;as veces quie se multiplicara el numero 
 $result = 1; // donde se guardara el resultado

//  $i = 1;

for ($i = 0; $i <= $exp; $i++){
    $result = $result * $base;
}

echo "El valor de $base elevado a $exp es: $result";