package com.engeto.examples.dumplings;

import java.time.LocalDate;

public class Racer {

    String name;
    // Jméno závodníka - textový atribut s názvem “name”.
    LocalDate born; // Datum narození závodníka.
    int numberOfDumplings;
    // Počet snězených knedlíků
    //   - číselný atribut s názvem „number of dumplings“.
    boolean isFinalResult;
    // Skončil už závodník („true“), nebo ještě pokračuje
    //  v jídle („false“)?
    // Atribut s názvem „isFinalResult“, jehož hodnotou
    //   je pravda/nepravda.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBorn() {
        return born;
    }

    public void setBorn(LocalDate born) {
        this.born = born;
    }

    public int getNumberOfDumplings() {
        return numberOfDumplings;
    }

    public void setNumberOfDumplings(int numberOfDumplings) {
        this.numberOfDumplings = numberOfDumplings;
    }

    public boolean isFinalResult() {
        return isFinalResult;
    }

    public void setFinalResult(boolean finalResult) {
        isFinalResult = finalResult;
    }


        public int addDumplings(int howMuch) {
            this.numberOfDumplings = this.numberOfDumplings + howMuch;
            return this.numberOfDumplings;
        }




}
