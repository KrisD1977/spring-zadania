package com.example.zadanie3;

import org.springframework.stereotype.Component;

@Component
public class Klocki implements Zabawka {
    @Override
    public RodzajZabawki rodzaj() {
        return RodzajZabawki.KLOCKI;
    }
}
