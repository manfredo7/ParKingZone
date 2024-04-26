package pe.edu.upc.parkingzone.dtos;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import pe.edu.upc.parkingzone.entities.Pago;
import pe.edu.upc.parkingzone.entities.Reserva;

public class ReservaPagoDTO {
    private int reservapagoID;


    private Reserva reserva;


    private Pago pago;

    public int getReservapagoID() {
        return reservapagoID;
    }

    public void setReservapagoID(int reservapagoID) {
        this.reservapagoID = reservapagoID;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }
}
