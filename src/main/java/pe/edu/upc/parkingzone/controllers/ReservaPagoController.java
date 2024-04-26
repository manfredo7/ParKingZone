package pe.edu.upc.parkingzone.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.parkingzone.dtos.ReservaDTO;
import pe.edu.upc.parkingzone.dtos.ReservaPagoDTO;
import pe.edu.upc.parkingzone.entities.Reserva;
import pe.edu.upc.parkingzone.entities.ReservaPago;
import pe.edu.upc.parkingzone.serviceinterfaces.IReservaPagoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/reservapagos")
public class ReservaPagoController {
    @Autowired
    private IReservaPagoService rpS;

    @PostMapping
    public void insertar(@RequestBody ReservaPagoDTO reservaPagoDTO){
        ModelMapper m=new ModelMapper();
        ReservaPago te =m.map(reservaPagoDTO,ReservaPago.class);
        rpS.insert(te);
    }
    //v
    @GetMapping
    public List<ReservaPagoDTO> listar(){
        return rpS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,ReservaPagoDTO.class);
        }).collect(Collectors.toList());
    }
    //eli
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        rpS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody ReservaPagoDTO dto) {
        ModelMapper m = new ModelMapper();
        ReservaPago u = m.map(dto, ReservaPago.class);
        rpS.insert(u);
    }

    @GetMapping("/{id}")
    public ReservaPagoDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        ReservaPagoDTO dto = m.map(rpS.listarId(id), ReservaPagoDTO.class);
        return dto;
    }
}
