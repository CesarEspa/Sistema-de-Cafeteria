package Parte1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el subtotal: ");
        double subtotal = teclado.nextDouble();

        boolean tieneDescuento = subtotal > 30000;
        double descuento = 0;

        if (tieneDescuento) {
            descuento = subtotal * 0.15;
        }

        double total = subtotal - descuento;

        System.out.printf("¿Tiene derecho al descuento?: %b%n", tieneDescuento);
        System.out.printf("Valor del descuento: $%.2f%n", descuento);
        System.out.printf("Total a pagar: $%.2f%n", total);

        // RTA: El operador que utilizamos fue ">" ya que nos permitio saber si cumplia con la condicion de ser mayor a la cantidad que necesita para
        // superar el descuento.
        // Nos devuelve un dato tipo boolean porque en la linea 12, decimos que si subtotal es mayor a 30000 vuelve la variable (tieneDescuento) en true
        // porque es un boolean entonces si se cumple la condicion se vuelve true si no, es false


    }
}
