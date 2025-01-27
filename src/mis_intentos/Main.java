package mis_intentos;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int a = teclado.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int b = teclado.nextInt();

        int numero1= Math.abs(a);
        int numero2= Math.abs(b);

        int sumaTotal = 0;

        for ( int i=0; i<= numero1; i++){
            if (( a < 0 && b > 0) && numero1 > numero2 ){
                sumaTotal = numero1 - numero2;
            } else if (((a > 0 && b < 0) || (a < 0 && b > 0)) && numero2 > numero1 ) {
                sumaTotal = numero2 - numero1;
                sumaTotal = -sumaTotal;
            } else if (a > 0 && b > 0){
                sumaTotal = numero2 + numero1;
            } else if (a < 0 && b < 0) {
                sumaTotal = numero1 + numero2;
                sumaTotal = -sumaTotal;
            }
        }
        System.out.println("La suma total de los dos numeros es : "+sumaTotal);
    }
}
