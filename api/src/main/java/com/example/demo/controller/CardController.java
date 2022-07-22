package com.example.demo.controller;

import com.example.demo.entity.Amex;
import com.example.demo.entity.Card;
import com.example.demo.entity.Nara;
import com.example.demo.entity.Visa;
import com.example.demo.service.AmexService;
import com.example.demo.service.CardService;
import com.example.demo.service.NaraService;
import com.example.demo.service.VisaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CardController {

    @Autowired
    private CardService cardService;
    @Autowired
    private VisaService visaService;

    @Autowired
    private NaraService naraService;

    @Autowired
    private AmexService amexService;



    @GetMapping("/allCard")
    public List<Card>allCard(){

        return cardService.cardList();
    }

    @PostMapping("/card")
      public Card createCard(@RequestBody Card card){

        return cardService.save(card.getName(),card.getLastName(),card.getExpirationDate(), card.getNumber());
    }
    @PostMapping("/cardvisa")
    public Visa createCard(@RequestBody Visa visa){

        return cardService.save(visa.getCard(), visa.getImporte(), visa.getTasa());
    }
    @PostMapping("/cardamex")
    public Nara createCard(@RequestBody Nara nara){

        return cardService.save(nara.getCard(), nara.getImporte(), nara.getTasa());
    }
    @PostMapping("/cardnara")
    public Visa createCard(@RequestBody Amex amex){

        return cardService.save(amex.getCard(), amex.getImporte(), amex.getTasa());
    }
}
