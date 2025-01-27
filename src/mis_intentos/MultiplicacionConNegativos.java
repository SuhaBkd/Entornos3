package mis_intentos;

import java.util.Scanner;

public class MultiplicacionConNegativos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int a = entrada.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int b = entrada.nextInt();

        int absA = Math.abs(a);
        int absB = Math.abs(b);

        int resultado = 0;

        for (int i = 0; i < absA; i++) {
            resultado += absB;
        }
            if ((a > 0 && b < 0) || (a < 0 && b > 0)){
                resultado = -resultado;
        }
        System.out.println(resultado);
    }
}