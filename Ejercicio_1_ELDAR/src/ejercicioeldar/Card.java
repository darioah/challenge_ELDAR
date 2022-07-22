/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioeldar;

import java.util.Date;


public  class Card {
    
    public String name ;
    public  String lastName; 
   public  String number;
    public  String expirationDate;

    public Card(String name, String lastName, String number, String expirationDate) {
        this.name = name;
        this.lastName = lastName;
        this.number = number;
        this.expirationDate = expirationDate;
    }

    public Card() {
    }

    
    
    public String getName() {
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = String.valueOf(number);
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
    
//    public abstract boolean operacionValida(double limite);
//
//    public abstract boolean tarjetaValidaporFechadeVencimiento();
//
//    public abstract double calculoTasa();
//
//    public abstract String informarOperacion(double importe);

    @Override
    public String toString() {
        return "Card{" + "name=" + name + ", lastName=" + lastName + ", number=" + number + ", expirationDate=" + expirationDate + '}';
    }
    
    
    
}
