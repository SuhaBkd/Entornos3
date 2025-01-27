package B00_control;

import java.util.Scanner;

public class E012DivisionSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitamos el valor del dividendo y divisor al usuario.
        System.out.println("Ingrese el valor del dividendo: ");
        int dividendo = scanner.nextInt();

        System.out.println("Ingrese el valor del divisor: ");
        int divisor = scanner.nextInt();

        // Nos aseguramos de que el divisor no sea 0.
        if (divisor == 0) {
            System.out.println("Error: El divisor NO puede ser cero.");
            return;
        }

        int resto = dividendo;
        int cociente = 0;

        // Calculamos el cociente usando restas consecutivas.
        while (resto >= divisor) {
            resto = resto - divisor;
            cociente++;
        }

        // Mostramos el cociente y el resto.
        System.out.println("El cociente es: " + cociente);
        System.out.println("El valor del resto es: " + resto);
    }
}
