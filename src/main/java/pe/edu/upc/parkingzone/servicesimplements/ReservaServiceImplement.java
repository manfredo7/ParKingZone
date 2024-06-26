package pe.edu.upc.parkingzone.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.parkingzone.entities.Reserva;
import pe.edu.upc.parkingzone.repositories.IReservaRepository;
import pe.edu.upc.parkingzone.serviceinterfaces.IReservaService;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
@Service
public class ReservaServiceImplement implements IReservaService {
    @Autowired
    private IReservaRepository rR;

    @Override
    public void insert(Reserva reserva) {
        rR.save(reserva);
    }

    @Override
    public List<Reserva> list() {
        return rR.findAll();
    }

    @Override
    public void delete(int idreserva) {
rR.deleteById(idreserva);
    }

    @Override
    public Reserva listarId(int idreserva) {
        return rR.findById(idreserva).orElse(new Reserva());
    }

    @Override
    public int CountReservaPerDateRange(LocalDate startDate, LocalDate endDate) {
        return rR.CountReservaPerDateRange(startDate,endDate);
    }

    @Override
    public List<String[]> cantrxe() {
        return rR.cantrxe();
    }


}
