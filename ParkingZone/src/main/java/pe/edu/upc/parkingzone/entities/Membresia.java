package pe.edu.upc.parkingzone.entities;
//OSCAR
import jakarta.persistence.*;


@Entity
@Table(name = "Membresia")
public class Membresia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMembresia;
    @Column(name="fechaInicioMembresia",nullable = false)
    private int fechaInicioMembresia;
    @Column(name ="fechaFinMembresia",nullable = false)
    private int fechaFinMembresia;
    @Column(name ="descripcionMembresia",length = 50,nullable = false)
    private String descripcionMembresia;
    @Column(name ="descuentoMembresia",nullable = false)
    private float descuentoMembresia;

    //CONSTRUCTOR
    public Membresia() {
    }

    public Membresia(int idMembresia, int fechaInicioMembresia, int fechaFinMembresia, String descripcionMembresia, float descuentoMembresia) {
        this.idMembresia = idMembresia;
        this.fechaInicioMembresia = fechaInicioMembresia;
        this.fechaFinMembresia = fechaFinMembresia;
        this.descripcionMembresia = descripcionMembresia;
        this.descuentoMembresia = descuentoMembresia;
    }




    //METODOS DE ACCESO
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


