package pe.edu.upc.parkingzone.serviceinterfaces;
//Ricardo

import pe.edu.upc.parkingzone.entities.Pago;
import java.time.LocalDate;
import java.util.List;

public interface IPagoService {
    public void insert (Pago pago);
    public List<Pago> list();
    public void delete(int id);
    public Pago listId (int id);
    public List<Pago> findByIdPago (int pago);
    List<Object[]> getTotalPago();
    long getTotalRecaudado( LocalDate startDate, LocalDate endDate);

}
