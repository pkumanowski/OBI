package com.obi;

//deklaracja klasy: nazwa klasy jest taka sama jak nazwa pliku
public class Okno {
    // pole prywatne dlugosc typu int
    private int dlugosc;
    // pole prywatne prywatne wysokosc typu int
    private int wysokosc;
    //pole prywatne liczbaSkrzydek typu int
    private int liczbaSkrzydel;
    //pole prywatne z tablicą Skrzydło
    private Skrzydlo[] skrzydla;

    // kontruktor przyjmujacy 3 argumenty
    public Okno(int d, int w, int lSkrzydel) {
        dlugosc = d;
        wysokosc = w;
        liczbaSkrzydel = lSkrzydel;
        // inicnjacja nowego obiektu skrzydla
        skrzydla = new Skrzydlo[lSkrzydel];
        for (int i = 0; i < lSkrzydel; i++) {
            skrzydla[i] = new Skrzydlo(d / lSkrzydel, w, new Klamka());
        }
    }

    // kontruktor przyjmujacy 3 argumenty
    public Okno(int d, int w, Skrzydlo[] sk) {
        dlugosc = d;
        wysokosc = w;
        liczbaSkrzydel = sk.length;
        skrzydla = sk;
    }

    // konstruktor przyjmujacy 2 parametry
    public Okno(int d, int w) {
        this(d, w, 1);
    }

    // obiekt Okno
    public Okno() {

        this(1200, 1500, 1);
    }

    // metoda pobierajaca dlugosc
    public int getDlugosc() {
        return dlugosc;
    }

    // metoda ustawiajaca dlugosc zawierajaca petle for
    public void setDlugosc(int dlugosc) {
        this.dlugosc = dlugosc;
        for (int i = 0; i < liczbaSkrzydel; i++) {
            skrzydla[i].setDlugosc(dlugosc / liczbaSkrzydel);
        }
    }

    // metoda zwracajaca wysokosc
    public int getWysokosc() {
        return wysokosc;
    }

    // metoda ustawiajaca wysokosc zawierajaca petle for
    public void setWysokosc(int wysokosc) {
        this.wysokosc = wysokosc;
        for (int i = 0; i < liczbaSkrzydel; i++) {
            skrzydla[i].setWysokosc(wysokosc);
        }
    }

    // metoda zwracajaca liczbe skrzydel
    public int getLiczbaSkrzydel() {
        return liczbaSkrzydel;
    }

    // metoda zwracajaca skrzydla
    public Skrzydlo[] getSkrzydla() {
        return skrzydla;
    }


    // metoda sluzaca do otwierania skrzydel
    public void otworz() {
        for (int i = 0; i < liczbaSkrzydel; i++) {
            skrzydla[i].setOtwarte(true);
        }
    }

    // metoda do otwierania konkretnego skrzydla
    public void otworz(int nrSkrzydla) {
        if (nrSkrzydla > skrzydla.length) return;

        skrzydla[nrSkrzydla].setOtwarte(true);

    }

    // metoda sluzaca do zamykania skrzydel
    public void zamknij() {
        for (int i = 0; i < liczbaSkrzydel; i++) {
            skrzydla[i].setOtwarte(false);
        }
    }

    // metoda sluzaco zo zamykania konkretnego skrzydla
    public void zamknij(int nrSkrzydla) {
        if (nrSkrzydla > skrzydla.length) return;

        skrzydla[nrSkrzydla].setOtwarte(false);

    }

    // metoda sluzaca do wypisywania w konsoli stanu skrzydel, w konsoli pojawi sie String
    public void wypiszStan() {
        String tekst = "";
        for (int i = 0; i < liczbaSkrzydel; i++) {
            tekst += "[" + skrzydla[i].stan() + "]";
        }
        System.out.println(tekst);

    }

}
