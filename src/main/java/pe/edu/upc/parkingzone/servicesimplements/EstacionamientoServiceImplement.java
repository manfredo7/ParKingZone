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
    private IEstacionamientoRepository eR;

    @Override
    public void insert(Estacionamiento estacionamiento) {
eR.save(estacionamiento);
    }

    @Override
    public List<Estacionamiento> list() {
        return eR.findAll();
    }

    @Override
    public void delete(int id) {
eR.deleteById(id);
    }

    @Override
    public Estacionamiento listId(int id) {
        return eR.findById(id).orElse(new Estacionamiento());
    }

    @Override
    public List<String[]> emaxhorasreserva() {
        return eR.emaxhorasreserva();
    }

    @Override
    public List<String[]> montoxe() {
        return eR.montoxe();
    }
}
