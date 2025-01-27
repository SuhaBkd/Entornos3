package Arrays;

public class E105Promedio {
    public static void main(String[] args) {
        double [] valores = { 1.0, 65.70, 6.09, 19.17};

        double suma = 0.0;
        for ( double valor : valores) {
            suma += valor;
        }
        double promedio = suma / valores.length;
        System.out.println("Promedio: " + promedio);
    }
}
