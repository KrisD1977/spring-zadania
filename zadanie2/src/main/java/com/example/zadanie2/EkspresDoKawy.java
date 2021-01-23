package com.example.zadanie2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

public class EkspresDoKawy {

    private Kosztorys kosztorys;

    public EkspresDoKawy(Kosztorys kosztorys) {
        this.kosztorys = kosztorys;
    }

    @PostConstruct
    public void init() {
        kosztorys.dodajKoszta(100);
    }

    public void wypijKawę() {
        kosztorys.dodajKoszta(2);
    }

}
