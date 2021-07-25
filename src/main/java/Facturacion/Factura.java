package Facturacion;

import GestorDeVentas.Venta;

public class Factura {
    private String numFactura;
    private String fechaEmision;

    private Venta venta;

    public Factura() {
    }

    public Factura(String numFactura, String fechaEmision, Venta venta) {
        this.numFactura = numFactura;
        this.fechaEmision = fechaEmision;
        this.venta = venta;
    }

    public String getNumFactura() {
        return numFactura;
    }
}
