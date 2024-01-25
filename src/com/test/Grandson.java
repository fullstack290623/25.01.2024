package com.test;

import com.company.Son;

public class Grandson extends Son {

    public Grandson(String codeSafe) {
        super(codeSafe);
    }

    void showCode() {
        System.out.println(codeSafe);
        // System.out.println(super.number); // cannot access package private
    }

}
