package pe.edu.upc.parkingzone.dtos;

import jakarta.persistence.Column;
import pe.edu.upc.parkingzone.entities.Membresia;

import java.time.LocalDate;

public class UserDTO {
    private Long id;

    private String username;
    private String password;
    private Boolean enabled;
    private LocalDate Fregistro;
    private String Nombre;
    private String ApellidoP;
    private String ApellidoM;
    private String Fnacimiento;
    private String Correo;
    private Membresia membresia;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
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

    public Membresia getMembresia() {
        return membresia;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }
}
