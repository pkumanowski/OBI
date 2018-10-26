package com.obi;

public class Test {
    public static void main(String[] args) {
        // utworzenie dwoch obiektow okno
        Okno okno1 = new Okno();
        Okno okno2 = new Okno(1800, 1800, 3);

        // wywoływanie metod na stworzonych obiektach
        okno1.otworz();
        okno2.otworz(0);
        okno2.otworz(2);

        // wywołanie metody wypisz stan na obiektach
        okno1.wypiszStan();
        okno2.wypiszStan();

        // zamkniecie obiektu okno1
        okno1.zamknij();
        // ustawienie dlugosci obiektu okno2
        okno2.setDlugosc(2100);
        // zamkniecie obiekty okno2
        okno2.zamknij(0);
        // inicjacja nowego obiektu k1
        Klamka kl = new Klamka();
        // wywolanie metody sprawdzajacej czy jest kluczyk
        kl.setCzyKluczyk(true);
        // wywolanie 2 metod
        okno2.getSkrzydla()[1].setKlamka(kl);
        okno2.getSkrzydla()[2].setKlamka(null);

        //wywolanie metody wypisz stan na 2 obiektach: okno1 i okno2
        okno1.wypiszStan();
        okno2.wypiszStan();

    }
}
