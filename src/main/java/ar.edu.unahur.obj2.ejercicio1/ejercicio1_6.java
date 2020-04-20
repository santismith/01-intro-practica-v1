package ar.edu.unahur.obj2.ejercicio1;

import java.util.Scanner;

public class ejercicio1_6 {

    public static void main(String[] args) {

        int[][] matriz = new int[3][3];
        Scanner teclado = new Scanner(System.in);


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                    System.out.println("Inserte valor en " + "[" + i + "]" + "[" + j + "]");
                    matriz[i][j] = teclado.nextInt();
                }
            }


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}

