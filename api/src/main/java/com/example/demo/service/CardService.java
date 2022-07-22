package com.example.demo.service;

import com.example.demo.entity.Card;
import com.example.demo.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
public class CardService {

    @Autowired
    private CardRepository repo;

    @Transactional
    public Card save(long number, String name, String lastName, Date expirationDate){
     Card card = new Card();
     card.setName(name);
     card.setLastName(lastName) ;
    card.setNumber(number);
     card.setExpirationDate(expirationDate);
    return repo.save(card);
    }

  @Transactional
    public Card Update(long id, long number, String name, String lastName, Date expirationDate)throws Exception{

        Card card = repo.getById(String.valueOf(id));
        validator(number, name, lastName, expirationDate);
        if (card==null){
            throw new Exception("the card is not found");
        }
        card.setName(name);
        card.setLastName(lastName);
        card.setNumber(number);
        card.setExpirationDate(expirationDate);

        return repo.save(card);
    }

    @Transactional
    public List<Card> cardList(){
        return repo.findAll();
    }
    public void validator(long number, String name, String lastName, Date expirationDate) throws Exception {
        if (name== null || name.isEmpty()){
            throw new Exception("Enter your name");
        }
        if(lastName==null || lastName.isEmpty()){
            throw new Exception("Enter your lastname");
        }
        if(expirationDate==null){
            throw new Exception("Enter your expirationDate");
        }
        if(number == 0){
            throw new Exception("Enter your number");
        }
    }

}
