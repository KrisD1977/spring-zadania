package com.example.zadanie1;

import com.example.zadanie1.skladniki.Jajko;
import com.example.zadanie1.skladniki.Maslo;
import com.example.zadanie1.skladniki.Patelnia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class Kucharz {

    @Bean
    public Omlet omlet(@Autowired(required = false) Patelnia patelnia,
                       @Autowired(required = false) Maslo maslo,
                       @Autowired(required = false)List<Jajko> jajka) {
        if(patelnia == null) {
            throw new RuntimeException("Nie mam patelni");
        }

        if(maslo == null) {
            throw new RuntimeException("Nie mam masla");
        }

        if(jajka == null || jajka.size() < 3) {
            throw new RuntimeException("Potrzebuje conajmniej 3 jajek");
        }

        return new Omlet(jajka, maslo, patelnia);
    }

}
