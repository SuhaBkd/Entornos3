package B00_control;

public class E011MultiplicacionConNegativos {
    public static void main(String[] args) {
        int aOriginal = -3, bOriginal = 5;
        int aCalculos, bCalculos;
        int resultado = 0;

        // Miramos a ver si aOriginal es positivo o negativo.
        if (aOriginal >= 0) {
            aCalculos = aOriginal;
            bCalculos = bOriginal;
        } else {
            // Si aOriginal es negativo, para que el programa funcione es necesario realizar un ajuste,
            // que consiste en invertir el signo de ambos valores (con lo que el resultado no variará).
            aCalculos = -aOriginal;
            bCalculos = -bOriginal;
        }

        // Para calcular el resultado, se suma "bCalculos" tantas veces como "aCalculos".
        for (int i=1; i<= aCalculos; i++) {
            resultado = resultado + bCalculos;
        }

        System.out.println("El resultado de " + aOriginal + " x " + bOriginal + " es: " + resultado);
    }
}