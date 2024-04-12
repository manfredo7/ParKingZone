package pe.edu.upc.parkingzone.serviceinterfaces;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pe.edu.upc.parkingzone.entities.Membresia;
import pe.edu.upc.parkingzone.entities.Rol;

import java.util.List;


public interface IRolService {
    public void insert(Rol rol);
    public List<Rol> list();
    public void delete(int id);
    public Rol listId(int id);
}
