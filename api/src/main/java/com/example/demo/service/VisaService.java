package com.example.demo.service;

import com.example.demo.entity.Amex;
import com.example.demo.entity.Card;
import com.example.demo.entity.Visa;
import com.example.demo.repository.AmexRepository;
import com.example.demo.repository.VisaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class VisaService {

    @Autowired
    private VisaRepository repo ;

    @Autowired
    private Card card;


    @Transactional
    private Visa save(Card card, String Visa, int importe, double tasa){
        Visa visa = new Visa();

        visa.setCard(card);
        visa.setVisa(Visa);
        visa.setImporte(importe);
        visa.setTasa(tasa);
        return repo.save(visa);

    }
    @Transactional
    public Visa devolucionTasa(Card card, String Visa, int importe, double tasa ){



        return null ;
    }

    @Transactional
    public List<Visa> VisaList(){
        return repo.findAll();
    }

}
