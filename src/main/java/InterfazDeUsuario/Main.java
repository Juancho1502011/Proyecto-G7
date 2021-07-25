package InterfazDeUsuario;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hola mundo");

        Scanner scanner= new Scanner(System.in);
        System.out.println("Bienvenido al Sistema de Concesionario\n1. Vender Auto\n2. Adquirir Auto");
        int op = scanner.nextInt();

        switch(op){
            case 1:{
                InterfazRegistrarVenta interfazRegistrarVenta = new InterfazRegistrarVenta();
                System.out.println(interfazRegistrarVenta.crearVenta());
                break;
            }
            case 2:{
                InterfazRegistrarCompra interfazRegistrarCompra = new InterfazRegistrarCompra();
                System.out.println(interfazRegistrarCompra.registrarCompra());
                break;
            }
        }
    }
}
