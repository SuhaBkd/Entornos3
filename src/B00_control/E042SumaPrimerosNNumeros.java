package B00_control;

import java.util.Scanner;

public class E042SumaPrimerosNNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n;
        boolean correcto;

        // Validar de forma robusta, usando hasNextInt para asegurarse de que sea un número y sea positivo
        do {
            System.out.print("Introduce un número entero entre 1 y 10000: ");
            while (!teclado.hasNextInt()) {
                System.out.println("Por favor, introduce un número entero válido.");
                teclado.next(); // Limpiar el buffer de entrada
            }

            // El bucle de arriba tenía la función de asegurarse de que, llegados a este punto, "teclado has next int".
            // ES FALSE ESTO:        !teclado.hasNextInt()
            // ES TRUE LO CONTRARIO: teclado.hasNextInt()

            n = teclado.nextInt();

            correcto = (n >= 1 && n <= 10000); // Una manera de evitar el copypaste (la ca.....) de la condición.

            if (!correcto) {
                System.out.println("El número está fuera del rango.");
            }
        } while (!correcto);

        // Calcular la propia suma.
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma = suma + i;
        }

        System.out.println("La suma de los números del 1 al " + n + " es: " + suma);

        teclado.close();
    }
}
