package org.example;

import Klasy.Osoba;

public class Main {
    public static void main(String[] args) {

        Osoba osoba = new Osoba("Adam ", "Kowalski");
        System.out.println(osoba.getInfo());
        Osoba osoba2 = new Osoba("Amelia ", "Nowak");
        System.out.println(osoba2.getInfo());
        Osoba osoba3 = new Osoba("Amelia ", "Kowalska");
        System.out.println(osoba3.getInfo());
        System.out.println("Hello");
        System.out.println("TEST lll");
    }
}