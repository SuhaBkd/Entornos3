package mis_intentos;

import java.util.Scanner;

public class E116PromedioYMayorMenorConPosiciones {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int N = 0 ;

        while ( N < 7){
            System.out.println("Introduzca la cantidad de números : ");
            N = teclado.nextInt();

            if (N < 7) {
                System.out.println("La cantidad no vale .\n");
            }
        }
        int ArrayNum [] = new int[N];
        for ( int i = 0 ; i < N ; i++){
            System.out.printf("Introduzca el numero %d : ", i+1);
            ArrayNum[i] = teclado.nextInt();
        }

        double suma = 0;
        for (int num : ArrayNum) {
            suma += num;
        }
        double promedio = suma / N;

        int mayor = ArrayNum[0];
        int menor = ArrayNum[0];
        int posicionMayor = 0;
        int posicionMenor = 0;

        for (int i = 1; i < N; i++) {
            if (ArrayNum[i] > mayor) {
                mayor = ArrayNum[i];
                posicionMayor = i;
            }
            if (ArrayNum[i] < menor) {
                menor = ArrayNum[i];
                posicionMenor = i;
            }
        }

        System.out.printf("\nEl promedio es %.1f.\n", promedio);
        System.out.printf("El mayor era %d (posición %d) y el menor era %d (posición %d).\n", mayor, posicionMayor + 1, menor, posicionMenor + 1);
    }
}
