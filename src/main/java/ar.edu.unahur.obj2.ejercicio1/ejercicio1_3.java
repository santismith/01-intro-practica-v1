package ar.edu.unahur.obj2.ejercicio1;

import java.util.Scanner;

public class ejercicio1_3 {
    public static void main(String[] args) {

    float [] temperaturas= new float[4] ;
    Scanner teclado = new Scanner(System.in) ;
    float tempMax ,tempMin ;
    tempMax=tempMin= temperaturas[0];

    for (int i = 0 ;i<= temperaturas.length -1; i++){
        System.out.println("Ingrese temperatura en la hora: " + (i+1) );
        temperaturas[i] = teclado.nextFloat() ;

        if (temperaturas[i] > tempMax){
            tempMax = temperaturas[i] ;
        }

        if (temperaturas[i]< tempMin) {
            tempMin = temperaturas[i];
        }
    }

    for (int i=0 ; i<= temperaturas.length-1 ; i++) {
        System.out.println("Dia " + (i+1) + " "+temperaturas[i] + " C");

    }

        System.out.println("La temperatura minima fue: " + tempMin);
        System.out.println("La temperatura máxima fue: " + tempMax);
        System.out.println("La media fue de : " + (tempMax+tempMin/2));

    }
}
