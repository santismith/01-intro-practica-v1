package ar.edu.unahur.obj2.ejercicio1;

import java.util.Scanner;

public class ejercicio1_3 {
    public static void main(String[] args) {

    float [] temperaturasDelDia= new float[4] ;
    Scanner teclado = new Scanner(System.in) ;
    float tempMax ,tempMin ;
    tempMax=tempMin= temperaturasDelDia[0];

    for (int i = 0 ;i<= temperaturasDelDia.length -1; i++){
        System.out.println("Ingrese temperatura en la hora: " + (i+1) );
        temperaturasDelDia[i] = teclado.nextFloat() ;

        if (temperaturasDelDia[i] > tempMax){
            tempMax = temperaturasDelDia[i] ;
        }

        if (temperaturasDelDia[i]< tempMin) {
            tempMin = temperaturasDelDia[i];
        }
    }

    for (int i=0 ; i<= temperaturasDelDia.length-1 ; i++) {
        System.out.println("Dia " + (i+1) + " "+temperaturasDelDia[i] + " C");

    }

        System.out.println("La temperatura minima fue: " + tempMin);
        System.out.println("La temperatura máxima fue: " + tempMax);
        System.out.println("La media fue de : " + (tempMax+tempMin/2));

    }
}
