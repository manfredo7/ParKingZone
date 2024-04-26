package pe.edu.upc.parkingzone.serviceinterfaces;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.parkingzone.entities.Reserva;
import pe.edu.upc.parkingzone.entities.Users;

import java.time.LocalTime;
import java.util.List;

public interface IReservaService {

    public void insert(Reserva reserva);

    public List<Reserva> list();

    public void delete(int idreserva);

    public Reserva listarId(int idreserva);

    List<Object[]> horasReserva();


}
