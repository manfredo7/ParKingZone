package pe.edu.upc.parkingzone.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.parkingzone.dtos.ReservaDTO;
import pe.edu.upc.parkingzone.dtos.TestacionamientoDTO;
import pe.edu.upc.parkingzone.dtos.UserDTO;
import pe.edu.upc.parkingzone.entities.Reserva;
import pe.edu.upc.parkingzone.entities.Testacionamiento;
import pe.edu.upc.parkingzone.entities.Users;
import pe.edu.upc.parkingzone.serviceinterfaces.IReservaService;

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
}