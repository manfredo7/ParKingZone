package pe.edu.upc.parkingzone.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.parkingzone.dtos.ChatbotDTO;
import pe.edu.upc.parkingzone.dtos.UsuarioDTO;
import pe.edu.upc.parkingzone.entities.Chatbot;
import pe.edu.upc.parkingzone.entities.Usuario;
import pe.edu.upc.parkingzone.serviceinterfaces.IUsuarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private IUsuarioService uS;
    @PostMapping
    public void insertar(@RequestBody UsuarioDTO usuarioDTO){
        ModelMapper m=new ModelMapper();
        Usuario mm =m.map(usuarioDTO, Usuario.class);
        uS.insert(mm);
    }

    @GetMapping
    public List<UsuarioDTO> listar(){
        return uS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,UsuarioDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        uS.delete(id);
    }
}
