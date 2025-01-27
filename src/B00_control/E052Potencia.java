package B00_control;

public class E052Potencia {
    public static double potencia(double b, int e) {
        double resultado = 1;

        // Esto es una forma de tratar exponentes negativos.
        //if (exponente < 0) {
        //    base = 1 / base;
        //    exponente = -exponente;
        //}

        // Y el valor absoluto y el ternario son otra forma de tratar exponentes negativos.
        for (int i = 1; i <= Math.abs(e); i++) {
            resultado = (e > 0) ? resultado * b : resultado / b;
        }

        return resultado;
    }

    public static void main(String[] args) {
        double base = 2;
        int exponente = 3;

        double resultado = potencia(base, exponente);

        System.out.println(base + " elevado a " + exponente + " es " + resultado);
    }
}
