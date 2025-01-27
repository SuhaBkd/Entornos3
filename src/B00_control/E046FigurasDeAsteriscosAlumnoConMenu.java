package B00_control;

import java.util.Scanner;

public class E046FigurasDeAsteriscosAlumnoConMenu {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\nElige una de las siguientes opciones: ");
            System.out.println("1. Cuadrado de asterisco relleno.");
            System.out.println("2. Cuadrado de asterisco solo marco.");
            System.out.println("3. Rectángulo de asterisco relleno.");
            System.out.println("4. Rectángulo de asterisco solo marco.");
            System.out.println("0. Salir.");
            System.out.println("\nIngrese una opción: ");
            opcion = t.nextInt();

            if (opcion == 1) {
                System.out.println("Has elegido el cuadrado de asteriscos relleno.");
                System.out.println("Digite el lado del cuadrado: ");
                int n = t.nextInt();
                cuadradoDeAsteriscosRelleno(n);
            } else if (opcion == 2) {
                System.out.println("Has elegido el cuadrado de asteriscos solo marco.");
                System.out.println("Digite el lado del cuadrado: ");
                int n = t.nextInt();
                cuadradoDeAsteriscosSoloMarco(n);
            } else if (opcion == 3) {
                System.out.println("Has elegido el rectangulo de asteriscos relleno.");
                System.out.println("Digite la altura del rectangulo: ");
                int altura = t.nextInt();
                System.out.println("Digite la base del rectangulo: ");
                int base = t.nextInt();
                rectanguloDeAsteriscosRelleno(altura, base);
            } else if (opcion == 4) {
                System.out.println("Has elegido el rectangulo de asterisco solo marco.");
                System.out.println("Digite la altura del rectangulo: ");
                int altura = t.nextInt();
                System.out.println("Digite la base del rectangulo: ");
                int base = t.nextInt();
                rectanguloDeAsteriscosSoloMarco(altura, base);
            }
        } while (opcion != 0);

        // Es cierto lo contrario de la condición del while.
        //Es cierto (opcion == 0)

        System.out.println("Se ha finalizado el programa.");
    }

    public static void rectanguloDeAsteriscosSoloMarco(int altura, int base) {
        System.out.format("\nEl rectangulo de %dX%d asteriscos es: \n", base, altura);

        for (int fil = 1; fil <= altura; fil++) {
            if (fil == 1 || fil == altura) {
                for (int col = 1; col <= base; col++) {
                    System.out.print(" * ");
                }
                System.out.println();
            } else {
                for (int col = 1; col <= base; col++) {
                    if (col == 1 || col == base) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void rectanguloDeAsteriscosRelleno(int altura, int base) {
        System.out.format("\nEl rectangulo de %dX%d asteriscos es: \n", base, altura);

        for (int fil = 1; fil <= altura; fil++) {
            for (int col = 1; col <= base; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void cuadradoDeAsteriscosSoloMarco(int n) {
        System.out.format("\nEl cuadrado de %dX%d asteriscos es: \n", n, n);

        for (int fil = 1; fil <= n; fil++) {
            if (fil == 1 || fil == n) {
                for (int col = 1; col <= n; col++) {
                    System.out.print(" * ");
                }
                System.out.println();
            } else {
                for (int col = 1; col <= n; col++) {
                    if (col == 1 || col == n) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void cuadradoDeAsteriscosRelleno(int n) {
        System.out.format("\nEl cuadrado de %dX%d asteriscos es: \n", n, n);

        for (int fil = 1; fil <= n; fil++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
