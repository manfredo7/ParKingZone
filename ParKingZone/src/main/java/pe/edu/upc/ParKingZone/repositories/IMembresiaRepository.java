package pe.edu.upc.ParKingZone.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.ParKingZone.entities.Membresia;

@Repository
public interface IMembresiaRepository extends JpaRepository<Membresia, Integer> {
}
