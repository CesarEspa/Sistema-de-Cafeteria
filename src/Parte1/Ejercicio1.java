package Parte1;

public class Ejercicio1 {
    public static void main(String[] args) {

                String producto = "Té Chai";
                double precioUnitario = 3500;
                int cantidad = 3;
                boolean disponible = true;
                char codigo = 'A';

                String descripcion = String.format("Producto: %s%n" +
                        "Precio unitario: $%.2f%n" +
                        "Cantidad pedida: %d" +
                        "Disponible: %b%n" +
                        "Código de producto: %c",producto,precioUnitario,cantidad,disponible, codigo);
                System.out.println(descripcion);



            }
        }


        // RTA: Porque generalmente los precios se manejan con decimales, si le asignamos 3.50 al int (total)
        // nos produce error porque el int solamente recibe entero.


