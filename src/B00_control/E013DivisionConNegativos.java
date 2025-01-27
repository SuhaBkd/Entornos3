package B00_control;

import java.util.Scanner;

public class E013DivisionConNegativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitamos el valor del dividendo y divisor al usuario.
        System.out.println("Ingrese el valor del dividendo: ");
        int dividendo = scanner.nextInt();

        System.out.println("Ingrese el valor del divisor: ");
        int divisor = scanner.nextInt();

        // Nos aseguramos de que el divisor no sea 0.
//        if (divisor == 0) {
//            System.out.println("Error: El divisor NO puede ser cero.");
//            return;
//        }

        // Determinamos si el cociente deberá ser positivo.
        boolean ambosSonNegativos = dividendo < 0 && divisor < 0;
        boolean ambosSonPositivos = dividendo > 0 && divisor > 0;
        boolean cocienteDebeSerPositivo = ambosSonNegativos || ambosSonPositivos;
        // Otra forma de calcularlo:
        cocienteDebeSerPositivo = (dividendo < 0 && divisor < 0) || (dividendo > 0 && divisor > 0);

        // Determinamos si el resto deberá ser positivo.
        boolean restoDebeSerPositivo = dividendo >= 0;

        // Convertimos el dividendo y divisor a valores absolutos para realizar el cálculo.
        int restoAbs = Math.abs(dividendo);
        int divisorAbs = Math.abs(divisor);
        int cocienteAbs = 0;

        // Calculamos el cocienteAbs usando restas consecutivas.
        while (restoAbs >= divisorAbs) {
            restoAbs = restoAbs - divisorAbs;
            cocienteAbs++;
        }

        // Ya hemos terminado de dividir en valor absoluto. Ahora podemos necesitar hacer un ajuste con el signo.

        int cociente, resto;

        if (cocienteDebeSerPositivo) cociente = cocienteAbs;
        else cociente = -cocienteAbs; // Si el resultado es negativo, ajustamos el signo del cocienteAbs.

        if (restoDebeSerPositivo) resto = restoAbs;
        else resto = -restoAbs; // Si el dividendo era negativo, el resto, también.

        // Mostramos el cocienteAbs y el resto.
        System.out.println("El cocienteAbs es: " + cociente);
        System.out.println("El valor del resto es: " + resto);
    }
}
