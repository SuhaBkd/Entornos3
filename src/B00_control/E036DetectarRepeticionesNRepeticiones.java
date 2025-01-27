package B00_control;

import java.util.Scanner;

public class E036DetectarRepeticionesNRepeticiones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Con cuantos números iguales quieres que finalice? ");
        int numerosIgualesObjetivo = teclado.nextInt();

        System.out.print("Ingrese el primer valor: ");
        int valorAnterior = teclado.nextInt();

        int numerosIgualesDetectados = 1;

        while (numerosIgualesDetectados < numerosIgualesObjetivo) {
            System.out.print("Ingrese el siguiente valor: ");
            int valorActual = teclado.nextInt();

            if (valorAnterior != valorActual) {
                valorAnterior = valorActual;
            } else {
                System.out.println("Los números son iguales.");
                numerosIgualesDetectados++;
            }
        }

        System.out.println("Has introducido números iguales suficientes para salir.");
    }
}
