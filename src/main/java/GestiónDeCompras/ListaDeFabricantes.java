package GestiónDeCompras;

import java.util.ArrayList;

public class ListaDeFabricantes {
    private ArrayList<Fabricante> listaFabricantes;

    public ListaDeFabricantes() {
        this.listaFabricantes = new ArrayList<Fabricante>();
        listaFabricantes.add(new Fabricante("Chevrolet","123456789012","Quito"));
        listaFabricantes.add(new Fabricante("Nissan","123456789012","Quito"));
    }

    public String añadirFabricante(Fabricante fabricante){
        this.listaFabricantes.add(fabricante);
        return "Fabricante añadido correctamente";
    }

    public Fabricante buscarFabricante(String nombre){
        for (Fabricante f1:this.listaFabricantes){
            if (nombre.equalsIgnoreCase(f1.getNombre())){
                return f1;
            }
        }
        return null;
    }

    public String eliminarFabricante(Fabricante fabricante){
        this.listaFabricantes.remove(fabricante);
        return "Fabricante eliminado correctamente";
    }

    public ArrayList<Fabricante> getListaFabricantes() {
        return listaFabricantes;
    }

    public String mostrarFabricantes() {
        String result="";
        for(int i = 0; i< getListaFabricantes().size(); i++){
            result+=i+". "+ getListaFabricantes().get(i).getNombre()+"\n";
        }
        return result;
    }
}
