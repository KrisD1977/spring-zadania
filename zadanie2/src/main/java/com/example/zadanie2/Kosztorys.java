package com.example.zadanie2;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class Kosztorys {

    private int koszta = 0;

    public void dodajKoszta(int koszta) {
        this.koszta += koszta;
    }

    @PreDestroy
    public void clear() {
        if(koszta > 300) {
            System.out.println("Generujemy za duże koszta");
        }
    }
}
