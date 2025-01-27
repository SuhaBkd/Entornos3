package B00_control;

import java.util.Scanner;

public class E036DetectarRepeticiones2Repeticiones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer valor:  ");
        int valorAnterior = teclado.nextInt();

        while (true) {
            System.out.println("Ingrese el siguiente valor: ");
            int valorActual = teclado.nextInt();

            if (valorAnterior != valorActual) {
                valorAnterior = valorActual;
            } else {
                System.out.println("Los números son iguales. Se finaliza el proceso.");
                break;
            }
        }
    }
}
