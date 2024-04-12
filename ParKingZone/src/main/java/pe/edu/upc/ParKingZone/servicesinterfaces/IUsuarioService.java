package pe.edu.upc.parkingzone.servicesinterfaces;

import pe.edu.upc.parkingzone.entities.Usuario;

import java.util.List;

public interface IUsuarioService {

    public void insert(Usuario usuario);
    public List<Usuario> list();
}
