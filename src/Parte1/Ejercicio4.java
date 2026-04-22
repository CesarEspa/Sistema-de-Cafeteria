package Parte1;

public class Ejercicio4 {
    public static void main(String[] args) {

        int Inventario = 50;
        int Pedido = 3;
        boolean Cafe = true;

        while(Cafe) {
            Inventario = Inventario - Pedido;
            System.out.println("Inventario: " + Inventario);
            if (Inventario<10){
                Cafe = false;
                System.out.println("--------------------------------");
                System.out.println("pedidos restantes "+ Inventario);
            }

        }
    }

    //RTA: Nunca entrara al ciclo, por lo tanto nunca saldran los pedidos de la empresa
    // Revisaria o haria debbugin para poder confirmar que siempre entrara al ciclo ademas, definiria con boolean en true para que siempre entre

}
