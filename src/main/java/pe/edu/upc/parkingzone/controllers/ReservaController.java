package pe.edu.upc.parkingzone.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.parkingzone.dtos.QuerysDTO.ReservaQ1DTO;
import pe.edu.upc.parkingzone.dtos.QuerysDTO.ReservaQ2DTO;
import pe.edu.upc.parkingzone.dtos.QuerysDTO.UserQ1DTO;
import pe.edu.upc.parkingzone.dtos.ReservaDTO;
import pe.edu.upc.parkingzone.dtos.TestacionamientoDTO;
import pe.edu.upc.parkingzone.dtos.UserDTO;
import pe.edu.upc.parkingzone.entities.Reserva;
import pe.edu.upc.parkingzone.entities.Testacionamiento;
import pe.edu.upc.parkingzone.entities.Users;
import pe.edu.upc.parkingzone.serviceinterfaces.IReservaService;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/reservas")
public class ReservaController {

    @Autowired
    private IReservaService rS;
    @PostMapping
    public void insertar(@RequestBody ReservaDTO reservaDTO){
        ModelMapper m=new ModelMapper();
        Reserva te =m.map(reservaDTO,Reserva.class);
        rS.insert(te);
    }
    //v
    @GetMapping
    public List<ReservaDTO> listar(){
        return rS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,ReservaDTO.class);
        }).collect(Collectors.toList());
    }
    //eli
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        rS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody ReservaDTO dto) {
        ModelMapper m = new ModelMapper();
        Reserva u = m.map(dto, Reserva.class);
        rS.insert(u);
    }

    @GetMapping("/{id}")
    public ReservaDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        ReservaDTO dto = m.map(rS.listarId(id), ReservaDTO.class);
        return dto;
    }
    @GetMapping("/cantreserva")
    public ReservaQ1DTO countReservaInDateRange(
            @RequestParam @DateTimeFormat(pattern = "YYYY-MM-dd") LocalDate startDate,
            @RequestParam @DateTimeFormat(pattern = "YYYY-MM-dd") LocalDate endDate){
        int resCount = rS.CountReservaPerDateRange(startDate, endDate);
        return new ReservaQ1DTO(resCount);
    }
    @GetMapping("/cantrxe")
    public List<ReservaQ2DTO> cantrxe(){
        List<String[]> filaLista = rS.cantrxe();
        List<ReservaQ2DTO> dtoLista = new ArrayList<>();

        for (String[] columna : filaLista){
            ReservaQ2DTO dto = new ReservaQ2DTO();
            dto.setNombreEstacionamiento(columna[0]);
            dto.setNreservas(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}
