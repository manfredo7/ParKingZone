package pe.edu.upc.parkingzone.servicesinterfaces;


import pe.edu.upc.parkingzone.entities.Membresia;


import java.util.List;

public interface IMembresiaService {

    public void insert(Membresia membresia);
    public List<Membresia> list();


}
