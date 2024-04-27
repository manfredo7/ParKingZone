package pe.edu.upc.parkingzone.dtos.QuerysDTO;

public class EstacionamientoQ1DTO {
    private String nombreEstacionamiento;
    private double horasReservadas;

    public String getNombreEstacionamiento() {
        return nombreEstacionamiento;
    }

    public void setNombreEstacionamiento(String nombreEstacionamiento) {
        this.nombreEstacionamiento = nombreEstacionamiento;
    }

    public double getHorasReservadas() {
        return horasReservadas;
    }

    public void setHorasReservadas(double horasReservadas) {
        this.horasReservadas = horasReservadas;
    }
}
