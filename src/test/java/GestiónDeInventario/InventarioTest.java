package GestiónDeInventario;

import org.junit.Test;

import static org.junit.Assert.*;

public class InventarioTest {
    @Test
    public void when_mostrarInventario_then_ok(){
        Inventario inventario = new Inventario();
        assertEquals(String.class, inventario.autos.mostrarInventario().getClass());
    }

    @Test
    public void given_auto_when_aumentarInventario_then_ok(){
        Inventario inventario = new Inventario();
        int cantidad = 5;
        int actual = inventario.aumentarInventario(
                new Auto("Chevrolet","Grand Vitara",2021, "rojo"), cantidad);
        assertEquals(5, actual);
    }
}