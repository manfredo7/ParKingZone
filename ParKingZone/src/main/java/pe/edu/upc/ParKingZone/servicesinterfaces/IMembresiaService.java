package pe.edu.upc.ParKingZone.servicesinterfaces;

import pe.edu.upc.ParKingZone.entities.Membresia;

import java.util.List;

public interface IMembresiaService {

    public void insert(Membresia membresia);
    public List<Membresia> list();
}
