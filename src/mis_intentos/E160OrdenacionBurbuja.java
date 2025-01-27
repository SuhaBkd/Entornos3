package mis_intentos;

public class E160OrdenacionBurbuja {
    public static void main(String[] args) {
        int[] lista =  {5, 8, 15, 20, 3, 8, 10, 7};

        for (int pasada = 0; pasada < lista.length ; pasada++) {
            // En cada pasada va quedando en su sitio, al final
            for (int pos = 0; pos < lista.length ; pos++) {
                System.out.printf("comparando %d (valor %d) con posicion %d (valor %d)." , pos, lista[pos], pos+1, lista[pos+1]);
                if (lista[pos] > lista[pos + 1]) {
                    System.out.println("INTERCAMBIAMOS");
                    int temp = lista[pos];
                    lista[pos] = lista[pos + 1];
                    lista[pos + 1] = temp;
                }
                System.out.println();
            }
            for (int valor : lista){
                System.out.println(valor);
            }
        }
        System.out.println(lista.length);
    }
}
