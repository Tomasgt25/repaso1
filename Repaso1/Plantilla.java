package Repaso1;

public class Plantilla {

    Empleado[] plantilla;

    //Mirado
    Plantilla(){
        this.plantilla= new Empleado[5];
    }

    //Mirado
    public void añadirEmpleado(Empleado empleado){
        for (int i = 0; i < plantilla.length; i++) {
            if (plantilla[i] == null){
                plantilla[i] = empleado;
                break;
            }
        }
    }

    //Mirado
    public void mostrarEmpleados(){
        for (Empleado empleado: plantilla) {
            System.out.println(empleado);
        }
    }

    //Mirado y no logrado

    public void empleadoMasRico(String sueldoBuscado){
        for (int i = 0; i < plantilla.length; i++) {
            if (sueldoBuscado.equals(plantilla[i].getSueldo())) {

            }
        }


    }


}
