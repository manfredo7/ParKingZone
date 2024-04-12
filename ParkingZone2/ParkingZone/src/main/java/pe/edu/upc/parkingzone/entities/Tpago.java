package pe.edu.upc.parkingzone.entities;
//Desarrollo Ricardo

import jakarta.persistence.*;

@Entity
@Table(name = "Tpago")
public class Tpago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int TipoPagoID;

    @Column(name = "descripcionTpago", length = 50, nullable = false)
    private String descripcionTpago;

    //constructor
    public Tpago(){

    }

    public Tpago(int TipoPagoID, String descripcionTpago) {
        System.out.println();
        this.TipoPagoID = TipoPagoID;
        this.descripcionTpago = descripcionTpago;
    }

    public int getTipoPagoID() {return TipoPagoID;}

    public void setTipoPagoID(int TipoPagoID) {this.TipoPagoID = TipoPagoID;}

    public String getDescripcionTpago() {return descripcionTpago; }

    public void setDescripcionTpago(String descripcionTpago) { this.descripcionTpago = descripcionTpago; }
}
