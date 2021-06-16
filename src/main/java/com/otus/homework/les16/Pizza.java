package com.otus.homework.les16;

public class Pizza {
    //    private VeganPizza veganPizza;
    private MeatPizza meatPizza;

    public String readyToEat() {
//        veganPizza = new VeganPizza();
//        return "Pizza is ready with taste: " + veganPizza.chooseTaste();
        meatPizza = new MeatPizza();
        return "Pizza is ready with taste: " + meatPizza.chooseTaste();
    }
}
