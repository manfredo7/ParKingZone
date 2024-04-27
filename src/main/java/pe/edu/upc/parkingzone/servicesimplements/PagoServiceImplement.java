package pe.edu.upc.parkingzone.servicesimplements;
//Desarrollo Ricardo

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.parkingzone.entities.Pago;
import pe.edu.upc.parkingzone.repositories.IPagoRepository;
import pe.edu.upc.parkingzone.serviceinterfaces.IPagoService;

import java.time.LocalDate;
import java.util.List;

@Service
public class PagoServiceImplement implements IPagoService {

    @Autowired
    private IPagoRepository pR;
    @Override
    public void insert(Pago pago) { pR.save(pago);}
    @Override
    public List<Pago> list() { return pR.findAll();}
    @Override
    public void delete(int id) {pR.deleteById(id);}
    @Override
    public Pago listId(int id) { return pR.findById(id).orElse( new Pago());}
    @Override
    public List<Pago> findByIdPago(int pago) {return pR.findByIdPago(pago); }
    @Override
    public List<Object[]> getTotalPago() {return pR.getTotalPago();}
    @Override
    public long getTotalRecaudado(LocalDate startDate, LocalDate endDate) {return pR.getTotalRecaudado(startDate, endDate);}
}
