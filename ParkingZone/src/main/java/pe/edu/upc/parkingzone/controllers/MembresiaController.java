package pe.edu.upc.parkingzone.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pe.edu.upc.parkingzone.dtos.MembresiaDTO;
import pe.edu.upc.parkingzone.entities.Membresia;

import pe.edu.upc.parkingzone.serviceinterfaces.IMembresiaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/membresia")
public class MembresiaController {
    @Autowired
    private IMembresiaService mS;

    //Reg
    @PostMapping
    public void insertar(@RequestBody MembresiaDTO membresiaDTO){
        ModelMapper m=new ModelMapper();
        Membresia mm =m.map(membresiaDTO,Membresia.class);
        mS.insert(mm);
    }
    //Vis
    @GetMapping
    public List<MembresiaDTO> listar(){
        return mS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,MembresiaDTO.class);
        }).collect(Collectors.toList());
    }
    //Eliminar
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        mS.delete(id);
    }
    //buscar por id
    @GetMapping("/{id}")
    public MembresiaDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        MembresiaDTO dto=m.map(mS.listId(id),MembresiaDTO.class);
        return dto;
    }

}
