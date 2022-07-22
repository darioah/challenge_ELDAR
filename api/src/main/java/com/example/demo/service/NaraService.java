package com.example.demo.service;

import com.example.demo.entity.Amex;
import com.example.demo.entity.Card;
import com.example.demo.entity.Nara;
import com.example.demo.repository.NaraRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

public class NaraService {

    @Autowired
    private NaraRepository repo ;

    @Autowired
    private Card card;

    @Transactional
    private Nara save(Card card, String Nara, int importe, double tasa){
        Nara nara = new Nara();

        nara.setCard(card);
        nara.setNara(Nara);
        nara.setImporte(importe);
        nara.setTasa(tasa);
        return repo.save(nara);

    }
    @Transactional
    public Nara devolucionTasa(Card card, String Nara, int importe, double tasa ){

        return null ;
    }

    @Transactional
    public List<Nara> NaraList(){
        return repo.findAll();
    }
}
