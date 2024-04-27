package pe.edu.upc.parkingzone.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.parkingzone.entities.Reserva;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Repository
public interface IReservaRepository extends JpaRepository<Reserva, Integer> {

    @Query("select count(r) from Reserva r where r.fechaReserva between :startDate and :endDate")
    int CountReservaPerDateRange(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);

    @Query(value = "SELECT e.nombre_estacionamiento AS estacionamiento, COUNT(*) AS nreservas " +
            "FROM estacionamiento e " +
            "INNER JOIN reserva r ON e.id_estacionamiento = r.estacionamientoid " +
            "GROUP BY e.nombre_estacionamiento " +
            "ORDER BY nreservas DESC ", nativeQuery = true)
    List<String[]> cantrxe();
}
