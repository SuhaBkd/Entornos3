package B00_control;

import java.util.Scanner;

public class E021MayorYMenorDeNNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuántos números desea introducir?");
        int cantidad = teclado.nextInt();

        int menor = Integer.MAX_VALUE;
        int mayor = Integer.MIN_VALUE;

        System.out.println("Introduzca los números a continuación:");
        for (int i = 1; i <= cantidad; i++) {
            int numero = teclado.nextInt();

            if (numero < menor) menor = numero;
            if (numero > mayor) mayor = numero;
        }

        System.out.println("El menor era " + menor + " y el mayor, " + mayor + ".");
    }
}
