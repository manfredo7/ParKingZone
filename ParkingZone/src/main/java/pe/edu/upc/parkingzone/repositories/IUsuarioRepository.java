package pe.edu.upc.parkingzone.repositories;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.parkingzone.entities.Membresia;
import pe.edu.upc.parkingzone.entities.Usuario;

import java.time.LocalDate;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario,Integer> {

}
