package pe.edu.upc.parkingzone.dtos;

import pe.edu.upc.parkingzone.entities.Estacionamiento;
import pe.edu.upc.parkingzone.entities.Users;

import java.time.LocalDate;

public class ReservaDTO {
    private LocalDate fechaReserva;
    private LocalDate horaInicioReserva;
    private LocalDate horaFinalReserva;
    private String estadoReserva;
    private Estacionamiento estacionamiento;
    private Users usuario;

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

    public Users getUsuario() {
        return usuario;
    }

    public void setUsuario(Users usuario) {
        this.usuario = usuario;
    }
}
