package pe.edu.upc.parkingzone.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.parkingzone.entities.ReservaPago;

@Repository
public interface iReservaPagoRepository extends JpaRepository<ReservaPago,Integer> {
}
