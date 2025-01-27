package B00_control;

import java.util.Scanner;

public class E074InvertirFraseConStringBuilder {
    public static String invertirFrase(String texto) {
        StringBuilder invertida = new StringBuilder();

        // Recorre la frase de atrás hacia adelante, cambiando la posición de las letras con cada bucle
        for (int pos = texto.length()-1; pos >= 0; pos--) {
            invertida.append(texto.charAt(pos)); // Añade cada carácter a la nueva cadena invertida
        }

        return invertida.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce algo que quieras invertir: ");
        String frase = scanner.nextLine(); // Si la frase tiene espacios o muchos carácteres, nextLine es capaz de leerlo todo sin problema y almacenarlo inclusive con los espacios.

        String fraseInvertida = invertirFrase(frase);
        System.out.println("Frase invertida: " + fraseInvertida);
    }
}
