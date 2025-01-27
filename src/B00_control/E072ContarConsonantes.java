package B00_control;

import java.util.Scanner;

public class E072ContarConsonantes {
    public static boolean esConsonante(Character caracter) {
        caracter = Character.toLowerCase(caracter); // Para convertir el caracter a minúsculas.

        // Empezamos en la b y así ya aprovechamos a excluir la vocal 'a'.
        return
                (caracter >= 'b' && caracter <= 'z' && caracter != 'e' && caracter != 'i' && caracter != 'o' && caracter != 'u')
                        ||
                        caracter == 'ñ';
    }

    private static int contarConsonantes(String texto) {
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (esConsonante(c)) contador++;
        }

        return contador;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String texto;

        System.out.println("Escribe una frase: ");
        texto = teclado.nextLine();

        System.out.printf("La frase tiene %d consonantes.\n", contarConsonantes(texto));

        teclado.close();
    }
}
