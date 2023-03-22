<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Project/PHP/PHPProject.php to edit this template
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <?php

        // Se lee la cantidad de filas y columnas de la matriz que se va a crear
        $a = (int)100;
        echo "numero de filas: {$a}\n<br>";
        $b = (int)100;
        echo "numero de columnas: {$a}\n<br>";
        $start_time = microtime(true);

        $AB = array();
        for ($i = 0; $i < $a; $i++) {
            $row = array();
            for ($j = 0; $j < $b; $j++) {
                $row[] = rand(0, 7);
            }
            $AB[] = $row;
        }
        $M = array();
        for ($i = 0; $i < $a; $i++) {
            $row = array();
            for ($j = 0; $j < $b; $j++) {
                $row[] = $AB[$i][$j];
            }
            $M[] = $row;
        }

        for ($i = 0; $i < $a; $i++) {
            for ($j = 0; $j < $b; $j++) {
                if ($i == 0 || $i % 2 == 0) {
                    $M[$i][$j] += 1;
                }
                if ($j == 0 || $j % 2 == 0) {
                    $M[$i][$j] += 2;
                }
                if ($i % 2 != 0 && $j % 2 != 0) {
                    $M[$i][$j] -= 3;
                }
            }
        }

        // Se imprime la matriz AB
        echo "Matriz AB:\n<br>";
        for ($i = 0; $i < $a; $i++) {
            for ($j = 0; $j < $b; $j++) {
                echo $AB[$i][$j] . ' ';
            }
            echo "\n<br>";
        }

        // Se imprime la matriz M
        echo "------------------------\n<br>";
        echo "Matriz M:\n<br>";
        for ($i = 0; $i < $a; $i++) {
            for ($j = 0; $j < $b; $j++) {
                echo $M[$i][$j] . ' ';
            }
            echo "\n<br>";
        }

        // Se calcula el tiempo de ejecución
        $end_time = microtime(true);
        $execution_time = ($end_time - $start_time) * 1000; // Convertir a milisegundos

        echo "El tiempo de ejecución fue de {$execution_time} milisegundos";

        ?>
    </body>
</html>
