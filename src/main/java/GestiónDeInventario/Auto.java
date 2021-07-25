package GestiónDeInventario;

public class Auto {
    private String marca;
    private String modelo;
    private int año;
    private String numeroDeSerie;
    private String color;
    private int cantidad;

    public Auto(String marca, String modelo, int año, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.numeroDeSerie = numeroDeSerie;
        this.color = color;
        this.cantidad = 0;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public String getColor() {
        return color;
    }

    public int getCantidad() { return cantidad; }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", color='" + color + '\'' +
                '}';
    }
}
