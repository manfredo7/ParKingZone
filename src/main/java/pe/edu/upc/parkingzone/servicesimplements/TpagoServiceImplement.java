package pe.edu.upc.parkingzone.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.parkingzone.entities.Tpago;
import pe.edu.upc.parkingzone.repositories.ITpagoRepository;
import pe.edu.upc.parkingzone.serviceinterfaces.ITpagoService;

import java.util.List;

@Service
public class TpagoServiceImplement implements ITpagoService {
    @Autowired
    private ITpagoRepository tpR;
    @Override
    public void insert(Tpago tpago) { tpR.save(tpago);}
    @Override
    public List<Tpago> list() { return tpR.findAll();}
    @Override
    public void delete(int id) {tpR.deleteById(id);}
    @Override
    public Tpago listId(int id) { return tpR.findById(id).orElse( new Tpago());}
}

