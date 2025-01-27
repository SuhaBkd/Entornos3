package B00_control;

import java.util.Scanner;

public class E016PotenciasDe2HastaParar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String textoOriginal, textoMinuscula;
        int acumulado = 1;
        char accion;

        System.out.println("HoLA".toLowerCase());
        System.out.println("HoLA".length());

        do {
            System.out.format("La siguiente potencia de 2 es %d.\n", acumulado);

            acumulado = acumulado * 2;

            do {
                System.out.print("Introduzca s o n: ");
                textoOriginal = teclado.next();
                System.out.format("Tu entrada tiene %d caracteres.\n", textoOriginal.length());
                textoMinuscula = textoOriginal.toLowerCase();
                accion = textoMinuscula.charAt(0);
            } while (!((accion == 's' || accion == 'n') && textoOriginal.length() == 1));
        } while (accion == 's');

        teclado.close();
    }
}
