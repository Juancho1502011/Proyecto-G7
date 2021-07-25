package Facturacion;

public interface WebServiceSRI {
    public AutorizationResponse requestAutorization(AutorizationRequest autorizationRequest);
    public ConsultaResponse obtenerFactura(ConsultaRequest consultaRequest);

}
