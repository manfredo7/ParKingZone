package pe.edu.upc.parkingzone.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.parkingzone.entities.Reserva;

@Repository
public interface IReservaRepository extends JpaRepository<Reserva, Integer> {
}
