package pe.edu.upc.parkingzone.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "Rol")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int RolID;

@Column(name = "Descripcion",length = 50,nullable = false)
    private String Descripcion;

    public Rol() {
    }

    public Rol(int rolID, String descripcion) {
        RolID = rolID;
        Descripcion = descripcion;
    }

    public int getRolID() {
        return RolID;
    }

    public void setRolID(int rolID) {
        RolID = rolID;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
