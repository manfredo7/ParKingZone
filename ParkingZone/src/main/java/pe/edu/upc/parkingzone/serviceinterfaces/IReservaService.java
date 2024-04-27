package pe.edu.upc.parkingzone.serviceinterfaces;

import pe.edu.upc.parkingzone.entities.Reserva;

import java.time.LocalDate;
import java.util.List;

public interface IReservaService {

    public void insert(Reserva reserva);

    public List<Reserva> list();

    public void delete(int idReserva);

    public Reserva listarId(int idReserva);

    int CountReservaPerDateRange(LocalDate startDate, LocalDate endDate);
    List<String[]> cantrxe();
}
