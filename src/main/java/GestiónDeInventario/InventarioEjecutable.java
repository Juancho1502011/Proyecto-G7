package GestiónDeInventario;

public class InventarioEjecutable {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        System.out.println("*******Ejecución del método mostrarInventario");
        System.out.println(inventario.autos.mostrarInventario());

       //Aumentando el inventario
        System.out.println("\n");
        inventario.aumentarInventario(new Auto("Chevrolet","Grand Vitara",2021, "rojo"), 5);
        System.out.println("=====Mostrando el nuevo inventario=====");
        System.out.println(inventario.autos.mostrarInventario());
    }
}
