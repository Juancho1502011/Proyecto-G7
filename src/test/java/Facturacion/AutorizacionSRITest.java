package Facturacion;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class AutorizacionSRITest {

    WebServiceSRI webServiceSRI = null;
    AutorizacionSRI autorizacion = null;

    @Before
    public void setUp(){
         webServiceSRI = Mockito.mock(WebServiceSRI.class);
         autorizacion = new AutorizacionSRI(webServiceSRI);
    }
    @Test
    public void given_factura_when_is_correct_then_ok() {
        Mockito.when(webServiceSRI.requestAutorization(Mockito.any())).thenReturn(new AutorizationResponse(AutorizationResponse.AutorizationStatus.AUTORIZADO));
        Factura factura = new Factura();
        assertTrue(autorizacion.solicitarAutorizacion(factura));
    }

    @Test
    public void given_factura_when_is_wrong_then_error() {
        Mockito.when(webServiceSRI.requestAutorization(Mockito.any())).thenReturn(
                new AutorizationResponse(AutorizationResponse.AutorizationStatus.RECHAZADO));
        Factura factura = new Factura();
        assertFalse(autorizacion.solicitarAutorizacion(factura));
    }

    @Test (timeout = 300)
    public void given_factura_when_is_correct_then_timeout() {
        Mockito.when(webServiceSRI.requestAutorization(Mockito.any())).thenReturn(
                new AutorizationResponse(AutorizationResponse.AutorizationStatus.AUTORIZADO));
        Factura factura = new Factura();
        assertTrue(autorizacion.solicitarAutorizacion(factura));
    }

    @Test
    public void given_numFactura_when_is_correct_then_ok(){
        Mockito.when(webServiceSRI.obtenerFactura(Mockito.any())).thenReturn(new ConsultaResponse(ConsultaResponse.ConsultaStatus.OK));
        String numFactura = "";
        assertSame(Factura.class,autorizacion.consultarFactura(numFactura).getClass());
    }

    @Test
    public void given_numFactura_when_is_wrong_then_error(){
        Mockito.when(webServiceSRI.obtenerFactura(Mockito.any())).thenReturn(new ConsultaResponse(ConsultaResponse.ConsultaStatus.ERROR));
        String numFactura = "";
        assertNull(autorizacion.consultarFactura(numFactura));
    }
}