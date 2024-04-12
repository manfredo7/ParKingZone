package pe.edu.upc.parkingzone.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int usuarioID;

    @Column(name = "Fregistro",nullable = false)
    private LocalDate Fregistro;

    @Column(name = "Nombre",length = 50,nullable = false)
    private String Nombre;

    @Column(name = "ApellidoP",length = 50,nullable = false)
    private String ApellidoP;

    @Column(name = "ApellidoM",length = 50,nullable = false)
    private String ApellidoM;

    @Column(name = "Fnacimiento",nullable = false)
    private String Fnacimiento;

    @Column(name = "Correo",length = 50,nullable = false)
    private String Correo;

    @Column(name = "Contrasena",length = 50,nullable = false)
    private String Contrasena;

    @JoinColumn(name = "IDmembresia")
    @ManyToOne
    private Membresia membresia;


    public Usuario() {
    }

    public Usuario(int usuarioID, LocalDate fregistro, String nombre, String apellidoP, String apellidoM, String fnacimiento, String correo, String contrasena, Membresia membresia) {
        this.usuarioID = usuarioID;
        Fregistro = fregistro;
        Nombre = nombre;
        ApellidoP = apellidoP;
        ApellidoM = apellidoM;
        Fnacimiento = fnacimiento;
        Correo = correo;
        Contrasena = contrasena;
        this.membresia = membresia;
    }

    public int getUsuarioID() {
        return usuarioID;
    }

    public void setUsuarioID(int usuarioID) {
        this.usuarioID = usuarioID;
    }

    public LocalDate getFregistro() {
        return Fregistro;
    }

    public void setFregistro(LocalDate fregistro) {
        Fregistro = fregistro;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidoP() {
        return ApellidoP;
    }

    public void setApellidoP(String apellidoP) {
        ApellidoP = apellidoP;
    }

    public String getApellidoM() {
        return ApellidoM;
    }

    public void setApellidoM(String apellidoM) {
        ApellidoM = apellidoM;
    }

    public String getFnacimiento() {
        return Fnacimiento;
    }

    public void setFnacimiento(String fnacimiento) {
        Fnacimiento = fnacimiento;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String contrasena) {
        Contrasena = contrasena;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }
}
