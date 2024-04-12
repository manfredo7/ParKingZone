package pe.edu.upc.parkingzone.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.parkingzone.dtos.MembresiaDTO;
import pe.edu.upc.parkingzone.dtos.RolDTO;
import pe.edu.upc.parkingzone.entities.Membresia;
import pe.edu.upc.parkingzone.entities.Rol;
import pe.edu.upc.parkingzone.serviceinterfaces.IRolService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rol")
public class RolController {
    @Autowired
    private IRolService rS;

    @PostMapping
    public void insertar(@RequestBody RolDTO rolDTO){
        ModelMapper m=new ModelMapper();
        Rol mm =m.map(rolDTO,Rol.class);
        rS.insert(mm);
    }

    @GetMapping
    public List<RolDTO> listar(){
        return rS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,RolDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        rS.delete(id);
    }


}
