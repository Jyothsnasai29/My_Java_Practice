package org.example;

public class Car {
    String color;
    String model;

    // Constructor
    Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    // Method to display car details
    void displayDetails() {
        System.out.println("Car Model: " + model + ", Color: " + color);
    }


    public void run()
    {
        System.out.println("I'm running");
    }

    public void eat()
    {
        System.out.println("I'm eating");
    }



// Create objects (instances of the Car class)

    public static void main(String[] args) {
        Car car1 = new Car("Red", "Tesla Model S");
        car1.run();
        car1.color = "White";
        int x = 10;
        String s= "Hello";

        System.out.println(x);

        System.out.println(s);

        System.out.println(car1);

        System.out.println(car1.color + car1.model);

        Car car2 = new Car ("blue", "toyota");
         car2.eat();

        // Access object properties and methods
//        car1.displayDetails(); // Output: Car Model: Tesla Model S, Color: Red
//        car2.displayDetails(); // Output: Car Model: BMW M3, Color: Blue
    }
}