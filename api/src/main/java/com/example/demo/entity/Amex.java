package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Amex extends Card {

    protected String Amex ;
    protected int importe;
    protected double tasa;

    @ManyToOne
    @JoinColumn(name = "card_id")
    protected Card Card;

    public Amex(long id, long number, String name, String lastName, Date expirationDate, String amex, int importe, double tasa, com.example.demo.entity.Card card) {
        super(id, number, name, lastName, expirationDate);
        Amex = amex;
        this.importe = importe;
        this.tasa = tasa;
        Card = card;
    }

    public Amex() {

    }

    public String getAmex() {
        return Amex;
    }

    public void setAmex(String amex) {
        Amex = amex;
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
