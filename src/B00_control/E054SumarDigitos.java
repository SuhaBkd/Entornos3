package B00_control;

import java.util.Scanner;

public class E054SumarDigitos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = teclado.nextInt();

        int suma = 0;

        // Mientras el número tenga dígitos que sumar
        while (numero > 0) {
            // Sumar el último dígito del número (obtenido mediante la operación % 10)
            suma = suma + numero % 10;
            // Eliminar el último dígito del número (obtenido dividiendo entre 10; es división entera, sin decimales)
            numero = numero / 10;
        }

        System.out.println("La suma de los dígitos es: " + suma);

        teclado.close();
    }
}
