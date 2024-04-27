package pe.edu.upc.parkingzone.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.parkingzone.entities.Membresia;
import pe.edu.upc.parkingzone.repositories.IMembresiaRepository;
import pe.edu.upc.parkingzone.serviceinterfaces.IMembresiaService;

import java.util.List;
@Service
public class MembresiaServiceImplement implements IMembresiaService{
    @Autowired
    private IMembresiaRepository mR;
    @Override
    public void insert(Membresia membresia){
        mR.save(membresia);
    }
    @Override
    public List<Membresia> list(){ return mR.findAll();}

    @Override
    public void delete(int id){ mR.deleteById(id);}
    @Override
    public Membresia listId(int id){
        return mR.findById(id).orElse(new Membresia());
    }



}
