package pe.edu.upc.parkingzone.serviceinterfaces;

import pe.edu.upc.parkingzone.entities.Usuario;

import java.util.List;

public interface IUsuarioService {

    public void insert(Usuario usuario);
    public List<Usuario> list();
}
