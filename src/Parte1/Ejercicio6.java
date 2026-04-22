package Parte1;

public class Ejercicio6 {
    public static void main(String[] args) {

        String[] productos = {"Café americano", "Capuchino", "Jugo de naranja", "Tostada", "Brownie"};
        double[] precios = {3500, 5000, 4000, 4500, 6000};
        double total = 0;
        int count= 0;


        for (int i = 0; i < productos.length; i++) {

            System.out.println("El precio del producto " + productos[i] + " es: " + precios[i]);

            count++;

            total += precios[i];
        }
        System.out.println("--------------------------------------------------------------------");
        System.out.println("El precio promedio de el menu es de: "+ (total)/count);

        // RTA: El usar el for en este ejercicio es util porque sabemos la cantidad de elementos que tiene nuestro arreglo por lo tanto es mas facil entenderlo
        // Podemos movernos entre un valor y otro y poder mostrarlo en iteracion de mejor forma.


    }
}
