package org.example;

 class Circle extends Shape {
     double radius;

     Circle(double radius) {
         this.radius = radius;
     }

     double calculateArea() {
         return Math.PI * radius * radius;

     } public void run(){
         System.out.println("i am running");
     }


 }