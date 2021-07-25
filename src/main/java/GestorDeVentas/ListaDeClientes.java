package GestorDeVentas;


import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeClientes {

    private final ArrayList<Cliente> listaClientes = new ArrayList<>();

    public ListaDeClientes() {
        this.listaClientes.add(new Cliente("Pierre Dolce","1759864240", "San Antonio"));
    }

    public boolean añadirCliente(Cliente cliente){
        return listaClientes.add(cliente);
    }
    public boolean eliminarCliente(Cliente cliente){
        return listaClientes.remove(cliente);
    }
    public Cliente buscarCliente(int cliente){
        return listaClientes.get(cliente-1);
    }

    public void mostrarClientes(){
        for(int i = 0; i< listaClientes.size(); i++){
            System.out.println(i+1+".- "+listaClientes.get(i));
        }
    }

    public Cliente getClienteEscogido() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Seleccione el cliente");
        mostrarClientes();
        return buscarCliente(scanner.nextInt());
    }
}
