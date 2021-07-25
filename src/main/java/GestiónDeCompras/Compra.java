package GestiónDeCompras;

import java.util.ArrayList;

public class Compra {
    private ArrayList<DetalleCompra> listaDetalleCompra;
    private Fabricante fabricante;
    private String fecha;

    public Compra(ArrayList<DetalleCompra> listaDetalleCompra, Fabricante fabricante, String fecha) {
        this.listaDetalleCompra = listaDetalleCompra;
        this.fabricante = fabricante;
        this.fecha = fecha;
    }

    public String actualizarCompra(String fecha, Fabricante fabricante){
        this.fecha=fecha;
        this.fabricante=fabricante;
        return "Compra actualizada correctamente";
    }

    public String agregarDetalle(DetalleCompra detalle){
        this.listaDetalleCompra.add(detalle);
        return "detalle agregado correctamente";
    }

    public ArrayList<DetalleCompra> getListaDetalleCompra() {
        return listaDetalleCompra;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public String getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        ArrayList hola = new ArrayList();
        hola.add("hola1");
        hola.add("Hola2");
        return "Fecha=" + fecha + '\n' +
                "Fabricante=" + fabricante.getNombre()+"\n"+
                listaDetalleCompra.toString()
                ;
    }
}
