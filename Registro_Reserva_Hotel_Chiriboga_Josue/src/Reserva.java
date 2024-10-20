/*  Universidad de las Américas
    Estudiante: Josué Chiriboga
    Asignatura: Programación II
    NRC: 5458
    Fecha: 20/10/2024
    Clase: Reserva
*/

public class Reserva {
    private String nombreCliente;
    private int numeroDias;
    private String tipoHabitacion;
    private String estadoReserva;

    //Constructor para inicializar atributos
    public Reserva(String nombreCliente, int numeroDias, String tipoHabitacion, String estadoReserva){
        this.nombreCliente = nombreCliente;
        this.numeroDias = numeroDias;
        this.tipoHabitacion = tipoHabitacion;
        this.estadoReserva = estadoReserva;
    }

    //Getters y Setters
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getNumeroDias() {
        return numeroDias;
    }

    public void setNumeroDias(int numeroDias) {
        this.numeroDias = numeroDias;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public String getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(String estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    //toString mostrar informacion


    @Override
    public String toString() {
        return "Nombre del Cliente: " + nombreCliente + "\n" +
                "Número de Días: " + numeroDias + "\n" +
                "Tipo de Habitación: " + tipoHabitacion + "\n" +
                "Estado: " + estadoReserva;
    }

    //Mostrar informacion de reserva
    public void mostrarInformacion(){
        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("Numero de dias: " + numeroDias);
        System.out.println("Tipo de habitacion: " + tipoHabitacion);
        System.out.println("Estado de la reserva: " + estadoReserva);
    }

    //Confirmar reserva
    public void confrimarReserva() {
        if (estadoReserva.equalsIgnoreCase("Cancelada")) {
            System.out.println("La reserva esta cancelada");
        } else {
            estadoReserva = "Confirmada";
            System.out.println("La reserva esta confirmada");
        }
    }

    //Cancelar reserva
    public void cancelarReserva(){
        if (estadoReserva.equalsIgnoreCase("Confirmada")){
            estadoReserva = "Cancelada";
            System.out.println("La reserva fue cancelada");
        } else {
            System.out.println("La reserva ya esta cancelada");
        }
    }
}
