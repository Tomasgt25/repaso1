package Repaso1;

public class Empleado {

    private int dni;

    private String nombre;

    private int sueldo;

    Empleado(){}

    Empleado(int dni, String nombre, int sueldo){

        this.dni=dni;
        this.nombre=nombre;
        this.sueldo=sueldo;

    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }


}
