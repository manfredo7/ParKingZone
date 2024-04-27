package pe.edu.upc.parkingzone.entities;
//Desarrollo Ricardo

import jakarta.persistence.*;
import java.time.LocalDate;
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
    @Column(name = "fechaPago", nullable = false)
    private LocalDate fechaPago;
    @Column(name = "horaPago", nullable = false)
    private LocalDateTime horaPago;

    @ManyToOne
    @JoinColumn(name = "Tpagoid")
    private Tpago tpago;

    public Pago() {
    }

    public Pago(int idPago, String documentoPago, int montoPago, LocalDate fechaPago, LocalDateTime horaPago, Tpago tpago) {
        this.idPago = idPago;
        this.documentoPago = documentoPago;
        this.montoPago = montoPago;
        this.fechaPago = fechaPago;
        this.horaPago = horaPago;
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
