package com.otus.homework.les16;

public class Pizza {
    private Configurable taste;

    public String readyToEat() {
//        taste = new VeganPizza();
        taste = new MeatPizza();
        return "Pizza is ready with taste: " + taste.chooseTaste();
    }
}
