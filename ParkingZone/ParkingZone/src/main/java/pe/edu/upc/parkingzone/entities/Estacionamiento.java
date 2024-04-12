package pe.edu.upc.parkingzone.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Estacionamiento")
public class Estacionamiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEstacionamiento;
    @Column(name = "nombreEstacionamiento", length = 50, nullable = false)
    private String nombreEstacionamiento;
    @Column(name = "direccionEstacionamiento", length = 150, nullable = false)
    private String direccionEstacionamiento;
    @Column(name = "capacidadEstacionamiento", nullable = false)
    private int capacidadEstacionamiento;
    @Column(name = "tarifaEstacionamiento", nullable = false)
    private float tarifaEstacionamiento;
    @Column(name = "horarioperativoEstacionamiento", length = 25,nullable = false)
    private String horarioperativoEstacionamiento;
    @Column(name = "ventajasEstacionamiento", length = 150,nullable = false)
    private String ventajasEstacionamiento;
    @Column(name = "desdesventajasEstacionamiento", length = 150,nullable = false)
    private String desventajasEstacionamiento;

    @ManyToOne
    @JoinColumn(name = "Testacionamientoid")
    private Testacionamiento testacionamiento;

    public Estacionamiento() {
    }

    public Estacionamiento(int idEstacionamiento, String nombreEstacionamiento, String direccionEstacionamiento, int capacidadEstacionamiento, float tarifaEstacionamiento, String horarioperativoEstacionamiento, String ventajasEstacionamiento, String desventajasEstacionamiento, Testacionamiento testacionamiento) {
        this.idEstacionamiento = idEstacionamiento;
        this.nombreEstacionamiento = nombreEstacionamiento;
        this.direccionEstacionamiento = direccionEstacionamiento;
        this.capacidadEstacionamiento = capacidadEstacionamiento;
        this.tarifaEstacionamiento = tarifaEstacionamiento;
        this.horarioperativoEstacionamiento = horarioperativoEstacionamiento;
        this.ventajasEstacionamiento = ventajasEstacionamiento;
        this.desventajasEstacionamiento = desventajasEstacionamiento;
        this.testacionamiento = testacionamiento;
    }

    public int getIdEstacionamiento() {
        return idEstacionamiento;
    }

    public void setIdEstacionamiento(int idEstacionamiento) {
        this.idEstacionamiento = idEstacionamiento;
    }

    public String getNombreEstacionamiento() {
        return nombreEstacionamiento;
    }

    public void setNombreEstacionamiento(String nombreEstacionamiento) {
        this.nombreEstacionamiento = nombreEstacionamiento;
    }

    public String getDireccionEstacionamiento() {
        return direccionEstacionamiento;
    }

    public void setDireccionEstacionamiento(String direccionEstacionamiento) {
        this.direccionEstacionamiento = direccionEstacionamiento;
    }

    public int getCapacidadEstacionamiento() {
        return capacidadEstacionamiento;
    }

    public void setCapacidadEstacionamiento(int capacidadEstacionamiento) {
        this.capacidadEstacionamiento = capacidadEstacionamiento;
    }

    public float getTarifaEstacionamiento() {
        return tarifaEstacionamiento;
    }

    public void setTarifaEstacionamiento(float tarifaEstacionamiento) {
        this.tarifaEstacionamiento = tarifaEstacionamiento;
    }

    public String getHorarioperativoEstacionamiento() {
        return horarioperativoEstacionamiento;
    }

    public void setHorarioperativoEstacionamiento(String horarioperativoEstacionamiento) {
        this.horarioperativoEstacionamiento = horarioperativoEstacionamiento;
    }

    public String getVentajasEstacionamiento() {
        return ventajasEstacionamiento;
    }

    public void setVentajasEstacionamiento(String ventajasEstacionamiento) {
        this.ventajasEstacionamiento = ventajasEstacionamiento;
    }

    public String getDesventajasEstacionamiento() {
        return desventajasEstacionamiento;
    }

    public void setDesventajasEstacionamiento(String desventajasEstacionamiento) {
        this.desventajasEstacionamiento = desventajasEstacionamiento;
    }

    public Testacionamiento getTestacionamiento() {
        return testacionamiento;
    }

    public void setTestacionamiento(Testacionamiento testacionamiento) {
        this.testacionamiento = testacionamiento;
    }
}
