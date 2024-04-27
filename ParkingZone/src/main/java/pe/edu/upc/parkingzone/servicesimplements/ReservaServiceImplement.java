package pe.edu.upc.parkingzone.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.parkingzone.entities.Reserva;
import pe.edu.upc.parkingzone.repositories.IReservaRepository;
import pe.edu.upc.parkingzone.serviceinterfaces.IReservaService;

import java.time.LocalDate;
import java.util.List;

@Service
public class ReservaServiceImplement implements IReservaService {
    @Autowired
    private IReservaRepository reR;
    @Override
    public void insert(Reserva reserva) {
        reR.save(reserva);
    }

    @Override
    public List<Reserva> list() {
        return reR.findAll();
    }

    @Override
    public void delete(int idReserva) {
        reR.deleteById(idReserva);
    }

    @Override
    public Reserva listarId(int idReserva) {
        return  reR.findById(idReserva).orElse(new Reserva());
    }

    @Override
    public int CountReservaPerDateRange(LocalDate startDate, LocalDate endDate) {
        return reR.CountReservaPerDateRange(startDate, endDate);
    }

    @Override
    public List<String[]> cantrxe() {
        return reR.cantrxe();
    }


}
