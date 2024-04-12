package pe.edu.upc.parkingzone.repositories;
//BRI
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.parkingzone.entities.Testacionamiento;

import java.util.List;

@Repository
public interface ITestacionamientoRepository extends JpaRepository<Testacionamiento, Integer> {
    public List<Testacionamiento> findByDescripcionTestacionamiento(String name);
}
