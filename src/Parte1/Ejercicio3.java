package Parte1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char bCaliente = 'B';
        char bFria = 'F';
        char bComida = 'C';
        char bPostre = 'P';
        char opc;

        System.out.println("Escribe la opcion que deseas");
        opc = sc.next().toUpperCase().charAt(0);

        switch (opc) {

            case 'B':
                System.out.println("Una Bebida caliente deliciosa");
                System.out.println("No aplica el IVA");
                break;
            case 'F':
                System.out.println("Una Bebida Fria deliciosa");
                System.out.println("Aplica el IVA con 5%");
                break;
            case 'C':
                System.out.println("Una Comida deliciosa");
                System.out.println("Aplica el IVA con 8%");
                break;
            case 'P':
                System.out.println("Una Postre delicioso");
                System.out.println("Aplica el IVA con 8%");
                break;
            default:
                System.out.println("La Opcion es incorrecta");
        }
    }

    // RTA: Pues la verdad en ninguna, pero si tuviera que cambiarlo sería en el caso donde quisiera mostrar las opciones del iva dependiendo del producto
    // En este ejercicio es oportuno y mejor opción utilizar el switch para poder mostrar diferente información dependiendo de la opción

}

