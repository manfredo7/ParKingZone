package pe.edu.upc.parkingzone.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Pago")
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPago;
    @Column(name = "documentoPago", length = 150, nullable = false)
    private String documentoPago;
    @Column(name = "montoPago", nullable = false)
    private int montoPago;
    @Column(name = "fechahoraPago", nullable = false)
    private LocalDateTime fechahoraPago;
    @ManyToOne
    @JoinColumn(name = "Tpagoid")
    private Tpago tpago;

    public Pago() {
    }

    public Pago(int idPago, String documentoPago, int montoPago, LocalDateTime fechahoraPago, Tpago tpago) {
        this.idPago = idPago;
        this.documentoPago = documentoPago;
        this.montoPago = montoPago;
        this.fechahoraPago = fechahoraPago;
        this.tpago = tpago;
    }

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

