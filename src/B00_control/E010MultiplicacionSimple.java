package B00_control;

public class E010MultiplicacionSimple {
    public static void main(String[] args) {
        int a=-2;
        int b=5;
        int resultado = 0;

        for (int i=1; i<=a; i++) {
            resultado = resultado + b;
        }

        System.out.println("El resultado de " + a + "x" + b + " es: " + resultado);
    }
}