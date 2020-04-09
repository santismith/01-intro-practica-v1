package ar.edu.unahur.obj2.ejercicio1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in) ;
        int num = 3 ;

        int v[] = new int[5] ;

        for (int i = 0 ;i<= v.length-1 ; i++){
            System.out.println("Ingrese numero ");
            v[i]= teclado.nextInt();
        }

        for (int i=0 ; i<=v.length-1 ; i++) {
            if (v[i]>num) {
                System.out.println("Los numeros mayores a " + num + "son:" + v[i] + " ");
            }
        }
    }
}
