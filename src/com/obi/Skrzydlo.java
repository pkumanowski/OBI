package com.obi;

public class Skrzydlo {
    //pole prywatne dlugosc typu int
    private int dlugosc;
    // pole prywatne wysokosc typu int
    private int wysokosc;
    // pole prywatne klamka
    private Klamka klamka;
    // pole prywatne otwarte typu bool
    private boolean otwarte = false;

    //konstruktor publiczny przyjmujacy 2 wartosci
    public Skrzydlo(int dlugosc, int wysokosc) {
        this.dlugosc = dlugosc;
        this.wysokosc = wysokosc;
    }

    // konstruktor publiczny przyjmujacy 3 wartosci
    public Skrzydlo(int dlugosc, int wysokosc, Klamka klamka) {
        this(dlugosc, wysokosc);
        this.klamka = klamka;
    }

    // metoda dostepowe
    public int getDlugosc() {
        return dlugosc;
    }

    // metoda dostepowe
    public void setDlugosc(int dlugosc) {
        this.dlugosc = dlugosc;
    }

    // metoda dostepowe
    public int getWysokosc() {
        return wysokosc;
    }

    // metoda dostepowe
    public void setWysokosc(int wysokosc) {
        this.wysokosc = wysokosc;
    }

    // metoda dostepowe
    public Klamka getKlamka() {
        return klamka;
    }

    // metoda dostepowe
    public void setKlamka(Klamka klamka) {
        this.klamka = klamka;
    }

    // metoda zwracajaca wartosc otwarte
    public boolean isOtwarte() {
        return otwarte;
    }

    // metoda dostepowa ustawiajaca status Owarte
    public void setOtwarte(boolean otwarte) {
        this.otwarte = otwarte;
    }

    // publiczna metoda zwracajaca wymiary okna
    public String stan() {
        String wymiary = dlugosc + "x" + wysokosc;
        String otwarcie = otwarte ? "otwarte" : "zamkniete";
        String stanKlamki = klamka != null ? klamka.stan() : "bez klamki";
        return wymiary + " " + otwarcie + " " + stanKlamki;
    }
}
