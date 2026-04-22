package Parte1;

public class Ejercicio5 {
    public static void main(String[] args) {
// Al inicio del turno, el sistema pide al cajero que ingrese el monto de apertura de caja.
// El monto debe ser mayor a $0. Si el cajero ingresa un valor inválido, el sistema debe volver a
// pedirlo
// Simula este comportamiento con un do-while. Como no usamos Scanner en este ejercicio,
// define el valor dentro del código y fuerza al menos una iteración con un valor inválido primero.

        double monto = 0;

        do {
            System.out.println("Intentando abrir caja con: $" + monto);

            if (monto <= 0) {
                System.out.println("Error, el monto debe superar los $0. ");
                monto = 500000;
            }
        }
        while (monto <= 0);
        System.out.println("Caja abierta con éxito. El monto final es: " + monto);

    }
}
//¿Por qué do-while es más apropiado que while aquí?
// porque necesitamos mostrar si o si al menos una vez
// el mensaje de apertura de caja antes de forzar un valor.
//Describe con tus palabras la diferencia en el orden de ejecución.
//El do-while me permite mostrar o ejecutar algo al menos una vez y el while es un bucle que
// si no se cumple una condición no me permitiría parar

