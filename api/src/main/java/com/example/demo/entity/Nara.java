package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Nara extends Card{


    protected String Nara ;
    protected int importe;
    protected double tasa;

    @ManyToOne
    @JoinColumn(name = "card_id")
    protected Card Card;

    public Nara(long id, long number, String name, String lastName, Date expirationDate, String nara, int importe, double tasa, com.example.demo.entity.Card card) {
        super(id, number, name, lastName, expirationDate);
        Nara = nara;
        this.importe = importe;
        this.tasa = tasa;
        Card = card;
    }
    public Nara(){

    }


    public String getNara() {
        return Nara;
    }

    public void setNara(String nara) {
        Nara = nara;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    public double getTasa() {
        return tasa;
    }

    public void setTasa(double tasa) {
        this.tasa = tasa;
    }

    public com.example.demo.entity.Card getCard() {
        return Card;
    }

    public void setCard(com.example.demo.entity.Card card) {
        Card = card;
    }
}
