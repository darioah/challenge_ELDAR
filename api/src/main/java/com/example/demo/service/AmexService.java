package com.example.demo.service;

import com.example.demo.entity.Amex;
import com.example.demo.entity.Card;
import com.example.demo.repository.AmexRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class AmexService {

    @Autowired
    private AmexRepository repo ;

    @Autowired
    private Card card;

    @Transactional
    private Amex save( Card card, String Amex, int importe, double tasa){
        Amex amex = new Amex();

        amex.setCard(card);
        amex.setAmex(Amex);
        amex.setImporte(importe);
        amex.setTasa(tasa);
        return repo.save(amex);

    }
    @Transactional
    public Amex devolucionTasa(Card card, String Amex, int importe, double tasa ){
         double dev = importe +tasa ;


        return dev ;
    }

    @Transactional
    public List<Amex> AmexList(){
        return repo.findAll();
    }
}
