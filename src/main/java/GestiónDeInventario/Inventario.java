package GestiónDeInventario;

public class Inventario {

    ListaDeAutos autos;

    public Inventario() {
        this.autos = new ListaDeAutos();
    }

    public int aumentarInventario(Auto auto, int cantidad) {
        Auto a = autos.buscarAutosComunes(auto);
        a.setCantidad(a.getCantidad() + cantidad);
        return a.getCantidad();
    }
}
