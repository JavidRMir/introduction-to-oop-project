package com.elitespectra;

public class Parrot extends Bird {

    public Parrot(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.println("When the eagles are silent, the parrots begin to jabber");
    }
}
