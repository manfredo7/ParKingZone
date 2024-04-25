package pe.edu.upc.parkingzone.dtos;

import java.time.LocalDate;

public class MembresiaDTO {
    private int idMembresia;
    private float precioMembresia;
    private LocalDate fechaInicioMembresia;
    private LocalDate fechaFinMembresia;
    private String descripcionMembresia;
    private float descuentoMembresia;


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
