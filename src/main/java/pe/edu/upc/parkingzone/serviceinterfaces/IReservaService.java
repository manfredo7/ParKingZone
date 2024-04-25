package pe.edu.upc.parkingzone.serviceinterfaces;

import pe.edu.upc.parkingzone.entities.Reserva;
import pe.edu.upc.parkingzone.entities.Users;

import java.util.List;

public interface IReservaService {

    public void insert(Reserva reserva);

    public List<Reserva> list();

    public void delete(int idreserva);

    public Reserva listarId(int idreserva);
}
