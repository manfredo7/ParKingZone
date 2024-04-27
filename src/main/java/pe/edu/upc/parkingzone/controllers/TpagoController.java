package pe.edu.upc.parkingzone.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pe.edu.upc.parkingzone.dtos.MembresiaDTO;
import pe.edu.upc.parkingzone.dtos.TpagoDTO;
import pe.edu.upc.parkingzone.entities.Membresia;
import pe.edu.upc.parkingzone.entities.Tpago;

import pe.edu.upc.parkingzone.serviceinterfaces.ITpagoService;

import java.io.Console;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tpago")
public class TpagoController {
    @Autowired
    private ITpagoService tpS;

    @PostMapping
    public void insertar(@RequestBody TpagoDTO tpagoDTO)
    {
        System.out.println("insertar " + tpagoDTO.getDescripcionTpago() + " " + tpagoDTO.getTipoPagoID());
        ModelMapper m = new ModelMapper();
        Tpago pa = m.map(tpagoDTO, Tpago.class);
        System.out.println("insertar " + pa.getDescripcionTpago() + " " + pa.getTipoPagoID());
        tpS.insert(pa);
    }

    @GetMapping
    public List<TpagoDTO> listar(){
        return tpS.list().stream().map(y->{
            ModelMapper m =new ModelMapper();
            return m.map(y, TpagoDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) { tpS.delete(id);}

    @GetMapping("/{id}")
    public TpagoDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        TpagoDTO dto=m.map(tpS.listId(id),TpagoDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody TpagoDTO dto) {
        ModelMapper m = new ModelMapper();
        Tpago u = m.map(dto, Tpago.class);
        tpS.insert(u);
    }
}
