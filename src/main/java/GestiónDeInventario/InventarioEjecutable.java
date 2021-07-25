package GestiónDeInventario;

public class InventarioEjecutable {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        System.out.println("=====Ejecución del método mostrarInventario=====");
        System.out.println(inventario.autos.mostrarInventario());

       //Aumentando el inventario
        System.out.println("\n");
        System.out.println("=====Aumentar el stock en 5=====");
        inventario.aumentarInventario(new Auto("Chevrolet","Grand Vitara",2021, "rojo"), 5);
        System.out.println("=====Mostrando el nuevo inventario=====");
        System.out.println(inventario.autos.mostrarInventario());
        System.out.println("=====Disminuir el stock en 2");
        inventario.disminuirInventario(new Auto("Chevrolet","Grand Vitara",2021, "rojo"), 2);
        System.out.println("=====Mostrando el nuevo inventario=====");
        System.out.println(inventario.autos.mostrarInventario());
    }
}
