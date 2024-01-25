package com.company;

import java.time.LocalDateTime;

public class Demo1 extends Abba {

    boolean going = false;
    private final LocalDateTime createdAt;

    public Demo1(String s) {
        super(s);
        createdAt = LocalDateTime.now();
    }

    @Override
    public void foo() {

    }

    public void startGoing() {
        going = true;
    }


}
