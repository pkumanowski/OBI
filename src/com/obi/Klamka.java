package com.obi;

// klasa bazowa
public class Klamka {

    // pole prywatne typu bool, wartość ustawiona na false
    private boolean czyKluczyk = false;

    // konstruktor publiczny
    public boolean isCzyKluczyk() {
        return czyKluczyk;
    }

    // metoda dostepowa
    public void setCzyKluczyk(boolean czyKluczyk) {
        this.czyKluczyk = czyKluczyk;
    }

    // metoda z warunkiem, zwracza 2 wartosci "z kluczem" : "bez klucza"
    public String stan() {
        return czyKluczyk ? "z kluczem" : "bez klucza";
    }
}
