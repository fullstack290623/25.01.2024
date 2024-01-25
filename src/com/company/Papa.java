package com.company;

public class Papa {

    private String papaSecret; // 1
    int number; // in the same package -- package private 2
    protected String codeSafe; // all inheritors and package private 3
    public String everyoneKnows; // 4

    public Papa(String codeSafe) {
        this.codeSafe = codeSafe;
    }
}
