package pe.edu.upc.parkingzone.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import pe.edu.upc.parkingzone.entities.Tpago;

import java.time.LocalDateTime;

public class PagoDTO {
    private int idPago;
    private String documentoPago;
    private int montoPago;
    private LocalDateTime fechahoraPago;
    private Tpago tpago;


    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public String getDocumentoPago() {
        return documentoPago;
    }

    public void setDocumentoPago(String documentoPago) {
        this.documentoPago = documentoPago;
    }

    public int getMontoPago() {
        return montoPago;
    }

    public void setMontoPago(int montoPago) {
        this.montoPago = montoPago;
    }

    public LocalDateTime getFechahoraPago() {
        return fechahoraPago;
    }

    public void setFechahoraPago(LocalDateTime fechahoraPago) {
        this.fechahoraPago = fechahoraPago;
    }

    public Tpago getTpago() {
        return tpago;
    }

    public void setTpago(Tpago tpago) {
        this.tpago = tpago;
    }
}
