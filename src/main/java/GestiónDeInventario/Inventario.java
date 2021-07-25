package GestiónDeInventario;

public class Inventario {

    private ListaDeAutos autos;

    public Inventario() {
        this.autos = new ListaDeAutos();
    }

    public String mostrarInventario() {
        String resultado="";
        for(Auto a:autos.getListaAutos()){
            resultado=resultado+a.getMarca()+" "+a.getModelo()+" "+a.getAño()+
                    " "+a.getColor()+" "+a.getCantidad()+"\n";
        }
        return resultado;
    }
}
