package Repaso1;
//Tiempo total 1h y 5 minutos
public class Main {
    public static void main(String[] args) {

        //Mirado

        Empleado empleado1 = new Empleado(1341234, "Fulanito", 1700);
        Empleado empleado2 = new Empleado(8932714, "Menganito", 1800);
        Empleado empleado3 = new Empleado(6786798, "Juanito", 1900);
        Empleado empleado4 = new Empleado(7968965, "Jorgito", 1000);
        Empleado empleado5 = new Empleado(2454654, "Jaimito", 1200);

        //Mirado

        Plantilla plantilla1 = new Plantilla();

        //Mirado

        plantilla1.añadirEmpleado(empleado1);
        plantilla1.añadirEmpleado(empleado2);
        plantilla1.añadirEmpleado(empleado3);
        plantilla1.añadirEmpleado(empleado4);
        plantilla1.añadirEmpleado(empleado5);


        plantilla1.mostrarEmpleados();
        System.out.println("El empleado más rico es: " + plantilla1.empleadoMasRico().getNombre());

    }
}
