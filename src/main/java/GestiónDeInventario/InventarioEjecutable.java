package GestiónDeInventario;

public class InventarioEjecutable {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        System.out.println("*******Ejecución del método mostrarInventario");
        System.out.println(inventario.autos.mostrarInventario());
    }
}
