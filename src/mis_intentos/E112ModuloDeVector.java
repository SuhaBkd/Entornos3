package mis_intentos;

public class E112ModuloDeVector {
    public static void main(String[] args) {

        double[] vector = {4, 3, 6, 2};
        double sumaCuadrados = 0;

        for (double valor : vector) {
            sumaCuadrados += valor * valor;
        }
        double modulo = Math.sqrt(sumaCuadrados);
        System.out.printf("El módulo del vector es: %.2f\n", modulo);
    }
}
