package B00_control;

import java.util.Scanner;

public class E048Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int resultadoSuma = 0;
        int contador = 0;

        System.out.println("Introduce números para calcular su media aritmética (0 para terminar): ");
        int numero;

        do {
            numero = sc.nextInt();

            resultadoSuma = resultadoSuma + numero;
            contador++;
        } while (numero != 0);

        // El último número introducido ha sido (necesariamente) un 0. No hace falta restar 0
        // pero sí hace falta quitarle al contador la última unidad añadida mediante ++.
        contador--;

        // Hacemos un typecast a double de resultadoSuma para que la división no sea entera sino con decimales.
        double media = (double) resultadoSuma / contador;
        System.out.printf("La media de esos números es %.2f", media);
    }
}
