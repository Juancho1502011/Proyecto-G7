package Facturacion;

import GestiónDeInventario.Auto;
import GestorDeVentas.Cliente;
import GestorDeVentas.Empleado;
import GestorDeVentas.Venta;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListaDeFacturasTest {

    private ListaDeFacturas facturas;

    @Before
    public void setUp(){
        facturas=new ListaDeFacturas();
    }

    @Test
    public void given_Factura_when_añadirFactura_then_ok(){
        Factura factura = new Factura("2012456895","19/04/2021",new Venta(new Auto("Chevrolet",
                "Grand vitara", 2019, "85439685", "verde"), new Cliente("Andrés",
                "1234567890", "Quito"), "20/05/2020", new Empleado("Carlos", "0987654321",
                "Latacunga")));
        assertTrue(facturas.añadirFactura(factura));
    }

    @Test
    public void given_numFactura_when_exist_then_ok(){
        Factura factura = new Factura("2012456895","19/04/2021",new Venta(new Auto("Chevrolet",
                "Grand vitara", 2019, "85439685", "verde"), new Cliente("Andrés",
                "1234567890", "Quito"), "20/05/2020", new Empleado("Carlos", "0987654321",
                "Latacunga")));
        facturas.añadirFactura(factura);
        assertNotNull(facturas.buscarFactura("2012456895"));
    }


    @Test
    public void given_numFactura_when_not_exist_then_null(){
        assertNull(facturas.buscarFactura("2012456895"));
    }
}