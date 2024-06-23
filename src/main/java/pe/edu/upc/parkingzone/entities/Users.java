package pe.edu.upc.parkingzone.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "users")
public class Users implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30, unique = true)
    private String username;

    @Column(name = "Fregistro",nullable = false)
    private LocalDate fregistro;

    @Column(name = "Nombre",length = 50,nullable = false)
    private String nombre;

    @Column(name = "ApellidoP",length = 50,nullable = false)
    private String apellidoP;

    @Column(name = "ApellidoM",length = 50,nullable = false)
    private String apellidoM;

    @Column(name = "Fnacimiento",nullable = false)
    private String fnacimiento;

    @Column(name = "Correo",length = 50,nullable = false)
    private String correo;
    @Column(length = 200)
    private String password;
    @JoinColumn(name = "IDmembresia")
    @ManyToOne
    private Membresia membresia;
    private Boolean enabled;

    @JsonIgnore
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private List<Role> roles;


    public Users() {
    }


    public Users(Long id, String username, LocalDate fregistro, String nombre, String apellidoP, String apellidoM, String fnacimiento, String correo, String password, Membresia membresia, Boolean enabled, List<Role> roles) {
        this.id = id;
        this.username = username;
        this.fregistro = fregistro;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.fnacimiento = fnacimiento;
        this.correo = correo;
        this.password = password;
        this.membresia = membresia;
        this.enabled = enabled;
        this.roles = roles;
    }

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

    public LocalDate getFregistro() {
        return fregistro;
    }

    public void setFregistro(LocalDate fregistro) {
        this.fregistro = fregistro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getFnacimiento() {
        return fnacimiento;
    }

    public void setFnacimiento(String fnacimiento) {
        this.fnacimiento = fnacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}