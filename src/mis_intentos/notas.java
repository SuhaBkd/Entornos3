package mis_intentos;

import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca vuestra nota para calificarla: ");
        int nota = teclado.nextInt();
        String calificacion;

        switch(nota){
            case 10:
            case 9:
                 calificacion = "Sobresaliente";
                 break;
            case 8:
            case 7:
                 calificacion = "Notable";
                 break;
            case 6:
            case 5:
                 calificacion = "Aprobado";
                 break;
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                calificacion = "Suspenso";
                break;

            default:
                calificacion = "ERROR \n Introduzca una nota válida entre 0 y 10.";
                break;
        }
        System.out.println("calificacion : " + calificacion);
    }
}
