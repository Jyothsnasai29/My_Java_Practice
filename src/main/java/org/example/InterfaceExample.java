package org.example;

public class InterfaceExample {
    public static void main(String[] args) {
        Playable myGuitar = new Guitar();
        myGuitar.play();
        ((Guitar) myGuitar).tuneStrings();

       // Playable myPiano = new Piano();

//        myPiano.play();
//        ((Piano) myPiano).pressPedals();

        Piano myPiano = new Piano();
        myPiano.play();
        myPiano.pressPedals();

    }
}
