package ar.edu.unahur.obj2.ejercicio1;

import java.util.Random;

public class ejercicio1_7 {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        int aleatorio;
        Random r = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; i < matriz.length; i++) {
                matriz[i][j] = r.nextInt(100);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; i < matriz.length; i++) {
                System.out.println(matriz[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }
}
