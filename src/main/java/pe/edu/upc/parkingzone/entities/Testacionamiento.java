package pe.edu.upc.parkingzone.entities;
//Desarrollando Briggitte

import jakarta.persistence.*;


@Entity
@Table(name = "Testacionamiento")
public class Testacionamiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //ATRIBUTOS
    private int idTestacionamiento;

    @Column(name = "descripcionTestacionamiento", length = 50, nullable = false)
    private String descripcionTestacionamiento;

    @Column(name = "medidaTestacionamiento", nullable = false)
    private float medidaTestacionamiento;

    //CONSTRUCTOR
    public Testacionamiento() {
    }

    public Testacionamiento(int idTestacionamiento, String descripcionTestacionamiento, float medidaTestacionamiento) {
        this.idTestacionamiento = idTestacionamiento;
        this.descripcionTestacionamiento = descripcionTestacionamiento;
        this.medidaTestacionamiento = medidaTestacionamiento;
    }


    //METODOS DE ACCESO
    public int getIdTestacionamiento() {
        return idTestacionamiento;
    }

    public void setIdTestacionamiento(int idTestacionamiento) {
        this.idTestacionamiento = idTestacionamiento;
    }

    public String getDescripcionTestacionamiento() {
        return descripcionTestacionamiento;
    }

    public void setDescripcionTestacionamiento(String descripcionTestacionamiento) {
        this.descripcionTestacionamiento = descripcionTestacionamiento;
    }

    public float getMedidaTestacionamiento() {
        return medidaTestacionamiento;
    }

    public void setMedidaTestacionamiento(float medidaTestacionamiento) {
        this.medidaTestacionamiento = medidaTestacionamiento;
    }

}
