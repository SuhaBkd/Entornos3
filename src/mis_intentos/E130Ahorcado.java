package mis_intentos;

import java.util.Scanner;

public class E130Ahorcado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese cuantas letras tiene la palabra secreta: ");
        int cantidadLetras = teclado.nextInt();
        teclado.nextLine();

        char[] palabraSecreta = new char[cantidadLetras];
        boolean[] letrasAcertadas = new boolean[cantidadLetras];

        System.out.print("Jugador 1, ingresa la palabra secreta: ");
        String palabra = teclado.nextLine().toLowerCase();

        for (int i = 0; i < cantidadLetras; i++) {
            palabraSecreta[i] = palabra.charAt(i);
        }

        System.out.println("\n".repeat(30));

        int aciertos = 0;
        int numFallos = 0;
        final int maxFallos = 6;

        while (aciertos < cantidadLetras && numFallos < maxFallos) {
            mostrarAhorcado(numFallos);
            mostrarEstado(letrasAcertadas, palabraSecreta);

            //Inicia un bucle while que continúa mientras el jugador
            // no haya acertado todas las letras y no haya excedido el número máximo de fallos.

            System.out.print("Jugador 2, ingresa una letra para adivinar: ");
            char letraIntentada = Character.toLowerCase(teclado.next().charAt(0));

            boolean hayAcierto = false;

            for (int i = 0; i < cantidadLetras; i++) {
                if (letraIntentada == palabraSecreta[i] && !letrasAcertadas[i]) {
                    letrasAcertadas[i] = true;
                    aciertos++;
                    hayAcierto = true;
                    System.out.printf("¡Acierto! Has adivinado la letra %s.\n", letraIntentada);
                }
            }
            //Si la letra intentada coincide con la letra en palabraSecreta en
            // la posición i, y esa letra aún no ha sido adivinada (!letrasAcertadas[i]), entonces:

                if (!hayAcierto) {
                    numFallos++;
                    System.out.printf("Fallaste. La letra %s no está en la palabra secreta.\n", letraIntentada);
                }
                //Si hayAcierto es false, aumenta numFallos en 1 y muestra un mensaje de fallo.
            }

            if (aciertos == cantidadLetras) {
                System.out.println("¡Felicidades! Has adivinado la palabra secreta.");
            } else {
                mostrarAhorcado(numFallos);
                System.out.println("¡Has perdido! La palabra secreta era: " + palabra);
            }

            teclado.close();
        }

        private static void mostrarAhorcado(int numFallos) {
            System.out.println(" ____");
            switch (numFallos) {
                case 1 -> {
                    System.out.println(" |  0");
                    System.out.println(" |");
                    System.out.println(" |");
                }
                case 2 -> {
                    System.out.println(" |  0");
                    System.out.println(" |  |");
                    System.out.println(" |");
                }
                case 3 -> {
                    System.out.println(" |  0");
                    System.out.println(" | -|");
                    System.out.println(" |");
                }
                case 4 -> {
                    System.out.println(" |  0");
                    System.out.println(" | -|-");
                    System.out.println(" |");
                }
                case 5 -> {
                    System.out.println(" |  0");
                    System.out.println(" | -|-");
                    System.out.println(" | /");
                }
                case 6 -> {
                    System.out.println(" |  0");
                    System.out.println(" | -|-");
                    System.out.println(" | / \\ ");
                }
            }
            System.out.println("_|_");
            System.out.println();
        }

        private static void mostrarEstado(boolean[] letrasAcertadas, char[] palabraSecreta) {
            System.out.print("Estado actual: ");
            for (int i = 0; i < letrasAcertadas.length; i++) {
                if (letrasAcertadas[i]) {
                    System.out.print(palabraSecreta[i] + " ");
                } else {
                    System.out.print("_ ");
                }
            }
            //Este método mostrarEstado imprime el estado actual de la palabra,
            // mostrando las letras acertadas y reemplazando las letras no adivinadas con guiones bajos (_).
            System.out.println();
    }
}
