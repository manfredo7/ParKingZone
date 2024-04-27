package pe.edu.upc.parkingzone.dtos;

//Desarrollo Ricardo

public class TpagoDTO {
    private int TipoPagoID;
    private String descripcionTpago;

    public int getTipoPagoID() {return TipoPagoID;}

    public void setTipoPagoID(int TipoPagoID) {
        this.TipoPagoID = TipoPagoID;
    }

    public String getDescripcionTpago() {return descripcionTpago;}

    public void setDescripcionTpago (String descripcionTpago) { this.descripcionTpago = descripcionTpago;}

}
