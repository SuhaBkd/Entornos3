package mis_intentos;

import java.util.Scanner;

public class sumaTotal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce N cantidad de números a sumar: ");
        int N = teclado.nextInt();

        int sumaTotal = 0;
        for ( int i = 1 ; i <= N ; i ++){
            System.out.println("Introduce el número:" + i );
            sumaTotal += teclado.nextInt();
        }
        System.out.println("la suma total de los números es:" + sumaTotal);
    }
}
