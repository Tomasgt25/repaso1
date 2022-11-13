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

    public Empleado empleadoMasRico(){
        Empleado aux= new Empleado();
        if (aux == null) {
            aux = plantilla[0];
        }

            for (int i = 0; i < plantilla.length; i++) {
            if (aux.getSueldo()< plantilla[i].getSueldo()){
                aux = plantilla[i];
            }
            }

        return aux;
    }
}
