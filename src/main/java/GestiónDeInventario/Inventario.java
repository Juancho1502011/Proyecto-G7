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
        if(autos.buscarAutosComunes(auto).getCantidad()<cantidad){
            System.out.println("No existe el número indicado en stock");
            return autos.buscarAutosComunes(auto).getCantidad();
        }else{
            autos.buscarAutosComunes(auto).setCantidad(autos.buscarAutosComunes(auto).getCantidad() - cantidad);
        }
        return autos.buscarAutosComunes(auto).getCantidad();
    }
}
