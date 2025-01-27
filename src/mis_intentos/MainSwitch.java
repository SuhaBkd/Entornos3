package mis_intentos;

import java.util.Scanner;

public class MainSwitch {
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

    enum Direccion {
        NORTE,
        SUR,
        ESTE,
        OESTE
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Parte 1: Días de la semana
        System.out.print("Ingresa un número del 1 al 7: ");
        int numero = scanner.nextInt();
        switch (numero) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("ERROR \nPor favor ingresa un número del 1 al 7.");
        }

            // Parte 2: Calificación
        System.out.println("Introduzca vuestra nota para calificarla: ");
        int nota = scanner.nextInt();
        String calificacion;

        switch (nota) {
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
        System.out.println("Calificación: " + calificacion);

            // Parte 3: Estación del año
            System.out.println("Ingrese el mes: ");
            scanner.nextLine(); // Consumir el salto de línea
            String mesInput = scanner.nextLine();
            Mes mes = Mes.valueOf(mesInput);

            String estacion;
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
                    estacion = "Verano";
                    break;
                case Septiembre:
                case Octubre:
                case Noviembre:
                    estacion = "Otoño";
                    break;
                default:
                    estacion = "No hay más estaciones";
                    break;
            }
            System.out.println("La estación: " + estacion);

        // Parte 4: Dirección
        System.out.println("Ingrese la dirección: ");
        String direccionInput = scanner.nextLine();
        Direccion direccion = Direccion.valueOf(direccionInput.toUpperCase());

        String ubicacion;
        switch (direccion) {
            case NORTE:
                ubicacion = "Avanzar hacia el norte";
                break;
            case SUR:
                ubicacion = "Retroceder hacia el sur";
                break;
            case ESTE:
                ubicacion = "Desplazarse hacia la derecha";
                break;
            case OESTE:
                ubicacion = "Desplazarse hacia la izquierda";
                break;
            default:
                ubicacion = "La dirección es inválida \n Por favor intentalo de nuevo:";
        }
        System.out.println("Para llegar a vuestra ubicación ---> " + ubicacion);

        scanner.close();
    }
}