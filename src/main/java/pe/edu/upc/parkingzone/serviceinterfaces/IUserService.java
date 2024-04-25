package pe.edu.upc.parkingzone.serviceinterfaces;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.parkingzone.entities.Users;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface IUserService {
    public void insert(Users usuario);

    public List<Users> list();

    public void delete(Long idUsuario);

    public Users listarId(Long idUsuario);

    List<String[]> umaxnreservas();

    long CountUsersPerDateRange(LocalDate startDate,LocalDate endDate);

}
