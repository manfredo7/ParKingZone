package pe.edu.upc.parkingzone.serviceinterfaces;

import pe.edu.upc.parkingzone.entities.ReservaPago;
import pe.edu.upc.parkingzone.entities.Users;

import java.util.List;

public interface IReservaPagoService {
    public void insert(ReservaPago reservaPago);

    public List<ReservaPago> list();

    public void delete(int idReservapago);

    public ReservaPago listarId(int idReservapago);
}
