package pe.edu.upc.parkingzone.entities;

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
    @Column(length = 200)
    private String password;
    @JoinColumn(name = "IDmembresia")
    @ManyToOne
    private Membresia membresia;
    private Boolean enabled;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private List<Role> roles;


    public Users() {
    }

    public Users(Long id, String username, LocalDate fregistro, String nombre, String apellidoP, String apellidoM, String fnacimiento, String correo, String password, Membresia membresia, Boolean enabled, List<Role> roles) {
        this.id = id;
        this.username = username;
        Fregistro = fregistro;
        Nombre = nombre;
        ApellidoP = apellidoP;
        ApellidoM = apellidoM;
        Fnacimiento = fnacimiento;
        Correo = correo;
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