package B00_control;

public class E015PotenciasDe2HastaN {
    public static void main(String[] args) {
        int potenciaHasta = 4;

        int valor = 1;

        int exponente;
        for (exponente=0; exponente <= potenciaHasta; exponente++) {
            System.out.format("2 elevado a %d es %d\n", exponente, valor);

            valor = valor*2;
        }

        System.out.println("El valor ha llegado hasta " + valor + " y el exponente ha llegado hasta " + exponente + " (pero, ¡no pasa nada!).");
    }
}
