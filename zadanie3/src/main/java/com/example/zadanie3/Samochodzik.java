package com.example.zadanie3;

import org.springframework.stereotype.Component;

@Component
public class Samochodzik implements Zabawka{
    @Override
    public RodzajZabawki rodzaj() {
        return RodzajZabawki.SAMOCHODZIK;
    }
}
