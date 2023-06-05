package com.engeto.examples.dumplings;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // první objekt třídy Racer
        new Racer();

        Racer chuck;


        // uložíme si objekt do proměnné:
        Racer firstRacer = new Racer();   // První závodník.
        Racer secondRacer = new Racer();  // Vytvoříme druhý objekt - druhého závodníka.
        Racer thirdRacer = new Racer();  // Vytvoříme třetí objekt - třetího závodníka.

        chuck = new Racer();
        chuck.setName("Chuck Norris");
        chuck.setBorn(LocalDate.of(1940, 10, 3));
        chuck.setNumberOfDumplings(10000);
        chuck.setFinalResult(false);


        // tři instance (objekty) třídy Race
        Race race2017 = new Race();
        Race race2018 = new Race();
        Race race2019 = new Race();

        firstRacer.setName("Radek");
        System.out.println("Závodník 1. " +firstRacer.getName());
        secondRacer.setName("Jana");
        System.out.println("Závodník 2. " +secondRacer.getName());
        thirdRacer.setName("Pepa");
        System.out.println("Závodník 3. " +thirdRacer.getName());

        Race todaysRace = new Race();
        todaysRace.setYear(2020);
        todaysRace.setTitle("Knedle Cup");
        todaysRace.setDate(LocalDate.now());
        todaysRace.setWinner(chuck);

        race2017.setYear(2017);
        race2018.setYear(2018);
        race2019.setYear(2019);

        race2017.setWinner(firstRacer);
        race2018.setWinner(secondRacer);
        race2019.setWinner(thirdRacer);

        firstRacer.setBorn(LocalDate.ofEpochDay(1901));
        secondRacer.setBorn(LocalDate.ofEpochDay(1902));
        thirdRacer.setBorn(LocalDate.ofEpochDay(1903));




        System.out.println("Chuck se narodil: " +chuck.getBorn());
        System.out.println("Závod se jmenuje: " +todaysRace.getTitle());
        System.out.println("Chuck jich sežral: " +chuck.getNumberOfDumplings());

        System.out.println (firstRacer.getName() +" vyhrál " +race2017.getYear() +" a narodil se roku: " +firstRacer.getBorn());




    }

}