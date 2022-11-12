public class Plantilla {

    Empleado[] plantilla;

    Plantilla(){
        this.plantilla= new Empleado[5];
    }
    public void añadirEmpleado(Empleado empleado){
        for (int i = 0; i < plantilla.length; i++) {
            if (plantilla[i] == null){
                plantilla[i] = empleado;
                break;
            }
        }
    }
    public void mostrarEmpleados(){
        for (Empleado empleado: plantilla) {
            System.out.println(empleado);
        }
    }

    void empleadoMasRico(){
        for (int i = 0; i < plantilla.length; i++) {
            
        }

    }
}
