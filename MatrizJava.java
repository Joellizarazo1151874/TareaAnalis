/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.matrizjava;


import java.util.Scanner;

public class MatrizJava {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Se lee el número de casos de prueba que se van a ejecutar
        int n = 1;

        // Se ejecuta el ciclo while mientras el número de casos de prueba sea mayor que cero
        while (n > 0) {
            // Se lee la cantidad de filas y columnas de la matriz que se va a crear
            System.out.println("numero de filas");
            int a = sc.nextInt();
            System.out.println("numero de columnas");
            int b = sc.nextInt();
            long startTime = System.nanoTime();
            // Se crea una matriz de dos dimensiones AB con las dimensiones especificadas
            int[][] AB = new int[a][b];

            // Se crea otra matriz de dos dimensiones M con las mismas dimensiones que AB
            int[][] M = new int[a][b];

            // Se recorre la matriz AB y se copian los valores ingresados por el usuario a la matriz M
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    AB[i][j] = (int) (Math.random() * 7);
                    M[i][j] = AB[i][j];
                }
            }
             for (int i = 0; i < AB.length; i++) {
                for (int j = 0; j < AB[i].length; j++) {
                    System.out.print(AB[i][j] + " ");
                }
                System.out.println(); // Salto de línea para separar cada fila de la matriz
            }
            // Se recorre la matriz M y se aplican las siguientes reglas:
            // - Si la fila es par, se suma 1 al valor actual de la celda.
            // - Si la columna es par, se suma 2 al valor actual de la celda.
            // - Si la fila y la columna son impares, se resta 3 al valor actual de la celda.
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    if (i == 0 || i % 2 == 0) {
                        M[i][j] += 1;
                    }
                    if (j == 0 || j % 2 == 0) {
                        M[i][j] += 2;
                    }
                    if (i % 2 != 0 && j % 2 != 0) {
                        M[i][j] -= 3;
                    }
                }
            }
            System.out.println("------------------------");
            // Se llama a la función imprimirMatriz para mostrar la matriz resultante
            for (int i = 0; i < M.length; i++) {
                for (int j = 0; j < M[i].length; j++) {
                    System.out.print(M[i][j] + " ");
                }
                System.out.println(); // Salto de línea para separar cada fila de la matriz
            }

            // Se resta uno al número de casos de prueba que quedan por ejecutar
            n--;
            long endTime = System.nanoTime();
            double duration = (endTime - startTime) / 1000000.0;
            double duration2 = duration / 1000.0;
            System.out.printf("El tiempo de ejecución fue de %.5f segundos", duration2);
        }
        
    }

    public static void imprimirMatriz(int M[][]) {
        // Se recorre la matriz y se imprime por pantalla
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                if (j == M[i].length - 1) {
                    System.out.print(M[i][j]);
                } else {
                    System.out.print(M[i][j] + " ");
                }
            }
        }
    }
}
