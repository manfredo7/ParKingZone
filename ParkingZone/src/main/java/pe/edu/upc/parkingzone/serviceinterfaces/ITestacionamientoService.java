package pe.edu.upc.parkingzone.serviceinterfaces;
//BRI

import pe.edu.upc.parkingzone.entities.Testacionamiento;

import java.util.List;

public interface ITestacionamientoService {
    public void insert(Testacionamiento testacionamiento);
    public List<Testacionamiento> list();
    public void delete(int id);
    public Testacionamiento listId(int id);
    public List<Testacionamiento> findByDescripcionTestacionamiento(String name);
}
