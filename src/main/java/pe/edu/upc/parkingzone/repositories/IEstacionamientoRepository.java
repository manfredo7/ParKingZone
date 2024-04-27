package pe.edu.upc.parkingzone.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.parkingzone.entities.Estacionamiento;

import java.util.List;

@Repository
public interface IEstacionamientoRepository extends JpaRepository<Estacionamiento,Integer> {

    @Query(value = "SELECT e.nombre_estacionamiento, ROUND(SUM(EXTRACT(EPOCH FROM (r.hora_final_reserva - r.hora_inicio_reserva)) / 3600), 1) AS horas_reservadas " +
            "FROM reserva r " +
            "INNER JOIN estacionamiento e ON r.estacionamientoid = e.id_estacionamiento " +
            "GROUP BY e.id_estacionamiento " +
            "ORDER BY horas_reservadas DESC " +
            "LIMIT 1", nativeQuery = true)
    List<String[]> emaxhorasreserva();

    @Query(value = "SELECT e.nombre_estacionamiento AS estacionamiento, " +
            "    SUM(p.monto_pago) AS montoTotal " +
            "FROM estacionamiento e " +
            "INNER JOIN reserva r ON e.id_estacionamiento = r.estacionamientoid " +
            "INNER JOIN reservapagos rp ON r.id_reserva = rp.idreserva " +
            "INNER JOIN pago p ON rp.idpago = p.id_pago " +
            "GROUP BY e.nombre_estacionamiento " +
            "ORDER BY montoTotal DESC", nativeQuery = true)
    List<String[]> montoxe();
}
