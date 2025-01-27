package B00_control;

public class E046FigurasDeAsteriscosAlain {
    public static void dibujarCuadradoHueco(int lado) {
        for (int fila = 1; fila <= lado; fila++) {
            for (int columna = 1; columna <= lado; columna++) {
                boolean enElBorde = (fila == 1 || fila == lado || columna == 1 || columna == lado);
                System.out.print(enElBorde ? " * " : "   ");
            }
            System.out.println();
        }
    }

    public static void dibujarRectanguloHueco(int anchura, int altura) {
        for (int fila = 1; fila <= altura; fila++) {
            for (int columna = 1; columna <= anchura; columna++) {
                boolean enElBorde = fila == 1 || fila == altura || columna == 1 || columna == anchura;
                System.out.print(enElBorde ? "*" : " ");
            }
            System.out.println();
        }
    }

    public static void dibujarPiramideSolida(int altura) {
        for (int fila = 0; fila < altura; fila++) {
            // Espacios para centrar
            for (int espacio = 0; espacio < altura - fila - 1; espacio++) {
                System.out.print(" ");
            }
            // A continuación, los propios asteriscos
            for (int asterisco = 0; asterisco < 2 * fila + 1; asterisco++) {
                System.out.print("*");
            }
            // Por último, intro para ir a la siguiente línea.
            System.out.println();
        }
    }

    public static void dibujarTrianguloRectanguloHueco(int altura, int base) {
        // Inicializamos el desplazamiento a 1, y restamos 1 de la base para dividir, para que el primer asterisco (el de la primera fila) salga siempre.
        double pendiente = (double) (base-1) / altura;
        double desplazamientoHorizontal = 1; // Cuánto nos hemos desplazado virtualmente hacia la derecha (contendrá decimales; luego habrá que redondear).

        // Dibujar el triángulo rectángulo
        for (int fila = 1; fila <= altura; fila++) {
            // ¿Hasta qué columna queremos asteriscos?
            int desplazamientoHorizontalRedondeado = (int) Math.round(desplazamientoHorizontal);

            for (int columna = 1; columna <= desplazamientoHorizontalRedondeado; columna++) {
                boolean enElBorde = (fila == 1 || fila == altura || columna == 1 || columna == desplazamientoHorizontalRedondeado);
                System.out.print(enElBorde ? "*" : " ");
            }
            System.out.println();

            desplazamientoHorizontal = desplazamientoHorizontal + pendiente;
        }
    }

    public static void main(String[] args) {
        dibujarCuadradoHueco(5);
        System.out.println();

        dibujarRectanguloHueco(4, 8);
        System.out.println();

        dibujarPiramideSolida(5);
        System.out.println();

        dibujarTrianguloRectanguloHueco(5, 13);
    }
}
