package mis_intentos;

public class E206FibonacciArray {
    public static void main(String[] args) {

        int cantidadNumeros = 30;
        int pos0 = 0;
        int pos1 = 1;

        System.out.print(pos0 + " " + pos1 + " ");

        for( int i = 2; i < cantidadNumeros; i++ ) {
            int posNext = pos0 + pos1;
            System.out.print(posNext + " " );
                pos0 = pos1;
                pos1 = posNext;
        }
    }
}
