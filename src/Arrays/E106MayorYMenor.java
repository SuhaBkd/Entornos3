package Arrays;
import java.util.Scanner;
public class E106MayorYMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce cuantos elementos: ");
        int n = scanner.nextInt();
        int[] numeros = new int[n];

        System.out.print("Introduce los numeros: ");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }
        int menor = Integer.MAX_VALUE;
        int mayor = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);

    }
}
