package B00_control;

import java.util.Scanner;

public class E020MayorOMenor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int valorActual, valorAnterior=0;

        System.out.println("Introduzca valores positivos y le diré si son menores o mayores, o iguales, que el anterior; o introduzca 0 para terminar:");

        System.out.print("Primer valor: ");
        valorActual = teclado.nextInt();

        do {
            if (valorActual >= 0) valorAnterior = valorActual;

            System.out.print("Introduzca valor: ");
            valorActual = teclado.nextInt();

            if (valorActual < 0) {
                System.out.println("ERROR, introduzca solo valores positivos, ó 0 para finalizar.");
            } else if (valorActual > 0) { // valorActual >= 0
                if (valorActual > valorAnterior) {
                    System.out.println("Es mayor que el anterior.");
                } else if (valorActual < valorAnterior) {
                    System.out.println("Es menor que el anterior.");
                } else {
                    System.out.println("Es igual que el anterior.");
                }
            } // Y si valor == 0 no se hace nada y a continuación se saldrá del bucle.
        } while (valorActual != 0);

        System.out.println("FIN");
    }
}
