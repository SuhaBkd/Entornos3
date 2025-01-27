package B00_control;

public class E073EjemploStringBuilder {
    public static void main(String[] args) {
        // Hasta ahora hacíamos esto.
        String s = "Una cadena larga muy larga con muchos caracteres.";
        s = s + "a";
        s = s + "b";
        s = s + "c";
        System.out.println(s);

        // Ahora usaremos StringBuilder y su método append().
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("b");
        sb.append("c");
        // Y, por último, toString() para obtener el string definitivo.
        String cadenaDefinitiva = sb.toString();
        System.out.println(cadenaDefinitiva);

        // En realidad, en muchas situaciones, Java ya "pide" toString() por nostros:
        System.out.println(sb);



        // Prueba de eficiencia:
        long antes, despues, msTranscurridos;
        double sTranscurridos;

        // Con STRINGS.
        antes = System.currentTimeMillis();
        s = "";
        for (int i = 0; i < 150000; i++) {
            s = s+i;
        }
        despues = System.currentTimeMillis();
        msTranscurridos = despues - antes;
        sTranscurridos = (double) msTranscurridos / 1000;
        System.out.printf("Pegando trozos de String hemos tardado %.3f segundos.\n", sTranscurridos);

        // Con STRINGBUILDER.
        antes = System.currentTimeMillis();
        sb = new StringBuilder();
        for (int i = 0; i < 150000; i++) {
            sb.append(i);
        }
        despues = System.currentTimeMillis();
        msTranscurridos = despues - antes;
        sTranscurridos = (double) msTranscurridos / 1000;
        System.out.printf("Usando StringBuilder hemos tardado %.3f segundos.\n", sTranscurridos);
    }
}
