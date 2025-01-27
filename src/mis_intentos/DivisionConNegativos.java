package mis_intentos;

import java.util.Scanner;

public class DivisionConNegativos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el valor del dividendo : ");
        int a = teclado.nextInt();
        System.out.println("Introduzca el valor del divisor : ");
        int b = teclado.nextInt();

        int absA = Math.abs(a);
        int absB = Math.abs(b);

        if (b == 0) {
            System.out.println("No se puede realizar la división");
        } else {

            int cociente = 0;
            int resto = absA;

            while (resto >= absB) {
                resto -= absB;
                cociente++;

            }
            if (a > 0 && b < 0) {
                cociente = -cociente;
            } else if ((a < 0 && b > 0) || (a < 0 && b < 0)) {
                resto = -resto;
            }
        System.out.println("El valor cociente es: " + cociente);
        System.out.println("El valor resto es: " + resto);
        }
    }
}
