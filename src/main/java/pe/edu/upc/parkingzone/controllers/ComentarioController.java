package pe.edu.upc.parkingzone.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.parkingzone.dtos.ComentarioDTO;
import pe.edu.upc.parkingzone.dtos.ReservaPagoDTO;
import pe.edu.upc.parkingzone.entities.Comentarios;
import pe.edu.upc.parkingzone.entities.ReservaPago;
import pe.edu.upc.parkingzone.serviceinterfaces.IComentarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {
    @Autowired
    private IComentarioService cS;

    @PostMapping
    public void insertar(@RequestBody ComentarioDTO comentarioDTO){
        ModelMapper m=new ModelMapper();
        Comentarios te =m.map(comentarioDTO,Comentarios.class);
        cS.insert(te);
    }
    //v
    @GetMapping
    public List<ComentarioDTO> listar(){
        return cS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,ComentarioDTO.class);
        }).collect(Collectors.toList());
    }
    //eli
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        cS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody ComentarioDTO dto) {
        ModelMapper m = new ModelMapper();
        Comentarios u = m.map(dto, Comentarios.class);
        cS.insert(u);
    }

    @GetMapping("/{id}")
    public ComentarioDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        ComentarioDTO dto = m.map(cS.listarId(id), ComentarioDTO.class);
        return dto;
    }
}
