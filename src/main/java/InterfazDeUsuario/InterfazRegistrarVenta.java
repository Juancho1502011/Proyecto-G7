package InterfazDeUsuario;

import GestiónDeInventario.Auto;
import GestiónDeInventario.ListaDeAutos;
import GestorDeVentas.*;

import java.util.Scanner;

class InterfazRegistrarVenta {
    private final ListaDeAutos listaDeAutos;
    private final ListaDeClientes listaDeClientes;
    private final ListaDeEmpleados listaDeEmpleados;
    private final ListaDeVentas listaDeVentas;

    public InterfazRegistrarVenta() {
        this.listaDeAutos = new ListaDeAutos();
        this.listaDeClientes = new ListaDeClientes();
        this.listaDeEmpleados = new ListaDeEmpleados();
        this.listaDeVentas = new ListaDeVentas();
    }

    public String crearVenta(){
        Cliente clienteEscogido = listaDeClientes.getClienteEscogido();
        Auto autoEscogido = listaDeAutos.getAutoEscogido();
        Empleado empleadoVenta = this.listaDeEmpleados.buscarEmpleado(1);
        Venta venta = new Venta(autoEscogido, clienteEscogido, getFecha(), empleadoVenta);
        if(venta.registrarVenta()){
            listaDeVentas.añadirVenta(venta);
            System.out.println("\nVenta registrada con éxito!\n");
            return venta.mostrarVenta();
        }
        return "";
    }

    private String getFecha() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese la fecha");
        return scanner.next();
    }
}