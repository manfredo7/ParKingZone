package pe.edu.upc.parkingzone.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Reservapagos")
public class ReservaPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reservapagoID;

    @JoinColumn(name = "IDreserva")
    @ManyToOne
    private Reserva reserva;

    @JoinColumn(name = "IDpago")
    @ManyToOne
    private Pago pago;

    public ReservaPago() {
    }

    public ReservaPago(int reservapagoID, Reserva reserva, Pago pago) {
        this.reservapagoID = reservapagoID;
        this.reserva = reserva;
        this.pago = pago;
    }

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
