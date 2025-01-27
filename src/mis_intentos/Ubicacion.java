package mis_intentos;
import java.util.Scanner;
enum Direccion {
    NORTE,
    SUR,
    ESTE,
    OESTE
        }

public class Ubicacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la direccíon: ");
        String DireccionInput = teclado.nextLine();
        String Ubicacion;

        Direccion direccion = Direccion.NORTE;
        switch (direccion) {
            case NORTE:
                Ubicacion = "Avanzar hacia el norte";
                break;
            case SUR:
                Ubicacion ="Retroceder hacia el sur";
                break;
            case ESTE:
                Ubicacion ="Desplazarse hacia la derecha";
                break;
            case OESTE:
                Ubicacion ="Desplazarse hacia la izquierda";
                break;
            default:
                Ubicacion ="La direecíon es invalida \n Por favor intentalo de nuevo:";
        }
        System.out.println("Para llegar a vuestra ubicación ---> " + Ubicacion);
    }
}
