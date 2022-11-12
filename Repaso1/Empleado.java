public class Empleado {

    private String dni;

    private String nombre;

    private float sueldo;

    Empleado(){}

    Empleado(String dni, String nombre, float sueldo){

        this.dni=dni;
        this.nombre=nombre;
        this.sueldo=sueldo;

    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
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
