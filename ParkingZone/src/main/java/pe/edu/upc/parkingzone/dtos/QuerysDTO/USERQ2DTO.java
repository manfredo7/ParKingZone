package pe.edu.upc.parkingzone.dtos.QuerysDTO;

public class USERQ2DTO {
    private long nusuarios;

    public USERQ2DTO(long nusuarios) {
        this.nusuarios = nusuarios;
    }

    public long getNusuarios() {
        return nusuarios;
    }

    public void setNusuarios(long nusuarios) {
        this.nusuarios = nusuarios;
    }
}
