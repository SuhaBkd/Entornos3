package B00_control;

import java.util.Scanner;

public class E035OlasTriplefor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la amplitud máxima: ");
        int amplitudMaxima;
        amplitudMaxima = teclado.nextInt();
        System.out.print("Intoduce el número de olas: ");
        int numOlas = teclado.nextInt();

        // Imprime cada una de las olas.
        for (int olaActual = 1; olaActual <= numOlas; olaActual++) {
            // Imprime la fase ascendente de la ola actual.
            for (int amplitudActual = 1; amplitudActual <= amplitudMaxima; amplitudActual++) {
                // Imprimir una de las porciones de la ola (una línea).
                for (int asteriscoActual = 1; asteriscoActual <= amplitudActual; asteriscoActual++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            // Imprime la fase descendente de la ola actual.
            for (int amplitudActual = amplitudMaxima-1; amplitudActual > 0; amplitudActual--) {
                // Imprimir una de las porciones de la ola (una línea).
                for (int asteriscoActual = 1; asteriscoActual <= amplitudActual; asteriscoActual++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
