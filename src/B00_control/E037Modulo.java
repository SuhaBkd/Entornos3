package B00_control;

public class E037Modulo {
    public static void main(String[] args) {
        for (int n = 1; n <= 50; n++) {
            System.out.print("Vamos por el número " + n + ". ");
            System.out.print(n + " módulo 5 es " + n % 5 + ". ");
            if (n % 7 == 0) System.out.print("El número SÍ es múltiplo de 7.");
            else            System.out.print("El número NO es múltiplo de 7.");
            System.out.println();
        }
    }
}
