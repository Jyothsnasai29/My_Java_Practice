package org.example;

// access specifier class classname
public class MyCar {
    int year;
    String insurance;

  public void car(int b)
    {
        System.out.println("I purchased a car in year:" + b);
    }
    public String car1(int b)
    {
        return "I purchased a car in year:";
    }

    public static void main (String argv[]){
        MyCar vehicle = new MyCar();

        vehicle.year = 2021;
        vehicle.insurance = "State Farm";
        vehicle.car(vehicle.year);

        String output = vehicle.car1(2022);

        System.out.println(output);

//      System.out.println("year: " + vehicle.year + " insurance:" + vehicle.insurance);
    }

}
