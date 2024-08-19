package org.example;

 class Piano implements Playable {

     public void play(){
         System.out.println("Playing the piano.");
     }

     public void pressPedals() {
         System.out.println("Pressing the piano pedals.");
     }
}
