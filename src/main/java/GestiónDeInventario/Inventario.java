package GestiónDeInventario;

public class Inventario {

    ListaDeAutos autos;

    public Inventario() {
        this.autos = new ListaDeAutos();
    }

    public int aumentarInventario(Auto auto, int cantidad) {
        Auto a = autos.buscarAutosComunes(auto);
        a.setCantidad(a.getCantidad() + cantidad);
        return a.getCantidad();
    }

    public int disminuirInventario(Auto auto, int cantidad) {
        Auto a1 = autos.buscarAutosComunes(auto);
        if(a1.getCantidad()<cantidad){
            System.out.println("No existe el número indicado en stock");
            return a1.getCantidad();
        }else{
            a1.setCantidad(a1.getCantidad() - cantidad);
        }
        return a1.getCantidad();
    }
}
