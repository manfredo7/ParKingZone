package pe.edu.upc.ParKingZone.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.ParKingZone.entities.Membresia;
import pe.edu.upc.ParKingZone.repositories.IMembresiaRepository;
import pe.edu.upc.ParKingZone.servicesinterfaces.IMembresiaService;

import java.util.List;

@Service
public class MembresiaServiceImplement implements IMembresiaService {

    @Autowired
    private IMembresiaRepository mR;

    @Override
    public void insert(Membresia membresia) {
        mR.save(membresia);
    }

    @Override
    public List<Membresia> list() {
        return mR.findAll();
    }
}
