package org.example;

 class Rectangle extends Shape{
     double length, width;

     Rectangle(double length, double width){
         this.length = length;
         this.width = width;
     }


     double calculateArea() {
         return length * width;
     }


}

