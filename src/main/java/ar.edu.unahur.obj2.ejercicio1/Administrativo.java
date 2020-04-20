package ar.edu.unahur.obj2.ejercicio1;

public class Administrativo extends Empleado{

    public int hsExtras ;
    public int hsMes ;


    public Administrativo(int dni, String nombre, String apellido, String email, float sueldoBase, int hsExtras, int hsMes) {
        super(dni, nombre, apellido, email, sueldoBase);
        this.hsExtras = hsExtras;
        this.hsMes = hsMes;
    }

    public void setHsExtras(int hsExtras){
        this.hsExtras = hsExtras;
    }

    public void setHsMes(int hsMes){
        this.hsMes = hsMes ;
    }

    public int getHsExtras() {
        return hsExtras;
    }

    public int getHsMes() {
        return hsMes;
    }

    @Override
    public float getSueldoBase() {
        return (float) (super.getSueldoBase() * ((hsExtras+1.5)+hsMes) /hsMes);
    }
}
