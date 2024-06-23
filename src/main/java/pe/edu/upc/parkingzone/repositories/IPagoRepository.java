package pe.edu.upc.parkingzone.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.parkingzone.entities.Pago;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface IPagoRepository extends JpaRepository<Pago,Integer> {
    public List<Pago> findByIdPago(int pago);

    //Visualizar tipo de pago mas utilizado
    @Query(value = "SELECT p.tpagoid, COUNT(*) AS cantidad, t.descripcion_tpago\n" +
            "FROM   pago p INNER JOIN  tpago t ON p.tpagoid = t.tipo_pagoid \n" +
            "GROUP BY  p.tpagoid, t.descripcion_tpago\n" +
            "ORDER BY cantidad DESC;", nativeQuery = true)
    List<Object[]> getTotalPago();

    @Query("SELECT SUM(p.montoPago) FROM Pago p WHERE p.fechahoraPago BETWEEN :startDate AND :endDate")
    long getTotalRecaudado(@Param("startDate") LocalDateTime startDate, @Param("endDate") LocalDateTime endDate);
}
