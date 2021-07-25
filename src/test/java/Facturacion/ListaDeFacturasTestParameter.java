package Facturacion;

import GestiónDeInventario.Auto;
import GestorDeVentas.Cliente;
import GestorDeVentas.Empleado;
import GestorDeVentas.Venta;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;

@RunWith(value= Parameterized.class)
public class ListaDeFacturasTestParameter {
    @Parameterized.Parameters
    public static Iterable<Object[]> parameters(){
        Factura factura1 = new Factura("2012456895","19/04/2021",new Venta(new Auto("Chevrolet",
                "Grand vitara", 2019, "verde"), new Cliente("Andrés",
                "1032568495", "Quito"), "20/05/2020", new Empleado("Carlos", "0987654321",
                "Latacunga")));
        Factura factura2 = new Factura("2021564882","18/06/2019",new Venta(new Auto("Chevrolet",
                "Grand vitara", 2019, "gris"), new Cliente("Andrés",
                "1032568495", "Quito"), "20/05/2020", new Empleado("Andres", "0264579134",
                "Quito")));
        Factura factura3 = new Factura("2015456456","12/10/2020",new Venta(new Auto("Chevrolet",
                "Grand vitara", 2019, "blanco"), new Cliente("Andrés",
                "1032568495", "Quito"), "20/05/2020", new Empleado("Pablo", "4365718920",
                "Guayaquil")));
        Factura factura4 = new Factura("2017164863","02/11/2020",new Venta(new Auto("Chevrolet",
                "Grand vitara", 2019, "rojo"), new Cliente("Andrés",
                "1032568495", "Quito"), "20/05/2020", new Empleado("Alex", "1953468020",
                "Cuenca")));
        Factura factura5 = new Factura("2020483548","17/02/2021",new Venta(new Auto("Chevrolet",
                "Grand vitara", 2019, "azul"), new Cliente("Andrés",
                "1032568495", "Quito"), "20/05/2020", new Empleado("verónica", "1234567890",
                "Ambato")));
        String string1="2012456895";
        String string2="2021564882";
        String string3="2015456456";
        String string4="2017164863";
        String string5="2020483547";

        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{factura1,string1});
        objects.add(new Object[]{factura2,string2});
        objects.add(new Object[]{factura3,string3});
        objects.add(new Object[]{factura4,string4});
        objects.add(new Object[]{factura5,string5});
        return objects;
    }

    private Factura factura;
    private String string;

    public ListaDeFacturasTestParameter(Factura factura,String numFac) {
        this.factura = factura;
        this.string = numFac;
    }


    @Test
    public void given_numFactura_when_exist_then_ok() {
        ListaDeFacturas facturas = new ListaDeFacturas();
        facturas.añadirFactura(factura);
        assertNotNull(facturas.buscarFactura(string));
    }
}