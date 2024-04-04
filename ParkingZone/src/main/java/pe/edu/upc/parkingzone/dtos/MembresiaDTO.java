package pe.edu.upc.parkingzone.dtos;

public class MembresiaDTO {
    private int idMembresia;
    private int fechaInicioMembresia;
    private int fechaFinMembresia;
    private String descripcionMembresia;
    private float descuentoMembresia;

    public int getIdMembresia() {
        return idMembresia;
    }

    public void setIdMembresia(int idMembresia) {
        this.idMembresia = idMembresia;
    }

    public int getFechaInicioMembresia() {
        return fechaInicioMembresia;
    }

    public void setFechaInicioMembresia(int fechaInicioMembresia) {
        this.fechaInicioMembresia = fechaInicioMembresia;
    }

    public int getFechaFinMembresia() {
        return fechaFinMembresia;
    }

    public void setFechaFinMembresia(int fechaFinMembresia) {
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
