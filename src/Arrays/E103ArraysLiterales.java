package Arrays;

public class E103ArraysLiterales {
    public static void main(String[] args) {
        int[] numeros = {17, 23, 5, 21};
        double[] longitudes = {11.36, 0.0, 1.184, -3.98, 1495739.2};
        boolean[] indicadores = {false, false, true, false, true};

        System.out.println("Mostrar valores del Array de numeros: ");
        for (int numero : numeros) {
            System.out.println(numero);
        }
        System.out.println("\nMostrar valores del Array de longitud: ");
        for (double longitud : longitudes) {
            System.out.println(longitud);
        }
        System.out.println("\nMostrar valores del Array de indicadores: ");
        for (boolean indicador : indicadores) {
            System.out.println(indicador);
        }
    }
}
