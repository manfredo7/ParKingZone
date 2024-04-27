package pe.edu.upc.parkingzone.dtos.QuerysDTO;

public class ReservaQ1DTO {
    private int cantreservas;

    public ReservaQ1DTO(int cantreservas) {
        this.cantreservas = cantreservas;
    }

    public int getCantreservas() {
        return cantreservas;
    }

    public void setCantreservas(int cantreservas) {
        this.cantreservas = cantreservas;
    }
}
