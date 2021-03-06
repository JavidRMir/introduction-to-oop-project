package com.elitespectra;

public class Main {

    public static void main(String[] args) {

        Pigeon pippa = new Pigeon("Pippa", "Grey");
        pippa.speak();
        pippa.fly();
        pippa.eatPizza();
        pippa.sleep();
        pippa.spin();
        pippa.doTheCaterpillar();
        pippa.jump();

        Penguin pingu = new Penguin("Pingu", "Black & White");
        pingu.speak();
        pingu.fly();
        pingu.spin();
        pingu.doTheCaterpillar();
        pingu.jump();

        Parrot coco = new Parrot("Coco", "Green, Red, and Yellow ");
        coco.speak();
        coco.spin();
        coco.doTheCaterpillar();
        coco.jump();
    }
}
