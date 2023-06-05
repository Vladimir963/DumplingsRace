package com.engeto.examples.dumplings;

import java.time.LocalDate;

public class Race {

    int year;
    String title;
    LocalDate date;  // Slovo LocalDate bude možná zatím svítit červeně.  OK
    Racer winner;

    //getter setter

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Racer getWinner() {
        return winner;
    }

    public void setWinner(Racer winner) {
        this.winner = winner;
    }


    //konstrukor


}
