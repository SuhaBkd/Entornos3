package B00_control;

import java.util.Scanner;

public class E070ContarVocales {
    public static boolean esVocal(char caracter) {
        caracter = Character.toLowerCase(caracter);

        return caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'
                || caracter == 'á' || caracter == 'é' || caracter == 'í' || caracter == 'ó' || caracter == 'ú';
    }

    private static int contarVocales(String texto) {
        int contadorVocales = 0;

        for (int pos = 0; pos < texto.length(); pos++) {
            char c = texto.charAt(pos);
            if (esVocal(c)) contadorVocales++;
        }

        return contadorVocales;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el texto:");
        String texto = teclado.nextLine();

        System.out.printf("El string tiene %d vocales.", contarVocales(texto));

        teclado.close();
    }
}
