package Parte1;

public class Ejercicio7 {
    public static void main(String[] args) {


        int cantidadVendida = 1;
        double precioUnitario = 4500;
        double total = cantidadVendida * precioUnitario;
        boolean aplicaDescuento = (total > 20000);

        if (aplicaDescuento ) {
            total = total - (total * 0.10);
        }

        System.out.println("Total: " + total);
    }

//    Se encontraron 3 errores:
//            2 de compilación: tipo de dato incorrecto ("5" en lugar de 5) y falta de ;.
//            1 lógico: uso de = en lugar de comparación.
//    Los errores de compilación impiden ejecutar el programa, mientras que los lógicos permiten que corra pero dan resultados incorrectos


}
