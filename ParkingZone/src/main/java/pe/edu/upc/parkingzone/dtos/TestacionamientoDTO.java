package pe.edu.upc.parkingzone.dtos;
//Desarrollo Bri
public class TestacionamientoDTO {
    private int idTestacionamiento;
    private String descripcionTestacionamiento;
    private float medidaTestacionamiento;


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
