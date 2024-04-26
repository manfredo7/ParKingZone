package pe.edu.upc.parkingzone.repositories;

<<<<<<< Updated upstream
public interface IReservaRepository {
=======
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.parkingzone.entities.Reserva;

import java.time.LocalTime;
import java.util.List;

@Repository
public interface IReservaRepository extends JpaRepository<Reserva, Integer> {

    @Query(value = "SELECT e.id_estacionamiento, e.nombre_estacionamiento, ROUND(SUM(EXTRACT(EPOCH FROM (r.hora_final_reserva - r.hora_inicio_reserva)) / 3600), 1) AS horas_reservadas " +
            "FROM reserva r " +
            "INNER JOIN estacionamiento e ON r.estacionamientoid = e.id_estacionamiento " +
            "GROUP BY e.id_estacionamiento " +
            "ORDER BY horas_reservadas DESC " +
            "LIMIT 1", nativeQuery = true)
   List<Object[]> horasReserva();
>>>>>>> Stashed changes
}
