package Facturacion;

import java.util.ArrayList;

public class ListaDeFacturas {
    private ArrayList<Factura> facturas;

    public ListaDeFacturas() {
        this.facturas = new ArrayList<Factura>();
    }

    public Factura buscarFactura(String s) {
        Factura resultado = null;
        for (Factura f : facturas) {
            if (s.equalsIgnoreCase(f.getNumFactura())) {
                resultado = f;
                return resultado;
            }
        }
        return resultado;
    }

    public boolean añadirFactura(Factura f) {
        return facturas.add(f);
    }

}
