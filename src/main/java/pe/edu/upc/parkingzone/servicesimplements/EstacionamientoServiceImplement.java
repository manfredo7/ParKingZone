package pe.edu.upc.parkingzone.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.parkingzone.entities.Estacionamiento;
import pe.edu.upc.parkingzone.repositories.IEstacionamientoRepository;
import pe.edu.upc.parkingzone.serviceinterfaces.IEstacionamientoService;

import java.util.List;
@Service
public class EstacionamientoServiceImplement implements IEstacionamientoService {
    @Autowired
    private IEstacionamientoRepository esR;

    @Override
    public void insert(Estacionamiento estacionamiento) {
        esR.save(estacionamiento);
    }

    @Override
    public List<Estacionamiento> list() {
        return esR.findAll();
    }

    @Override
    public void delete(int id) {
        esR.deleteById(id);
    }

    @Override
    public Estacionamiento listId(int id) {
        return  esR.findById(id).orElse(new Estacionamiento());
    }

    @Override
    public List<String[]> emaxhorasreserva() {
        return esR.emaxhorasreserva();
    }

    @Override
    public List<String[]> montoxe() {
        return esR.montoxe();
    }
}
