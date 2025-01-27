package mis_intentos;
import java.util.Scanner;
public class Pratique {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese número de potecias : ");
        int n = teclado.nextInt();

        int potenciaDe2 = 1 ;
        for (int i = 0; i < n; i++) {

            potenciaDe2 *= 2;

            System.out.println("2 ^ " + (i+1) + " = " + potenciaDe2);
        }
    }
}
