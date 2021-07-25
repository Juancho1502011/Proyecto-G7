package Facturacion;

public class AutorizationRequest {
    private Factura factura;

    public AutorizationRequest(Factura factura) {
        this.factura = factura;
    }

    public Factura getFactura() {
        return factura;
    }
}
