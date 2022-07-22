package com.example.demo.entity;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity

public class Card {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id ;
    private long number;
    private String name;
    private String lastName;
    @CreatedDate
    private Date expirationDate;

    public Card() {
    }

    public Card(long id, long number, String name, String lastName, Date expirationDate) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.lastName = lastName;
        this.expirationDate = expirationDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public long getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}
