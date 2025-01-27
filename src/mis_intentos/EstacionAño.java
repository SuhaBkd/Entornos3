package mis_intentos;
import java.util.Scanner;
enum Mes {
        Enero,
        Febrero,
        Marzo,
        Abril,
        Mayo,
        Junio,
        Julio,
        Agosto,
        Septiembre,
        Octubre,
        Noviembre,
        Diciembre
    }
public class EstacionAño {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String estacion;
        System.out.println("Ingrese el mes: ");
        String mesInput = teclado.nextLine();
        Mes mes = Mes.Enero;

        switch (mes) {
            case Diciembre:
            case Enero:
            case Febrero:
                estacion = "Invierno";
                break;
            case Marzo:
            case Abril:
            case Mayo:
                estacion = "Primavera";
                break;
            case Junio:
            case Julio:
            case Agosto:
                estacion = "verano";
                break;
            case Septiembre:
            case Octubre:
            case Noviembre:
                estacion = "Otoño";
                break;
            default:
                estacion = "no hay más estaciones";
                break;
        }
        System.out.println("la estación : " + estacion );
    }
}

