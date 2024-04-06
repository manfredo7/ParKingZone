package pe.edu.upc.parkingzone.dtos;

import jakarta.persistence.Column;

public class RolDTO {
    private int RolID;

    private String Descripcion;

    public int getRolID() {
        return RolID;
    }

    public void setRolID(int rolID) {
        RolID = rolID;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
