package Facturacion;

import GestiónDeInventario.Auto;
import GestorDeVentas.Cliente;
import GestorDeVentas.Empleado;
import GestorDeVentas.Venta;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class FacturacionTest {

    private Facturacion facturacion;

    @Before
    public void setup(){
        facturacion = new Facturacion();
    }

    @Test
    public void given_venta_not_null_when_crearFactura_then_ok() {
        Venta venta = new Venta(new Auto("Chevrolet", "Grand vitara", 2019, "85439685",
                "verde"), new Cliente("Andrés", "1234567890", "Quito"), "20/05/2020",
                new Empleado("Carlos", "0987654321", "Latacunga"));
        assertEquals(Factura.class, facturacion.crearFactura(venta).getClass());
    }

    @Test (expected = NullPointerException.class)
    public void given_venta_null_when_crearFactura_then_exception() {
        Venta venta = new Venta();
        assertSame(Factura.class,facturacion.crearFactura(venta).getClass());
    }
}