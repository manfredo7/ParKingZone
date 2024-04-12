package pe.edu.upc.parkingzone.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Membresia")
public class Membresia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMembresia;

    @Column(name = "finicioMembresia", nullable = false)
    private LocalDate finicioMembresia;

    @Column(name = "ffinMembresia", nullable = false)
    private LocalDate ffinMembresia;

    @Column(name = "descripcionMembresia",length = 200,nullable = false)
    private String descripcionMembresia;


    public Membresia() {
    }

    public Membresia(int idMembresia, LocalDate finicioMembresia, LocalDate ffinMembresia, String descripcionMembresia) {
        this.idMembresia = idMembresia;
        this.finicioMembresia = finicioMembresia;
        this.ffinMembresia = ffinMembresia;
        this.descripcionMembresia = descripcionMembresia;
    }

    public int getIdMembresia() {
        return idMembresia;
    }

    public void setIdMembresia(int idMembresia) {
        this.idMembresia = idMembresia;
    }

    public LocalDate getFinicioMembresia() {
        return finicioMembresia;
    }

    public void setFinicioMembresia(LocalDate finicioMembresia) {
        this.finicioMembresia = finicioMembresia;
    }

    public LocalDate getFfinMembresia() {
        return ffinMembresia;
    }

    public void setFfinMembresia(LocalDate ffinMembresia) {
        this.ffinMembresia = ffinMembresia;
    }

    public String getDescripcionMembresia() {
        return descripcionMembresia;
    }

    public void setDescripcionMembresia(String descripcionMembresia) {
        this.descripcionMembresia = descripcionMembresia;
    }
}
