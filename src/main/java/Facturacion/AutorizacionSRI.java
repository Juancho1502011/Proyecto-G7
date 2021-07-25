package Facturacion;

public class AutorizacionSRI {
    private WebServiceSRI webservice;

    public AutorizacionSRI(WebServiceSRI webservice) {
        this.webservice = webservice;
    }

    public boolean solicitarAutorizacion(Factura factura) {
        AutorizationResponse response = webservice.requestAutorization(new AutorizationRequest(factura));
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (response.getStatus() == AutorizationResponse.AutorizationStatus.AUTORIZADO) {
            return true;
        } else {
            return false;
        }
    }

    public Factura consultarFactura(String numFactura) {
        ConsultaResponse response = webservice.obtenerFactura(new ConsultaRequest(numFactura));
        if (response.getStatus() == ConsultaResponse.ConsultaStatus.OK) {
            return new Factura();
        } else {
            return null;
        }
    }
}
