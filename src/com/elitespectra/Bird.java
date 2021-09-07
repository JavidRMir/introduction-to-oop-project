package com.elitespectra;

public abstract class Bird implements DanceImpl{

    protected String name;
    protected String color;

    public Bird(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public abstract void speak();

    public void fly() {
        System.out.println("Hi there! I can fly.");
    }

    @Override
    public void spin() {
        System.out.println(name + " spin!");
    }

    @Override
    public void doTheCaterpillar() {
        System.out.println(name + " do the wriggly woo!");
    }

    @Override
    public void jump() {
        System.out.println(name + " jump in the air!");
    }

}
