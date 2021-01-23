package com.example.zadanie2;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Random;

public class Programista {

    private String praca = "";

    private int imie;
    private Komputer komputer;
    private EkspresDoKawy ekspresDoKawy;

    public Programista(int imie, Komputer komputer, EkspresDoKawy ekspresDoKawy) {
        this.imie = imie;
        this.komputer = komputer;
        this.ekspresDoKawy = ekspresDoKawy;
    }

    @PostConstruct
    public void init() {
        new Thread(() -> {
            for (int i = 0; i < 10; ++i) {
                String praca = komputer.getPraca();
                if (!praca.equals(this.praca)) {
                    System.out.println(imie + ": Ktoś dotykał mojego komputera");
                } else {
                    this.praca += new Random().nextInt();
                    komputer.setPraca(this.praca);
                    System.out.println(imie + ": Work work");
                }

                ekspresDoKawy.wypijKawę();
            }
        }).start();
    }
}
