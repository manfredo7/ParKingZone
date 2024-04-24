package pe.edu.upc.parkingzone.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.parkingzone.entities.Users;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;


@Repository
public interface IUserRepository extends JpaRepository<Users, Long> {
    public Users findByUsername(String username);

    //BUSCAR POR NOMBRE
    @Query("select count(u.username) from Users u where u.username =:username")
    public int buscarUsername(@Param("username") String nombre);


    //INSERTAR ROLES
    @Transactional
    @Modifying
    @Query(value = "insert into roles (rol, user_id) VALUES (:rol, :user_id)", nativeQuery = true)
    public void insRol(@Param("rol") String authority, @Param("user_id") Long user_id);


    @Query("SELECT u.username,COUNT(r.idReserva) AS nreservas FROM Users u INNER JOIN Reserva r ON u.id=r.usuario.id GROUP BY u.username ORDER BY nreservas DESC LIMIT 1")
    List<String[]> umaxnreservas();


    @Query("select count(u) from Users u where u.Fregistro between :startDate and :endDate")
    long CountUsersPerDateRange(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);

}