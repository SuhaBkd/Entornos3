package B00_control;

import java.util.Scanner;

public class E050Hipotenusa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicitar los valores de los catetos
        System.out.print("Introduce el valor del primer cateto: ");
        double cateto1 = teclado.nextDouble();

        System.out.print("Introduce el valor del segundo cateto: ");
        double cateto2 = teclado.nextDouble();

        // Calcular la hipotenusa
        double hipotenusa = calcularHipotenusa(cateto1, cateto2);

        // Mostrar el resultado
        System.out.printf("La hipotenusa es %.2f.", hipotenusa);
    }

    public static double calcularHipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
    }
}
