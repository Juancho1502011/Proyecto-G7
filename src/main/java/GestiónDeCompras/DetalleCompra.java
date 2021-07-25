package GestiónDeCompras;

import GestiónDeInventario.Auto;

public class DetalleCompra {
    private Auto auto;
    private int cantidad;

    public DetalleCompra(Auto auto, int cantidad) {
        this.auto = auto;
        this.cantidad = cantidad;
    }

    public Auto getAuto() {
        return auto;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "* "+auto.toString() +
                ", cantidad=" + cantidad +"\n";
    }
}
