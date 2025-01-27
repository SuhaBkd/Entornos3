package B00_control;

import java.util.Scanner;

public class E002Sumatotal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int sumaAcumulada = 0;

        System.out.println("¿Cuántos números desea sumar?");
        int cantidad = teclado.nextInt();

        System.out.println("Introduzca los números a continuación:");
        for (int i=0; i<cantidad; i++) {
            int numero = teclado.nextInt();
            sumaAcumulada = sumaAcumulada + numero;
        }

        System.out.println("La suma da: " + sumaAcumulada);

        teclado.close();
    }
}