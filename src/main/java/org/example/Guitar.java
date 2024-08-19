package org.example;

class Guitar implements Playable {
    public void play(){
        System.out.println("Playing the guitar.");
    }

    public void tuneStrings() {
        System.out.println("Tuning the guitar strings.");
    }
}
