package pe.edu.upc.parkingzone.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pe.edu.upc.parkingzone.dtos.MembresiaDTO;
import pe.edu.upc.parkingzone.dtos.TestacionamientoDTO;
import pe.edu.upc.parkingzone.dtos.TpagoDTO;
import pe.edu.upc.parkingzone.dtos.UserDTO;
import pe.edu.upc.parkingzone.entities.Testacionamiento;

import pe.edu.upc.parkingzone.entities.Tpago;
import pe.edu.upc.parkingzone.serviceinterfaces.ITestacionamientoService;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/testacionamientos")
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

    @PutMapping
    public void modificar(@RequestBody TestacionamientoDTO dto) {
        ModelMapper m = new ModelMapper();
        Testacionamiento u = m.map(dto, Testacionamiento.class);
        teS.insert(u);
    }

    @GetMapping("/{id}")
    public TestacionamientoDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        TestacionamientoDTO dto=m.map(teS.listId(id),TestacionamientoDTO.class);
        return dto;
    }
}
