package com.example.zadanie1;

import com.example.zadanie1.skladniki.Jajko;
import com.example.zadanie1.skladniki.Maslo;
import com.example.zadanie1.skladniki.Patelnia;

import javax.annotation.PostConstruct;
import java.util.List;

public class Omlet {

    private List<Jajko> jajka;
    private Maslo maslo;
    private Patelnia patelnia;

    public Omlet(List<Jajko> jajka, Maslo maslo, Patelnia patelnia) {
        this.jajka = jajka;
        this.maslo = maslo;
        this.patelnia = patelnia;
    }

    @PostConstruct
    public void init() {
        System.out.println("Omlet gotowy");
    }
}
