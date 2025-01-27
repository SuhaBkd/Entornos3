package mis_intentos;

import java.util.Scanner;

public class DivisionSimple {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduza el valor del dividendo:" );
        int a = teclado.nextInt();
        System.out.println("Introduza el valor del divisor:" );
        int b = teclado.nextInt();
        if ( b == 0){
            System.out.println("No se puede realizar la división");
        } else {

            int cociente = 0;
            int resto = a ;

            while ( resto >= b ) {
                resto -= b;
                cociente++;
            }
            System.out.println("El cociente es: " + cociente);
            System.out.println("El resto es: " + resto);
        }
    }
}