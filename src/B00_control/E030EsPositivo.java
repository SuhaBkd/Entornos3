package B00_control;

public class E030EsPositivo {
    public static boolean esPositivo(int numero) {
        return (numero >= 0);

        // También se podría hacer así, pero es más largo y menos habitual:
        //
        //if (numero >= 0) {
        //         return true;
        //} else {
        //         return false;
        //}
    }

    public static void main(String[] args) {
        int n=31;

        if (esPositivo(n) == true) {
            System.out.format("%d es positivo\n", n);
        } else {
            System.out.format("%d es negativo\n", n);
        }
    }
}
