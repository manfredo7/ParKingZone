package pe.edu.upc.parkingzone.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.parkingzone.entities.Chatbot;
import pe.edu.upc.parkingzone.repositories.IChatbotRepository;
import pe.edu.upc.parkingzone.serviceinterfaces.IChatbotService;

import java.util.List;
@Service
public class ChatbotServiceImplement implements IChatbotService {

    @Autowired
    private IChatbotRepository cR;

    @Override
    public void insert(Chatbot chatbot) {
        cR.save(chatbot);
    }

    @Override
    public List<Chatbot> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int id) {
cR.deleteById(id);
    }

    @Override
    public Chatbot listId(int id) {
        return cR.findById(id).orElse(new Chatbot());
    }
}
