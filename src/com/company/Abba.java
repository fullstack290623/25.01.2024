package com.company;

/**
 * @
 */
public abstract class Abba {

    public Abba(String s) {

    }

    // debt
    public abstract void foo();

    public void sing() {
        System.out.println("Abba is singing");
    }

    @Override
    protected Abba clone() throws CloneNotSupportedException {
        return (Abba)super.clone();
    }

    @Override
    public String toString() {
        //this.getClass();
        return "Abba{}";
    }
}
