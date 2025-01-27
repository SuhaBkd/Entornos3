package Arrays;
import java.util.Scanner;

public class E104SumaTotal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tamano de array:");
        int tamano = sc.nextInt();

        int [] numeros = new int [tamano];
        System.out.println("Introduce el valor de la array:");
        for (int i = 0; i < tamano; i++) {
            numeros[i] = sc.nextInt();
        }
        int sumaTotal = 0;
        for (int numero : numeros) {
            sumaTotal += numero;
        }
        System.out.println("El total de la array es: " + sumaTotal);
    }
}
