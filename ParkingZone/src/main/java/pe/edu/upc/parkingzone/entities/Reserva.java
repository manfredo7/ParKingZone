package pe.edu.upc.parkingzone.entities;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Reserva")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReserva;
    @Column(name="fechaReserva", nullable = false)
    private LocalDate fechaReserva;
    @Column(name="horaInicioReserva", nullable = false)
    private LocalDate horaInicioReserva;
    @Column(name="horaFinalReserva", nullable = false)
    private LocalDate horaFinalReserva;
    @Column(name = "estadoReserva", length =50, nullable = false)
    private String estadoReserva;

    @ManyToOne
    @JoinColumn(name="Estacionamientoid")
    private Estacionamiento estacionamiento;

    public Reserva() {
    }

    public Reserva(int idReserva, LocalDate fechaReserva, LocalDate horaInicioReserva, LocalDate horaFinalReserva, String estadoReserva, Estacionamiento estacionamiento) {
        this.idReserva = idReserva;
        this.fechaReserva = fechaReserva;
        this.horaInicioReserva = horaInicioReserva;
        this.horaFinalReserva = horaFinalReserva;
        this.estadoReserva = estadoReserva;
        this.estacionamiento = estacionamiento;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public LocalDate getHoraInicioReserva() {
        return horaInicioReserva;
    }

    public void setHoraInicioReserva(LocalDate horaInicioReserva) {
        this.horaInicioReserva = horaInicioReserva;
    }

    public LocalDate getHoraFinalReserva() {
        return horaFinalReserva;
    }

    public void setHoraFinalReserva(LocalDate horaFinalReserva) {
        this.horaFinalReserva = horaFinalReserva;
    }

    public String getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(String estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public Estacionamiento getEstacionamiento() {
        return estacionamiento;
    }

    public void setEstacionamiento(Estacionamiento estacionamiento) {
        this.estacionamiento = estacionamiento;
    }
}
