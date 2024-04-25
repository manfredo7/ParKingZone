package pe.edu.upc.parkingzone.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import pe.edu.upc.parkingzone.entities.Tpago;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PagoDTO {
    private int idPago;
    private String documentoPago;
    private int montoPago;
    private LocalDate fechaPago;
    private LocalDateTime horaPago;
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

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public LocalDateTime getHoraPago() {
        return horaPago;
    }

    public void setHoraPago(LocalDateTime horaPago) {
        this.horaPago = horaPago;
    }

    public Tpago getTpago() {
        return tpago;
    }

    public void setTpago(Tpago tpago) {
        this.tpago = tpago;
    }
}
