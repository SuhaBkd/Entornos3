package Arrays.PlanRepaso;
import java.util.Scanner;

public class E002SumaTotal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese cantidad de números:");
        int N = teclado.nextInt();
        int suma = 0;

        for (int i = 1; i <= N; i++) {
            System.out.println("Ingrese el número para sumar: ");
            int a = teclado.nextInt();
            suma += a ;
        } System.out.println("la suma total de los números es: " + suma);
    }
}
