package pe.edu.upc.parkingzone.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.parkingzone.dtos.ChatbotDTO;
import pe.edu.upc.parkingzone.dtos.MembresiaDTO;
import pe.edu.upc.parkingzone.entities.Chatbot;
import pe.edu.upc.parkingzone.entities.Membresia;
import pe.edu.upc.parkingzone.serviceinterfaces.IChatbotService;
import pe.edu.upc.parkingzone.serviceinterfaces.IMembresiaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/chatbot")
public class ChatbotController {
    @Autowired
    private IChatbotService cS;

    @PostMapping
    public void insertar(@RequestBody ChatbotDTO chatbotDTO){
        ModelMapper m=new ModelMapper();
        Chatbot mm =m.map(chatbotDTO, Chatbot.class);
        cS.insert(mm);
    }

    @GetMapping
    public List<ChatbotDTO> listar(){
        return cS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,ChatbotDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        cS.delete(id);
    }
}
