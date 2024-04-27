package pe.edu.upc.parkingzone.entities;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "Reserva")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReserva;
    @Column(name="fechaReserva", nullable = false)
    private LocalDate fechaReserva;
    @Column(name="horaInicioReserva", nullable = false)
    private LocalTime horaInicioReserva;
    @Column(name="horaFinalReserva", nullable = false)
    private LocalTime horaFinalReserva;
    @Column(name = "estadoReserva", length =50, nullable = false)
    private String estadoReserva;

    @ManyToOne
    @JoinColumn(name="Estacionamientoid")
    private Estacionamiento estacionamiento;
    @ManyToOne
    @JoinColumn(name="Usuarioid")
    private Users usuario;


    public Reserva() {
    }

    public Reserva(int idReserva, LocalDate fechaReserva, LocalTime horaInicioReserva, LocalTime horaFinalReserva, String estadoReserva, Estacionamiento estacionamiento, Users usuario) {
        this.idReserva = idReserva;
        this.fechaReserva = fechaReserva;
        this.horaInicioReserva = horaInicioReserva;
        this.horaFinalReserva = horaFinalReserva;
        this.estadoReserva = estadoReserva;
        this.estacionamiento = estacionamiento;
        this.usuario = usuario;
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

    public LocalTime getHoraInicioReserva() {
        return horaInicioReserva;
    }

    public void setHoraInicioReserva(LocalTime horaInicioReserva) {
        this.horaInicioReserva = horaInicioReserva;
    }

    public LocalTime getHoraFinalReserva() {
        return horaFinalReserva;
    }

    public void setHoraFinalReserva(LocalTime horaFinalReserva) {
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

    public Users getUsuario() {
        return usuario;
    }

    public void setUsuario(Users usuario) {
        this.usuario = usuario;
    }
}
