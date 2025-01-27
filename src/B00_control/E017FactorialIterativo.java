package B00_control;

public class E017FactorialIterativo {
    public static void main(String[] args) {
        int n = 5;

        int acumulado = 1;

        // Se itera hasta i=2, ya que con i=1 se multiplicaría x1 y no aportaría nada.
        for (int i = n; 2 <= i; i--) {
            acumulado = acumulado * i;
        }

        int factorial = acumulado;

        System.out.println(factorial);
    }
}
