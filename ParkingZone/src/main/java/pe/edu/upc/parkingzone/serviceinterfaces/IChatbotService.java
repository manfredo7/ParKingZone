package pe.edu.upc.parkingzone.serviceinterfaces;

import pe.edu.upc.parkingzone.entities.Chatbot;


import java.util.List;

public interface IChatbotService {

    public void insert(Chatbot chatbot);
    public List<Chatbot> list();
    public void delete(int id);
    public Chatbot listId(int id);
}
