package com.company;

public class Son extends Papa {

    public Son(String codeSafe) {
        super(codeSafe);
    }

    public void tryPapaSecret() {
        // super.papaSecret; // cannot access
    }
}
