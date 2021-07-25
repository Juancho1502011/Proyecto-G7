package GestiónDeInventario;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeAutos {

    private final ArrayList<Auto> listaAutos;

    public ListaDeAutos() {
        this.listaAutos = new ArrayList<>();
        this.listaAutos.add(new Auto("Chevrolet", "Grand Vitara", 2021, "rojo"));
        this.listaAutos.add(new Auto("Nissan", "Sentra", 2021, "blanco"));
        this.listaAutos.add(new Auto("Chevrolet", "Aveo", 2021, "Rojo"));
    }

    public ArrayList<Auto> getListaAutos() {
        return listaAutos;
    }

    public boolean añadirAuto(Auto auto) {
        listaAutos.add(auto);
        return true;
    }

    public boolean eliminarAuto(Auto auto) {
        listaAutos.remove(auto);
        return true;
    }

    public ArrayList<Auto> buscarAuto(String marca) {
        ArrayList<Auto> autos = new ArrayList<>();
        for (int i = 0; i < this.listaAutos.size(); i++) {
            if (listaAutos.get(i).getMarca().equalsIgnoreCase(marca)) {
                autos.add(listaAutos.get(i));
            }
        }
        return autos;
    }


    public Auto buscarAutoPosicion(int auto) {
        return listaAutos.get(auto - 1);
    }

    public void mostrarAutos() {
        for (int i = 0; i < listaAutos.size(); i++) {
            System.out.println(i + 1 + ".- " + listaAutos.get(i));
        }
    }

    public int getOpAuto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el Auto");
        mostrarAutos();
        return scanner.nextInt();
    }

    public Auto getAutoEscogido() {
        return buscarAutoPosicion(getOpAuto());
    }

    public String mostrarAutosPorFabricante(String fabricante) {
        String resultado = "";
        for (int i = 0; i < buscarAuto(fabricante).size(); i++) {
            resultado += i + ". " + buscarAuto(fabricante).get(i).getModelo() + " " +
                    buscarAuto(fabricante).get(i).getAño() + " " +
                    buscarAuto(fabricante).get(i).getColor() + "\n";
        }
        return resultado;
    }

    public String mostrarInventario() {
        String resultado = "";
        for (Auto a : getListaAutos()) {
            resultado += a.getMarca() + " " + a.getModelo() + " " + a.getAño() +
                    " " + a.getColor() + " " + a.getCantidad() + "\n";
        }
        return resultado;
    }

    public Auto buscarAutosComunes(Auto auto) {
        Auto autoEncontrado = null;
        for (int i = 0; i < this.listaAutos.size(); i++) {
            if (listaAutos.get(i).getMarca().equalsIgnoreCase(auto.getMarca())
                    && listaAutos.get(i).getModelo().equalsIgnoreCase(auto.getModelo())
                    && listaAutos.get(i).getColor().equalsIgnoreCase(auto.getColor())) {
                autoEncontrado = listaAutos.get(i);
            }
        }
        return autoEncontrado;
    }
}
