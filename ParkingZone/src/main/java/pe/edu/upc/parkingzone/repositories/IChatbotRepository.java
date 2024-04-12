package pe.edu.upc.parkingzone.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.parkingzone.entities.Chatbot;

public interface IChatbotRepository extends JpaRepository<Chatbot, Integer> {
}
