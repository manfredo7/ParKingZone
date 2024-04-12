package pe.edu.upc.parkingzone.serviceinterfaces;

import pe.edu.upc.parkingzone.entities.Membresia;


import java.util.List;

public interface IMembresiaService {
    public void insert(Membresia membresia);
    public List<Membresia> list();
    public void delete(int id);
    public Membresia listId(int id);
    public List<Membresia> findByFechaInicioMembresia(String name);
}

