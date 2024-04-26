package pe.edu.upc.parkingzone.dtos.QuerysDTO;

public class ReservaQ1DTO {
    private int id;
    private String nombre;
    private Double horasReservadas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getHorasReservadas() {
        return horasReservadas;
    }

    public void setHorasReservadas(Double horasReservadas) {
        this.horasReservadas = horasReservadas;
    }
}
