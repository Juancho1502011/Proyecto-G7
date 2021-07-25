package Facturacion;

import GestorDeVentas.Venta;

public class Facturacion {

    public Factura crearFactura(Venta venta) {
        return new Factura(venta.crearNumeroFactura(), venta.getFecha(), venta);
    }
}
