package Arrays.PlanRepaso;
import java.util.Scanner;

public class sumaTotalNegativos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int a = teclado.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int b = teclado.nextInt();
        int A = Math.abs(a);
        int B = Math.abs(b);

        int sumaTotal = 0;

        for (int i = 0 ; i < a; i++) {
                if (a > 0 && b > 0) {
                    sumaTotal += b;
                } else if ((a > 0 && b < 0) && A > B) {
                    sumaTotal = a - B;
                } else if ((a > 0 && b < 0) && A < B) {
                    sumaTotal = -(B - A);
                } else if ((a < 0 && b > 0) && A > B) {
                    sumaTotal = -(A - B);
                } else if ((a < 0 && b > 0) && A < B) {
                    sumaTotal = B - A;
                } else if (a < 0 && b < 0) {
                    sumaTotal = -(A + B);
                }
        }
        System.out.println("La suma de los dos números es: " + sumaTotal);
    }
}
