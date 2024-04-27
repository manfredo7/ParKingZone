package pe.edu.upc.parkingzone.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.parkingzone.entities.ReservaPago;
import pe.edu.upc.parkingzone.serviceinterfaces.IReservaPagoService;
import pe.edu.upc.parkingzone.repositories.iReservaPagoRepository;
import java.util.List;

@Service
public class ReservaPagoServiceImplement implements IReservaPagoService {
@Autowired
   private iReservaPagoRepository rR;

    @Override
    public void insert(ReservaPago reservaPago) {
rR.save(reservaPago);
    }

    @Override
    public List<ReservaPago> list() {
        return rR.findAll();
    }

    @Override
    public void delete(int idReservapago) {
rR.deleteById(idReservapago);
    }

    @Override
    public ReservaPago listarId(int idReservapago) {
        return rR.findById(idReservapago).orElse(new ReservaPago());
    }
}
