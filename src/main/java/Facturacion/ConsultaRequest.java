package Facturacion;

public class ConsultaRequest {
    private String numFactura;

    public ConsultaRequest(String numFactura) {
        this.numFactura = numFactura;
    }

    public String getNumFactura() {
        return numFactura;
    }
}
