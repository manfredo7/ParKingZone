package pe.edu.upc.parkingzone.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "comentarios")
public class Comentarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int comentarioID;

    @Column(name = "puntuacion",nullable = false)
    private int puntuacion;
    @Column(name = "descripcion",length = 240,nullable = false)
    private String descripcion;
    @ManyToOne
    @JoinColumn(name = "estacionamientoid")
    private Estacionamiento estacionamiento;

    public Comentarios() {
    }

    public Comentarios(int comentarioID, int puntuacion, String descripcion, Estacionamiento estacionamiento) {
        this.comentarioID = comentarioID;
        this.puntuacion = puntuacion;
        this.descripcion = descripcion;
        this.estacionamiento = estacionamiento;
    }

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
