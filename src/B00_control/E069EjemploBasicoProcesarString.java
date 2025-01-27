package B00_control;

public class E069EjemploBasicoProcesarString {
    public static void main(String[] args) {
        String s = "Arrivederci!";
        String sMinuscula = s.toLowerCase();

        System.out.printf("El string tiene %d caracteres y hay una letra %s en su posición 4.\n", s.length(), s.charAt(4));

        int contador = 0;

        for (int pos = 0; pos < s.length(); pos++) {
            char c = sMinuscula.charAt(pos);

            System.out.println(c);

            if (c == 'a' || c == 'e' || c =='i') contador++;
        }

        System.out.printf("El string %s tiene %d vocales.", s, contador);
    }
}
