package pe.edu.upc.parkingzone.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.parkingzone.entities.Users;
import pe.edu.upc.parkingzone.repositories.IUserRepository;
import pe.edu.upc.parkingzone.serviceinterfaces.IUserService;


import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImplement implements IUserService {
    @Autowired
    private IUserRepository uR;

    @Override
    public void insert(Users usuario) {
        uR.save(usuario);
    }

    @Override
    public List<Users> list() {
        return uR.findAll();
    }

    @Override
    public void delete(Long idUsuario) {
        uR.deleteById(idUsuario);
    }

    @Override
    public Users listarId(Long idUsuario) {
        return uR.findById(idUsuario).orElse(new Users());
    }

    @Override
    public List<String[]> umaxnreservas() {
        return uR.umaxnreservas();
    }

    @Override
    public long CountUsersPerDateRange(LocalDate startDate, LocalDate endDate) {
        return uR.CountUsersPerDateRange(startDate,endDate);
    }


}
