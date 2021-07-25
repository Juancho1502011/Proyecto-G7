package GestiónDeCompras;

import java.util.ArrayList;

public class ListaDeCompras {
    private ArrayList<Compra> listaCompras;

    public ListaDeCompras() {
        this.listaCompras = new ArrayList<Compra>();
    }

    public int añadirCompra(Compra compra){
        this.listaCompras.add(compra);
        return this.listaCompras.indexOf(compra);
    }

    public ArrayList<Compra> getListaCompras() {
        return listaCompras;
    }
}
