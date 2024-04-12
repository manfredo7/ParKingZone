package pe.edu.upc.parkingzone.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.parkingzone.entities.Rol;

public interface IRolRepository extends JpaRepository<Rol,Integer> {
}
