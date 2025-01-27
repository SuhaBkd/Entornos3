package B00_control;

import java.util.Scanner;

public class E076Palindromo {
    public static boolean esPalindromo(String texto) {
        int longitud = texto.length();

        for (int i = 0; i < longitud / 2; i++) {
            int posIzda = (         0) + i;
            int posDcha = (longitud-1) - i;

            if (texto.charAt(posIzda) != texto.charAt(posDcha)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una palabra o frase:");
        String texto = scanner.nextLine();

        boolean esPalindroma = esPalindromo(texto);

        if (esPalindroma) {
            System.out.println("La entrada es palíndroma.");
        } else {
            System.out.println("La entrada no es palíndroma.");
        }
    }
}
