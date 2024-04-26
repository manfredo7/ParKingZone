package pe.edu.upc.parkingzone.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import pe.edu.upc.parkingzone.entities.Estacionamiento;

public class ComentarioDTO {

    private int comentarioID;


    private int puntuacion;

    private String descripcion;

    private Estacionamiento estacionamiento;

    public int getComentarioID() {
        return comentarioID;
    }

    public void setComentarioID(int comentarioID) {
        this.comentarioID = comentarioID;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Estacionamiento getEstacionamiento() {
        return estacionamiento;
    }

    public void setEstacionamiento(Estacionamiento estacionamiento) {
        this.estacionamiento = estacionamiento;
    }
}
