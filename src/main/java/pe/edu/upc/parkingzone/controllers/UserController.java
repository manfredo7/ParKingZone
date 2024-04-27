package pe.edu.upc.parkingzone.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.parkingzone.dtos.QuerysDTO.USERQ2DTO;
import pe.edu.upc.parkingzone.dtos.QuerysDTO.UserQ1DTO;
import pe.edu.upc.parkingzone.dtos.UserDTO;
import pe.edu.upc.parkingzone.entities.Users;
import pe.edu.upc.parkingzone.serviceinterfaces.IUserService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UserController {
    @Autowired
    private IUserService uS;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping
    public void registrar(@RequestBody UserDTO dto) {
        ModelMapper m = new ModelMapper();
        Users u = m.map(dto, Users.class);
        String encodedPassword = passwordEncoder.encode(u.getPassword());
        u.setPassword(encodedPassword);
        uS.insert(u);
    }

    @PutMapping
    public void modificar(@RequestBody UserDTO dto) {
        ModelMapper m = new ModelMapper();
        Users u = m.map(dto, Users.class);
        uS.insert(u);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id) {
        uS.delete(id);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('CONDUCTOR')")
    public UserDTO listarId(@PathVariable("id") Long id) {
        ModelMapper m = new ModelMapper();
        UserDTO dto = m.map(uS.listarId(id), UserDTO.class);
        return dto;
    }

    @GetMapping
    public List<UserDTO> listar() {
        return uS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UserDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/consulta01")
    public List<UserQ1DTO> consulta01() {
        List<String[]> filaLista = uS.umaxnreservas();
        List<UserQ1DTO> dtoLista = new ArrayList<>();

        for (String[] columna : filaLista) {
            UserQ1DTO dto = new UserQ1DTO();
            dto.setUsername(columna[0]);
            dto.setIdreserva(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }

        return dtoLista;
    }

    @GetMapping("/consulta02")
    public USERQ2DTO countUsersInDateRange(
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate startDate,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate endDate) {
        long userCount = uS.CountUsersPerDateRange(startDate,endDate);
        return new USERQ2DTO(userCount);
    }



}
