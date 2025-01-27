
package mis_intentos;

import java.util.Scanner;

public class PotenciasDe2HastaParar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el número de potencias:");
        int N = teclado.nextInt();
        int potenciaDe2 = 1; // Inicia en 1, ya que 2^0 es 1
        char lectura;

        for (int i = 0; i < N; i++) {
            System.out.println("Introduce 's' para mostrar la potencia o 'n' para parar:");
            lectura = teclado.next().charAt(0); // Leer un solo carácter

            if (lectura == 's') {
                System.out.println("2 ^ " + i + " = " + potenciaDe2);
                potenciaDe2 *= 2; // Multiplica por 2 para la siguiente potencia
            } else if (lectura == 'n') {
                System.out.println("Hemos parado.");
                break; // Sale del bucle si se introduce 'n'
            } else {
                System.out.println("Entrada no válida. Por favor, introduce 's' o 'n'.");
            }
        }

        teclado.close(); // Cierra el escáner para evitar fugas de recursos
    }
}
