package B00_control;

import java.util.Scanner;

public class E040TablaDeMultiplicar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = teclado.nextInt();

        System.out.println("Tabla de multiplicar de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%3d x %3d = %3d\n", numero, i, (numero * i));
        }

        teclado.close();
    }
}
