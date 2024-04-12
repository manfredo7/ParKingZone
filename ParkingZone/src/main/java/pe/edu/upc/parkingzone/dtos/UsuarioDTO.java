package pe.edu.upc.parkingzone.dtos;

import pe.edu.upc.parkingzone.entities.Membresia;

import java.time.LocalDate;

public class UsuarioDTO {
    private int usuarioID;


    private LocalDate Fregistro;


    private String Nombre;


    private String ApellidoP;


    private String ApellidoM;


    private String Fnacimiento;


    private String Correo;


    private String Contrasena;


    private Membresia membresia;

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
