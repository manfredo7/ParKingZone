package pe.edu.upc.parkingzone.entities;
//OSCAR
import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "Membresia")
public class Membresia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMembresia;
    @Column(name="precioMembresia",nullable = false)
    private float precioMembresia;
    @Column(name="fechaInicioMembresia",nullable = false)
    private LocalDate fechaInicioMembresia;
    @Column(name ="fechaFinMembresia",nullable = false)
    private LocalDate fechaFinMembresia;
    @Column(name ="descripcionMembresia",length = 50,nullable = false)
    private String descripcionMembresia;
    @Column(name ="descuentoMembresia",nullable = false)
    private float descuentoMembresia;

    public Membresia() {
    }
    //CONSTRUCTOR
    public Membresia(int idMembresia, float precioMembresia, LocalDate fechaInicioMembresia, LocalDate fechaFinMembresia, String descripcionMembresia, float descuentoMembresia) {
        this.idMembresia = idMembresia;
        this.precioMembresia = precioMembresia;
        this.fechaInicioMembresia = fechaInicioMembresia;
        this.fechaFinMembresia = fechaFinMembresia;
        this.descripcionMembresia = descripcionMembresia;
        this.descuentoMembresia = descuentoMembresia;
    }

    public int getIdMembresia() {
        return idMembresia;
    }

    public void setIdMembresia(int idMembresia) {
        this.idMembresia = idMembresia;
    }

    public float getPrecioMembresia() {
        return precioMembresia;
    }

    public void setPrecioMembresia(float precioMembresia) {
        this.precioMembresia = precioMembresia;
    }

    public LocalDate getFechaInicioMembresia() {
        return fechaInicioMembresia;
    }

    public void setFechaInicioMembresia(LocalDate fechaInicioMembresia) {
        this.fechaInicioMembresia = fechaInicioMembresia;
    }

    public LocalDate getFechaFinMembresia() {
        return fechaFinMembresia;
    }

    public void setFechaFinMembresia(LocalDate fechaFinMembresia) {
        this.fechaFinMembresia = fechaFinMembresia;
    }

    public String getDescripcionMembresia() {
        return descripcionMembresia;
    }

    public void setDescripcionMembresia(String descripcionMembresia) {
        this.descripcionMembresia = descripcionMembresia;
    }

    public float getDescuentoMembresia() {
        return descuentoMembresia;
    }

    public void setDescuentoMembresia(float descuentoMembresia) {
        this.descuentoMembresia = descuentoMembresia;
    }





}


