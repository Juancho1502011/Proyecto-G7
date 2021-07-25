package GestiónDeInventario;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class AutorizacionInventarioTest {

    AutorizacionInventario autorizacion=null;

    @Before
    public void setup(){
        autorizacion = Mockito.mock(AutorizacionInventario.class);
    }

    @Test
    public void when_solicitarAutorizacion_then_ok() {
        Mockito.when(autorizacion.solicitarAutorizacion()).thenReturn(true);
        assertTrue(autorizacion.solicitarAutorizacion());
    }
    @Test
    public void when_solicitarAutorizacion_then_false() {
        Mockito.when(autorizacion.solicitarAutorizacion()).thenReturn(false);
        assertFalse(autorizacion.solicitarAutorizacion());
    }
}