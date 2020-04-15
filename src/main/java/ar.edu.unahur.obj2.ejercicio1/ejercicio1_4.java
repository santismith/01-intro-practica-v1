package ar.edu.unahur.obj2.ejercicio1;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio1_4 {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        int cantidad = 0;
        String nombre ;
        String apellido ;
        String letra ;
        System.out.println("Ingrese cantidad de alumnos :");
        cantidad= teclado.nextInt() ;
        Alumno[] alumnos = new Alumno[cantidad];

        for (int i =0 ; i< alumnos.length ; i ++){
            System.out.println("Ingrese nombre");
            nombre = teclado.nextLine() ;
            System.out.println("Ingrese apellido");
            apellido=teclado.nextLine() ;
            alumnos[i] = new Alumno(nombre,apellido) ;
        }

        System.out.println("Ingrese letra :");
        letra = teclado.nextLine() ;


        System.out.println("Los alumnos que comienzan con dicha letra son :");

        for(int j =0 ; j<alumnos.length ; j++){
            if(alumnos[j].getNombre().startsWith(letra)){
                System.out.println(alumnos[j]) ;
            }
        }

    }

}


class Alumno{
    private String nombre ;
    private String apellido ;

    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                 nombre + '\'' +
                 apellido + '\'' +
                '}';
    }
}
