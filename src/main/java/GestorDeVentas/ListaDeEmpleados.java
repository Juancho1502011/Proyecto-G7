package GestorDeVentas;

import java.util.ArrayList;

public class ListaDeEmpleados {
    private ArrayList<Empleado> listaEmpleados = new ArrayList<>();

    public ListaDeEmpleados() {
        this.listaEmpleados.add(new Empleado("Juan Carlos","1236524512", "Quito"));
    }

    public boolean añadirEmpleado(Empleado empleado){
        listaEmpleados.add(empleado);
        return true;
    }
    public boolean eliminarEmpleado(Empleado empleado){
        listaEmpleados.remove(empleado);
        return true;
    }
    public Empleado buscarEmpleado(int empleado){
        return listaEmpleados.get(empleado-1);
    }

    public void mostrarEmpleados(){
        for(int i = 0; i< listaEmpleados.size(); i++){
            System.out.println(i+1+".- "+listaEmpleados.get(i));
        }
    }
}
