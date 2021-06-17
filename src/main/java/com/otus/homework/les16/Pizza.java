package com.otus.homework.les16;

public class Pizza {
    private Configurable taste;

    public Pizza(Configurable taste) {
        this.taste = taste;
    }

    public String readyToEat() {
        return "Pizza is ready with taste: " + taste.chooseTaste();
    }
}
