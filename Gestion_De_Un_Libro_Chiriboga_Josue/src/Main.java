import java.util.Scanner;

/*  Universidad de las Américas
    Estudiante: Josué Chiriboga
    Asignatura: Programación II
    NRC: 5458
    Fecha: 20/10/2024
    Enunciado 1: Gestion de un libro
*/

public class Main {
    public static void main(String[] args) {

        Libro libro = new Libro("The Maze Runner", "James Dashner", 2013, "Disponible");

        //Menu del libro
        Scanner sc = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("\n----------Gestion de Libro----------");
            System.out.println("1. Informacion del Libro");
            System.out.println("2. Prestar Libro");
            System.out.println("3. Devolver Libro");
            System.out.println("4. Modificar Libro");
            System.out.println("5. Salir");
            System.out.println("Seleccionar una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:
                    System.out.println(libro.toString());
                    break;
                case 2:
                    libro.prestarLibro();
                    break;
                case 3:
                    libro.devolverLibro();
                    break;
                case 4:
                    System.out.println("Nuevo Titulo: ");
                    String nuevoTitulo = sc.nextLine();
                    libro.setTitulo(nuevoTitulo);

                    System.out.println("Nuevo Autor: ");
                    String nuevoAutor = sc.nextLine();
                    libro.setAutor(nuevoAutor);

                    System.out.println("Nuevo Anio: ");
                    int nuevoAnioPublicacion = sc.nextInt();
                    libro.setAnioPublicacion(nuevoAnioPublicacion);
                    sc.nextLine();

                    System.out.println("Nuevo Estado (Disponible o Prestado): ");
                    String nuevoEstado = sc.nextLine();
                    libro.setEstado(nuevoEstado);

                    System.out.println("Libro Actualizado");
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