package com.company;

public abstract class Ben extends Abba {

    public Ben(String s) {
        super(s);
    }

    // debt
    public abstract void goo();

    @Override
    public final void sing() {
        System.out.println("Ben is singing");
    }

}
