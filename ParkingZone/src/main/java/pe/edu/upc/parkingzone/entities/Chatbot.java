package pe.edu.upc.parkingzone.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Chatbot")
public class Chatbot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int chatbotID;

    @Column(name = "preguntas",length = 200,nullable = false)
    private String Preguntas;

    public Chatbot() {
    }

    public Chatbot(int chatbotID, String preguntas) {
        this.chatbotID = chatbotID;
        Preguntas = preguntas;
    }

    public int getChatbotID() {
        return chatbotID;
    }

    public void setChatbotID(int chatbotID) {
        this.chatbotID = chatbotID;
    }

    public String getPreguntas() {
        return Preguntas;
    }

    public void setPreguntas(String preguntas) {
        Preguntas = preguntas;
    }
}
