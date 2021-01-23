package com.example.zadanie2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

@SpringBootApplication
public class Zadanie2Application {

	public static void main(String[] args) {
		SpringApplication.run(Zadanie2Application.class, args);
	}

	@Scope("prototype")
	@Bean
	public EkspresDoKawy ekspresDoKawy(Kosztorys kosztorys) {
		return new EkspresDoKawy(kosztorys);
	}

	@Bean
	public Komputer komputer() {
		return new Komputer();
	}

	@Bean
	public List<Programista> programistaList(Kosztorys kosztorys) {
		List<Programista> programistaList = new ArrayList<>();
		for(int i = 0; i < 5; ++i) {
			Programista programista = new Programista(i, komputer(), ekspresDoKawy(kosztorys));
			programista.init();
			programistaList.add(programista);
		}
		return programistaList;
	}

}
