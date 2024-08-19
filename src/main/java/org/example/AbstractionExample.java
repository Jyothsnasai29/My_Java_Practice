package org.example;

public class AbstractionExample {
    public static void main(String[] args){
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        // super class reference variable can store the address of the
        // subclass object

        // super class reference variable cannot call/ invoke subclass method even though we store subclass object in it
Circle circle2 = new Circle(7.0);
circle2.run();
        System.out.println("Area of Circle using subclass of object:" + circle2.calculateArea());

      System.out.println("Area of Circle:" + circle.calculateArea());
      System.out.println("Area of Rectangle:" + rectangle.calculateArea());

    }
}
