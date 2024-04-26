package pe.edu.upc.parkingzone.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.parkingzone.entities.Comentarios;
import pe.edu.upc.parkingzone.repositories.IComentarioRepository;
import pe.edu.upc.parkingzone.serviceinterfaces.IComentarioService;

import java.util.List;

@Service
public class ComentarioServiceImplement implements IComentarioService {
    @Autowired
    private IComentarioRepository cR;

    @Override
    public void insert(Comentarios comentarios) {
        cR.save(comentarios);
    }

    @Override
    public List<Comentarios> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int idcomentarios) {
cR.deleteById(idcomentarios);
    }

    @Override
    public Comentarios listarId(int idcomentarios) {
        return cR.findById(idcomentarios).orElse(new Comentarios());
    }
}
