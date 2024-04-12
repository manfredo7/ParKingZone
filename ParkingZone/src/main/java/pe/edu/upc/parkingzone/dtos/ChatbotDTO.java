package pe.edu.upc.parkingzone.dtos;

import jakarta.persistence.Column;

public class ChatbotDTO {

    private int chatbotID;


    private String Preguntas;

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
