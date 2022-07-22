package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Visa extends Card{


    protected String visa ;
    protected int importe;
    protected double tasa;

    @ManyToOne
    @JoinColumn(name = "card_id")
    protected Card Card;

      public Visa(){

      }

    public Visa(long id, long number, String name, String lastName, Date expirationDate, String visa, int importe, double tasa, com.example.demo.entity.Card card) {
        super(id, number, name, lastName, expirationDate);
        this.visa = visa;
        this.importe = importe;
        this.tasa = tasa;
        Card = card;
    }

    public String getVisa() {
        return visa;
    }

    public void setVisa(String visa) {
        this.visa = visa;
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
