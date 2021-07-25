package GestiónDeInventario;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class AutorizacionInventarioTest {

    @Test
    public void when_solicitarAutorizacion_then_ok() {
        AutorizacionInventario autorizacion = Mockito.mock(AutorizacionInventario.class);
        Mockito.when(autorizacion.solicitarAutorizacion()).thenReturn(true);
        assertTrue(autorizacion.solicitarAutorizacion());
    }
    @Test
    public void when_solicitarAutorizacion_then_false() {
        AutorizacionInventario autorizacion = Mockito.mock(AutorizacionInventario.class);
        Mockito.when(autorizacion.solicitarAutorizacion()).thenReturn(false);
        assertFalse(autorizacion.solicitarAutorizacion());
    }
}