package pe.edu.upc.parkingzone.serviceinterfaces;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.parkingzone.entities.Reserva;
import pe.edu.upc.parkingzone.entities.Users;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface IReservaService {

    public void insert(Reserva reserva);

    public List<Reserva> list();

    public void delete(int idreserva);

    public Reserva listarId(int idreserva);

    int CountReservaPerDateRange(LocalDate startDate, LocalDate endDate);

    List<String[]> cantrxe();


}
