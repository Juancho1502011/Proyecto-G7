package InterfazDeUsuario;

import GestiónDeCompras.*;
import GestiónDeInventario.ListaDeAutos;

import java.util.ArrayList;
import java.util.Scanner;

public class InterfazRegistrarCompra {

    private ListaDeFabricantes fabricantes;
    private ListaDeCompras compras;
    private ListaDeAutos autos;

    public InterfazRegistrarCompra() {
        this.fabricantes = new ListaDeFabricantes();
        this.compras = new ListaDeCompras();
        this.autos = new ListaDeAutos();
    }

    public String registrarCompra(){
        int auto,cantidad;
        Fabricante fabricante;
        DetalleCompra detalle;
        String fecha;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido, seleccione el fabricante:");
        System.out.print(fabricantes.mostrarFabricantes());
        fabricante=fabricantes.getListaFabricantes().get(entrada.nextInt());
        System.out.println("Ingrese la fecha de compra:");
        entrada.nextLine();
        fecha=entrada.nextLine();
        Compra compra = new Compra(new ArrayList<DetalleCompra>(),fabricante,fecha);
        do{
            System.out.println("Seleccione un auto");
            System.out.print(autos.mostrarAutosPorFabricante(fabricante.getNombre()));
            auto=entrada.nextInt();
            System.out.println("Ingrese la cantidad");
            cantidad=entrada.nextInt();
            detalle=new DetalleCompra(autos.buscarAuto(fabricante.getNombre()).get(auto),cantidad);
            compra.agregarDetalle(detalle);
        }while (agregarvehiculoscompra(entrada));
        compras.añadirCompra(compra);
        System.out.println("Compra registrada exitosamente");
        return compra.toString();
    }

    private boolean agregarvehiculoscompra(Scanner entrada) {
        System.out.println("¿Desea comprar más autos?");
        System.out.println("1. Si");
        System.out.println("2. No");;
        if(entrada.nextInt()==2){
            return false;
        }else{
            return true;
        }
    }

}
