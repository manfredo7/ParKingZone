package pe.edu.upc.parkingzone.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.parkingzone.dtos.EstacionamientoDTO;
import pe.edu.upc.parkingzone.dtos.QuerysDTO.EstacionamientoQ1DTO;
import pe.edu.upc.parkingzone.dtos.QuerysDTO.EstacionamientoQ2DTO;
import pe.edu.upc.parkingzone.entities.Estacionamiento;
import pe.edu.upc.parkingzone.serviceinterfaces.IEstacionamientoService;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/estacionamiento")
public class EstacionamientoController {
    @Autowired
    private IEstacionamientoService esS;

    @PostMapping
    public void insertar(@RequestBody EstacionamientoDTO estacionamientoDTO){
        ModelMapper m=new ModelMapper();
        Estacionamiento es =m.map(estacionamientoDTO, Estacionamiento.class);
        esS.insert(es);
    }

    @PutMapping
    public void modificar(@RequestBody EstacionamientoDTO estacionamientoDTO) {
        ModelMapper m = new ModelMapper();
        Estacionamiento es = m.map(estacionamientoDTO, Estacionamiento.class);
        esS.insert(es);
    }

    //v
    @GetMapping
    public List<EstacionamientoDTO> listar(){
        return esS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,EstacionamientoDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public EstacionamientoDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        EstacionamientoDTO esdto=m.map(esS.listId(id),EstacionamientoDTO.class);
        return esdto;
    }

    //eli
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        esS.delete(id);
    }

    @GetMapping("/emaxhorasreserva")
    public List<EstacionamientoQ1DTO> emaxhorasreserva(){
        List<String[]> filaLista = esS.emaxhorasreserva();
        List<EstacionamientoQ1DTO> dtoLista = new ArrayList<>();

        for (String[] columna : filaLista){
            EstacionamientoQ1DTO dto = new EstacionamientoQ1DTO();
            dto.setNombreEstacionamiento(columna[0]);
            dto.setHorasReservadas(Double.parseDouble(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }

    @GetMapping("/montoxe")
    public List<EstacionamientoQ2DTO> montoxe(){
        List<String[]> filaLista = esS.montoxe();
        List<EstacionamientoQ2DTO> dtoLista = new ArrayList<>();

        for (String[] columna : filaLista){
            EstacionamientoQ2DTO dto = new EstacionamientoQ2DTO();
            dto.setNombreEstacionamiento(columna[0]);
            dto.setMontoTotal(Double.parseDouble(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}
