package pe.edu.upc.parkingzone.serviceinterfaces;

import pe.edu.upc.parkingzone.entities.Comentarios;
import pe.edu.upc.parkingzone.entities.ReservaPago;

import java.util.List;

public interface IComentarioService {
    public void insert(Comentarios comentarios);

    public List<Comentarios> list();

    public void delete(int idcomentarios);

    public Comentarios listarId(int idcomentarios);
}
