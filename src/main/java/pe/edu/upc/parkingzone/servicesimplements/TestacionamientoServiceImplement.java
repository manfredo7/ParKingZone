package pe.edu.upc.parkingzone.servicesimplements;
//BRI

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.parkingzone.entities.Testacionamiento;
import pe.edu.upc.parkingzone.repositories.ITestacionamientoRepository;
import pe.edu.upc.parkingzone.serviceinterfaces.ITestacionamientoService;

import java.util.List;

@Service
public class TestacionamientoServiceImplement implements ITestacionamientoService {
    @Autowired
    private ITestacionamientoRepository teR;

    @Override
    public void insert(Testacionamiento testacionamiento){ teR.save(testacionamiento);}

    @Override
    public List<Testacionamiento> list() {return teR.findAll();}

    @Override
    public void delete(int id) {teR.deleteById(id);}

    @Override
    public List<Testacionamiento> findByDescripcionTestacionamiento(String name) {
        return teR.findByDescripcionTestacionamiento(name);
    }



}
