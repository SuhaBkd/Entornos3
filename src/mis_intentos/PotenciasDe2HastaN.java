package mis_intentos;

import java.util.Scanner;

public class PotenciasDe2HastaN {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el valor de potencias: ");
        int N = teclado.nextInt();
        int potenciaDe2 = 1;

        for ( int i = 0 ; i <= N ; i++ ) {
            System.out.println(" 2 ^ " + i + " = " + potenciaDe2);
            potenciaDe2 *= 2;
        }
    }
}

