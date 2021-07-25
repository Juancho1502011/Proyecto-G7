package GestiónDeInventario;

import org.junit.Test;

import static org.junit.Assert.*;

public class InventarioTest {
    @Test
    public void when_mostrarInventario_then_ok(){
        Inventario inventario = new Inventario();
        assertEquals(String.class, inventario.autos.mostrarInventario().getClass());
    }
}