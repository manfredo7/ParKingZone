package pe.edu.upc.parkingzone.serviceinterfaces;
//Ricardo

import pe.edu.upc.parkingzone.entities.Tpago;

import java.util.List;

public interface ITpagoService {
    public void insert (Tpago tpago);
    public List<Tpago> list();
    public void delete(int id);
    public Tpago listId (int id);
}
