package Parte2;

public class sistemaCafeteria {
    public static void main(String[] args) {
        String[] nombres = {"Café americano", "Capuchino", "Jugo naranja", "Tostada","Brownie"};
        double[] precios = {3500, 5000, 4000, 4500, 6000};
        char[] categorias = {'B', 'B', 'F', 'C', 'P'}; // B=Bebida caliente, F=Fría, C=Comida,P=Postre
        int[] pedidoProducto = {0, 2, 1, 4, 0, 3}; // índice del producto en cada pedido
        int[] pedidoCantidad = {2, 1, 3, 1, 1, 2}; // unidades por pedido
        double descuento = 0;


        for (int i = 0; i < nombres.length; i++) {

            switch (categorias[i]) {
                case 'B':
                    System.out.println("La Categoria es una Bebida caliente deliciosa");
                    break;
                case 'F':
                    System.out.println("La Categoria es una Bebida Fria deliciosa");
                    break;
                case 'C':
                    System.out.println("La Categoria es una Comida deliciosa");
                    break;
                case 'P':
                    System.out.println("La Categoria es una Postre delicioso");
                    break;
                default:
                    System.out.println("La Opcion es incorrecta");
            }

            double subtotal = pedidoCantidad[i] * precios[i];
            boolean tieneDescuento = subtotal > 12000;

            System.out.println("Numero del pedido: " + pedidoProducto[i] + " Nombre del producto: "
                    + nombres[i] + "Cantidad de producto: "+ pedidoCantidad[i] + "Subtotal: " + subtotal);




            if (tieneDescuento) {
                descuento = subtotal * 0.10;
            }

            double total = subtotal - descuento;

            System.out.printf("¿Tiene derecho al descuento?: %b%n", tieneDescuento);
            System.out.printf("Valor del descuento: $%.2f%n", descuento);
            System.out.printf("Total a pagar: $%.2f%n", total);




        }

    }
}
