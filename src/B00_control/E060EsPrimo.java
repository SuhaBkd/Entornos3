package B00_control;

import java.util.Scanner;

public class E060EsPrimo {
    public static boolean esDivisible(int dividendo, int divisor) {
        return (dividendo % divisor == 0);
    }

    public static boolean esPrimo(int n) {
        // Así está definido matemáticamente. Sin embargo, el bucle daría la respuesta de true, así que se trata aparte.
        if (n <= 1) return false;

        // Un número primo solo es divisible enteramente entre sí mismo y 1.

        boolean resultado = true; // "Apostamos" a que será primo. Plan B: no usar esta variable.

        // Y a continuación miramos a ver si nos hemos equivocado.
        for (int divisor = 2; divisor < n; divisor++) {
            if (esDivisible(n, divisor)) {
                // ¡Nos habíamos equivocado! No pasa nada, cambiamos de opinión y listo.
                resultado = false; // Plan B: devolver false directamente aquí. Es menos "purista" pero más eficiente.
            }
        }

        return resultado; // Plan B: devolver true directamente aquí. Es menos "purista" pero más eficiente.
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un número:");
        int numero = teclado.nextInt();

        if (esPrimo(numero)) System.out.println("Es primo.");
        else System.out.println("No es primo.");
    }
}
