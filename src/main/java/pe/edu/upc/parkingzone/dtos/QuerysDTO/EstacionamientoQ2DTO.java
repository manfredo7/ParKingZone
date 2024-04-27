package pe.edu.upc.parkingzone.dtos.QuerysDTO;

public class EstacionamientoQ2DTO {
    private String nombreEstacionamiento;
    private double montoTotal;

    public String getNombreEstacionamiento() {
        return nombreEstacionamiento;
    }

    public void setNombreEstacionamiento(String nombreEstacionamiento) {
        this.nombreEstacionamiento = nombreEstacionamiento;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }
}
