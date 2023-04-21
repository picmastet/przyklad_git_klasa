package org.example;

import Klasy.Osoba;

public class Main {
    public static void main(String[] args) {

        Osoba osoba = new Osoba("Adam", "Kowalski");
        System.out.println("Imię: " + osoba.imie + "\n" + "Nazwisko:" +osoba.nazwisko);
        Osoba osoba2 = new Osoba("Amelia", "Nowak");
        System.out.println("Imię: " + osoba2.imie + "\n" + "Nazwisko:" +osoba2.nazwisko);
    }
}