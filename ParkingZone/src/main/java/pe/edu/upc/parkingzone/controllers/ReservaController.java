package pe.edu.upc.parkingzone.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import pe.edu.upc.parkingzone.dtos.QuerysDTO.ReservaQ1DTO;
import pe.edu.upc.parkingzone.dtos.QuerysDTO.ReservaQ2DTO;
import pe.edu.upc.parkingzone.dtos.ReservaDTO;

import pe.edu.upc.parkingzone.entities.Reserva;
import pe.edu.upc.parkingzone.serviceinterfaces.IReservaService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/reserva")
public class ReservaController {
    @Autowired
    private IReservaService reS;

    //Regitrar
    @PostMapping
    public void insertar(@RequestBody ReservaDTO reservaDTO){
        ModelMapper m=new ModelMapper();
        Reserva r =m.map(reservaDTO,Reserva.class);
        reS.insert(r);
    }
    //Visualizar
    @GetMapping
    public List<ReservaDTO> listar(){
        return reS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,ReservaDTO.class);
        }).collect(Collectors.toList());
    }
    //Eliminar
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        reS.delete(id);
    }

    //buscar por id
    @GetMapping("/{id}")
    public ReservaDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        ReservaDTO dto = m.map(reS.listarId(id), ReservaDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody ReservaDTO resdto) {
        ModelMapper m = new ModelMapper();
        Reserva r = m.map(resdto, Reserva.class);
        reS.insert(r);
    }

    @GetMapping("/cantreserva")
    public ReservaQ1DTO countReservaInDateRange(
            @RequestParam @DateTimeFormat(pattern = "YYYY-MM-dd") LocalDate startDate,
            @RequestParam @DateTimeFormat(pattern = "YYYY-MM-dd") LocalDate endDate){
        int resCount = reS.CountReservaPerDateRange(startDate, endDate);
        return new ReservaQ1DTO(resCount);
    }
    @GetMapping("/cantrxe")
    public List<ReservaQ2DTO> cantrxe(){
        List<String[]> filaLista = reS.cantrxe();
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
