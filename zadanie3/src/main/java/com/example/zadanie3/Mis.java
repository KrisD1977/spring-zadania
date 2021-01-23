package com.example.zadanie3;

import org.springframework.stereotype.Component;

@Component
public class Mis implements Zabawka{
    @Override
    public RodzajZabawki rodzaj() {
        return RodzajZabawki.MIS;
    }
}
