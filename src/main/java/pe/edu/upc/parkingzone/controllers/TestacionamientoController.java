package pe.edu.upc.parkingzone.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import pe.edu.upc.parkingzone.dtos.TestacionamientoDTO;
import pe.edu.upc.parkingzone.entities.Testacionamiento;


import pe.edu.upc.parkingzone.serviceinterfaces.ITestacionamientoService;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/testacionamiento")
public class TestacionamientoController {
    @Autowired
    private ITestacionamientoService teS;
    //r
    @PostMapping
    public void insertar(@RequestBody TestacionamientoDTO testacionamientoDTO){
        ModelMapper m=new ModelMapper();
        Testacionamiento te =m.map(testacionamientoDTO,Testacionamiento.class);
        teS.insert(te);
    }

    @PutMapping
    public void modificar(@RequestBody TestacionamientoDTO tesdto) {
        ModelMapper m = new ModelMapper();
        Testacionamiento te = m.map(tesdto, Testacionamiento.class);
        teS.insert(te);
    }

    //v
    @GetMapping
    public List<TestacionamientoDTO> listar(){
        return teS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,TestacionamientoDTO.class);
        }).collect(Collectors.toList());
    }
    //eli
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        teS.delete(id);
    }

    //buscar por fechaInicio
    @GetMapping("/buscarDescripcion")
    public List<TestacionamientoDTO>buscarDescripcion(@RequestParam String descripcion){
        return teS.findByDescripcionTestacionamiento(descripcion).stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, TestacionamientoDTO.class);
        }).collect(Collectors.toList());
    }


}
