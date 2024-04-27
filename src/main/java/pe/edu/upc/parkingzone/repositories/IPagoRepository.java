package pe.edu.upc.parkingzone.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.parkingzone.entities.Pago;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IPagoRepository extends JpaRepository<Pago, Integer> {
    public List<Pago> findByIdPago(int pago);

    //Visualizar tipo de pago mas utilizado
    @Query(value = "SELECT p.tpagoid, COUNT(*) AS cantidad\n" +
            "FROM pago p\n" +
            "GROUP BY tpagoid\n" +
            "ORDER BY COUNT(*) DESC\n" +
            "LIMIT 1", nativeQuery = true)
    List<Object[]> getTotalPago();

    @Query("SELECT SUM(p.montoPago) FROM Pago p WHERE p.fechaPago BETWEEN :startDate AND :endDate")
    long getTotalRecaudado(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);

}

