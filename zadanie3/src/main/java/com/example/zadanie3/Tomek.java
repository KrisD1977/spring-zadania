package com.example.zadanie3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Tomek {

    @Autowired
    private Zabawka zabawka;

    @PostConstruct
    public void init() {
        if (zabawka.rodzaj() == RodzajZabawki.MIS) {
            System.out.println("Yay");
        } else {
            System.out.println("Chcialem misia");
        }
    }

}
