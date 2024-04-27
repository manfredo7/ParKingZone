package pe.edu.upc.parkingzone.serviceinterfaces;

import pe.edu.upc.parkingzone.entities.Estacionamiento;

import java.util.List;

public interface IEstacionamientoService {
    public void insert(Estacionamiento estacionamiento);
    public List<Estacionamiento> list();
    public void delete(int id);
    public Estacionamiento listId(int id);
    List<String[]> emaxhorasreserva();
    List<String[]> montoxe();
}
