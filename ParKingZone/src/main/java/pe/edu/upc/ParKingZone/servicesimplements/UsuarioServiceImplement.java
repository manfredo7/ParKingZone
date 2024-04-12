package pe.edu.upc.parkingzone.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.parkingzone.entities.Usuario;
import pe.edu.upc.parkingzone.repositories.IUsuarioRepository;
import pe.edu.upc.parkingzone.servicesinterfaces.IUsuarioService;

import java.util.List;

@Service
public class UsuarioServiceImplement implements IUsuarioService {

    @Autowired
private IUsuarioRepository uR;

    @Override
    public void insert(Usuario usuario) {
        uR.save(usuario);
    }

    @Override
    public List<Usuario> list() {
        return uR.findAll();
    }
}
