package pe.edu.upc.parkingzone.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;

    @Column(name = "nombreUsuario", length = 25,nullable = false)
    private String nombreUsuario;

    @Column(name = "apellidopUsuario", length = 25,nullable = false)
    private String apellidopUsuario;

    @Column(name = "apellidomUsuario", length = 25,nullable = false)
    private String apellidomUsuario;

    @Column(name = "fnacimientoUsuario",nullable = false)
    private LocalDate fnacimientoUsuario;

    @Column(name = "correoUsuario", length = 50,nullable = false)
    private String correoUsuario;
@ManyToOne
@JoinColumn(name = "membresia", nullable = false)
private Membresia membresia;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombreUsuario, String apellidopUsuario, String apellidomUsuario, LocalDate fnacimientoUsuario, String correoUsuario, Membresia membresia) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.apellidopUsuario = apellidopUsuario;
        this.apellidomUsuario = apellidomUsuario;
        this.fnacimientoUsuario = fnacimientoUsuario;
        this.correoUsuario = correoUsuario;
        this.membresia = membresia;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidopUsuario() {
        return apellidopUsuario;
    }

    public void setApellidopUsuario(String apellidopUsuario) {
        this.apellidopUsuario = apellidopUsuario;
    }

    public String getApellidomUsuario() {
        return apellidomUsuario;
    }

    public void setApellidomUsuario(String apellidomUsuario) {
        this.apellidomUsuario = apellidomUsuario;
    }

    public LocalDate getFnacimientoUsuario() {
        return fnacimientoUsuario;
    }

    public void setFnacimientoUsuario(LocalDate fnacimientoUsuario) {
        this.fnacimientoUsuario = fnacimientoUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }
}
