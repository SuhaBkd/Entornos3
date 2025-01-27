package B00_control;

import java.util.Scanner;

public class E044NumerosEnRango {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Pedir al usuario que introduzca dos números
        System.out.print("Introduce el primer número: ");
        int a = teclado.nextInt();
        System.out.print("Introduce el segundo número: ");
        int b = teclado.nextInt();

        // Asegurarnos de tener los números "en orden".
        int menor = Math.min(a, b);
        int mayor = Math.max(a, b);

        // Otra forma de haber hecho esto era intercambiar los valores de a y b, y usar luego a y b.
        // int muleta = a;
        // a = b;
        // b = muleta;

        // OJO: esto no funciona
        // a = b;
        // b = a;

        // Primera versión: mostrar todos los números entre ambos, inclusive
        System.out.println("\nNúmeros entre " + a + " y " + b + " (inclusive):");
        for (int i = menor; i <= mayor; i++) {
            System.out.println(i);
        }

        // Segunda versión: mostrar solo los múltiplos de tres entre ambos
        System.out.println("\nNúmeros entre " + a + " y " + b + " que son múltiplos de 3:");
        for (int i = menor; i <= mayor; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        teclado.close();
    }
}
