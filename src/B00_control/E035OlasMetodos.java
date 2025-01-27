package B00_control;

import java.util.Scanner;

public class E035OlasMetodos {
    public static void imprimirLinea(int amplitud) {
        for (int asteriscoActual = 1; asteriscoActual <= amplitud; asteriscoActual++) {
            System.out.print("~ ");
        }
        System.out.println();
    }

    private static void imprimirOla(int amplitudMaxima) {
        for (int amplitudActual = 1; amplitudActual <= amplitudMaxima; amplitudActual++) {
            imprimirLinea(amplitudActual);
        }
        for (int amplitudActual = amplitudMaxima - 1; amplitudActual >= 1; amplitudActual--) {
            imprimirLinea(amplitudActual);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la amplitud máxima: ");
        int amplitudMaxima = sc.nextInt();

        System.out.print("Intoduce el número de olas: ");
        int numOlas = sc.nextInt();

        for (int olaActual = 1; olaActual <= numOlas; olaActual++) {
            imprimirOla(amplitudMaxima);
        }

        sc.close();
    }
}
