package GestorDeVentas;

import GestiónDeInventario.Auto;

public class Venta {
    private Auto auto;
    private Cliente cliente;
    private String fecha;
    private Empleado empleado;

    public Venta() {
    }

    public Venta(Auto auto, Cliente cliente, String fecha, Empleado empleado) {
        this.auto = auto;
        this.cliente = cliente;
        this.fecha = fecha;
        this.empleado = empleado;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public boolean registrarVenta() {
        return true;
    }

    public String mostrarVenta() {
        String textoVenta =
                "Fecha: " + fecha + "\nCliente\nNombre: " + cliente.getNombre() +
                        "\nCédula: " + cliente.getCedula() +
                        "\nDirección: " + cliente.getDireccion() +
                        "\nDetalle\nMarca       Modelo      Año     Número de Serie     Color\n"
                        + auto.getMarca() + "      " + auto.getModelo() + "      " + auto.getAño() + "      " + auto.getColor() + "      \nVenta realizada por: " + empleado.getNombre();
        return textoVenta;
    }

    public String crearNumeroFactura() {
        return getFecha().replace("/", "") + getAuto().getAño() +
                padLeft(Double.toString(Math.random() * 100), 3);
    }

    private String padLeft(String inputString, int length) {
        return String.format("%1$" + length + "s", inputString).replace(' ', '0');
    }
}
