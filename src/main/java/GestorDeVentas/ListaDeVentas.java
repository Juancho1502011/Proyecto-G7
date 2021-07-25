package GestorDeVentas;

import java.util.ArrayList;

public class ListaDeVentas {

    private ArrayList<Venta> listaVentas= new ArrayList<>();


    public boolean añadirVenta(Venta venta){
        boolean add = listaVentas.add(venta);
        return add;
    }

    public void mostrarVentas(){
        for(int i = 0; i< listaVentas.size(); i++){
            System.out.println(i+1+".- "+listaVentas.get(i));
        }
    }
}
