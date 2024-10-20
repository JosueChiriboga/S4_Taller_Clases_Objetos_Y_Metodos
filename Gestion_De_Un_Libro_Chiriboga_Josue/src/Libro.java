/*  Universidad de las Américas
    Estudiante: Josué Chiriboga
    Asignatura: Programación II
    NRC: 5458
    Fecha: 20/10/2024
    Clase: Libro
*/
public class Libro {
    // Atributos privados
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private String estado;

    // Constructor para inicializar los atributos
    public Libro(String titulo, String autor, int anioPublicacion, String estado){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.estado = estado;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    //toString mostrar informacion
    @Override
    public String toString() {
        return  "Titulo: " + titulo + "\n" +
                "Autor: " + autor + "\n" +
                "Año de Publicación: " + anioPublicacion + "\n" +
                "Estado: " + estado;
    }

    //Mostrar la información del libro.
    public void mostrarInformacion(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Anio de Publicacion: " + anioPublicacion);
        System.out.println("Estado: " + estado);
    }

    //Estado del libro "Préstamo"
    public void prestarLibro(){
        if (estado.equalsIgnoreCase("Disponible")){
            estado = "Prestamo";
            System.out.println("Libro fue prestado");
        } else {
            System.out.println("Libro prestado");
        }
    }

    //Estado del libro "Devolución"
    public void devolverLibro(){
        if (estado.equalsIgnoreCase("Prestado")){
            estado = "Disponible";
            System.out.println("Libro devuelto");
        } else {
            System.out.println("Libro Disponible");
        }
    }

}
