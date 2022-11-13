package Repaso1;

import java.util.Scanner;

public class Gestor {
    public static void main(String[] args) {
        int a;
        Plantilla plantilla2 = new Plantilla();
        Scanner teclado = new Scanner(System.in);
        do {
        System.out.println("\n 1. Añadir usuario, \n 2. Mostrar plantilla, \n 3. Mostrar empleado más rico, \n 4. Salir.");
        a= teclado.nextInt();

            switch (a){

                case 1:
                    plantilla2.añadirEmpleado(crearEmpleado()); //Ojo! Estudiar por qué deja hacer esto.
                    break;

                case 2:
                    plantilla2.mostrarEmpleados();
                    break;

                case 3:
                    System.out.println(plantilla2.empleadoMasRico());
                    break;

            }

        } while (a != 4);
    }

    private static Empleado crearEmpleado() {
        int auxDni, auxSueldo;
        String auxNombre;
        Empleado aux;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el dni");
        auxDni= teclado.nextInt();
        System.out.println("Introduzca el nombre");
        teclado.nextLine();
        auxNombre= teclado.nextLine();
        System.out.println("Introduzca el sueldo");
        auxSueldo= teclado.nextInt();
        aux = new Empleado(auxDni, auxNombre, auxSueldo);
        return aux;
    }
}
