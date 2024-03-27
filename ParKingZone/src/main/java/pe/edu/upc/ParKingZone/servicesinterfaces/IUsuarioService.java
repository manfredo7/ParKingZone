package pe.edu.upc.ParKingZone.servicesinterfaces;

import pe.edu.upc.ParKingZone.entities.Usuario;

import java.util.List;

public interface IUsuarioService {

    public void insert(Usuario usuario);
    public List<Usuario> list();
}
