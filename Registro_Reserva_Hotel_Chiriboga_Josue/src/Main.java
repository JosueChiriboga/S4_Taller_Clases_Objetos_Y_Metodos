import java.util.Scanner;

/*  Universidad de las Américas
    Estudiante: Josué Chiriboga
    Asignatura: Programación II
    NRC: 5458
    Fecha: 20/10/2024
    Enunciado 2: Registro de una Reserva de Hotel
*/

public class Main {
    public static void main(String[] args) {
        Reserva reserva = new Reserva("Josue", 4, "Suite", "Confirmada");

        Scanner sc = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("\n-------Gestion de Reserva------");
            System.out.println("1. Informacion Reserva");
            System.out.println("2. Confirmar Reserva");
            System.out.println("3. Cancelar Reserva");
            System.out.println("4. Modificar Informacion");
            System.out.println("5. Salir");
            System.out.println("Seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:
                    System.out.println(reserva.toString());
                    break;
                case 2:
                    reserva.confrimarReserva();
                    break;
                case 3:
                    reserva.cancelarReserva();
                    break;
                case 4:
                    System.out.println("Nuevo nombre del cliente: ");
                    String nuevoNombre = sc.nextLine();
                    reserva.setNombreCliente(nuevoNombre);

                    System.out.println("Nuevo numero de dias: ");
                    int nuevoNumeroDias = sc.nextInt();
                    reserva.setNumeroDias(nuevoNumeroDias);
                    sc.nextLine();

                    System.out.println("Nuevo tipo de habitacion: ");
                    String nuevoTipoHabitacion = sc.nextLine();
                    reserva.setTipoHabitacion(nuevoTipoHabitacion);

                    System.out.println("Nuevo Estado de reserva: ");
                    String nuevoEsatdoReserva = sc.nextLine();
                    reserva.setEstadoReserva(nuevoEsatdoReserva);

                    System.out.println("Informacion Actualizada");
                    break;
                case 5:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion incorrecta. Ingrese nuevamente");
            }
        } while (opcion != 5);
        sc.close();
    }
}