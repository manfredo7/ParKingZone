package pe.edu.upc.parkingzone.dtos;

import jakarta.persistence.Column;
import pe.edu.upc.parkingzone.entities.Testacionamiento;

public class EstacionamientoDTO {
    private int idEstacionamiento;
    private String nombreEstacionamiento;
    private String direccionEstacionamiento;
    private int capacidadEstacionamiento;
    private float tarifaEstacionamiento;
    private String horarioperativoEstacionamiento;
    private String ventajasEstacionamiento;
    private String desventajasEstacionamiento;
    private Testacionamiento testacionamiento;

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
