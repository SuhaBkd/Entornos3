package mis_intentos;

public class E204HistogramaDeLetras {
    public static void main(String[] args) {
        String frase = "En un lugar de La Mancha de cuyo nombre no quiero acordarme...";
        int[] frecuencia = new int[27];
        frase = frase.toLowerCase();

        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if (letra >= 'a' && letra <= 'z') {
                frecuencia[letra - 'a']++;
            } else if (letra == 'ñ') {
                frecuencia[26]++;
            }
        }

        System.out.println("Imprimimos la histograma de frecuencia:");

        for (int i = 0; i < 26; i++) {
            char letra = (char) ('a' + i);
            System.out.print(letra + ": ");

            for (int j = 0; j < frecuencia[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.print("ñ: ");
        for (int j = 0; j < frecuencia[26]; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
