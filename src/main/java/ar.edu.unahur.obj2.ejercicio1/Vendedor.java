package ar.edu.unahur.obj2.ejercicio1;

public class Vendedor extends Empleado {

    public float porcenComision ;
    public int totalVentas ;

    public Vendedor(int dni, String nombre, String apellido, String email, float sueldoBase, float porcenComision, int totalVentas) {
        super(dni, nombre, apellido, email, sueldoBase);
        this.porcenComision = porcenComision;
        this.totalVentas = totalVentas;

    }

    public float getPorcenComision() {
        return porcenComision;
    }

    public void setPorcenComision(float porcenComision) {
        this.porcenComision = porcenComision;
    }

    public int getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(int totalVentas) {
        this.totalVentas = totalVentas;
    }

    @Override
    public float getSueldoBase() {
        return super.getSueldoBase()+(porcenComision+totalVentas/100);
    }
}
