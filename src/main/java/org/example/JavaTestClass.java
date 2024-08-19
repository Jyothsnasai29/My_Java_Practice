package org.example;

public class JavaTestClass {
    public static void main(String [] arguments) {
        Animal animalObject = new Animal();
        animalObject.setName("Dog");
        animalObject.setAge(2);
        animalObject.name = "Tiger";
//        animalObject.age = 5;
/*What is Encapsulation, by telusuko youtube video
* What is Data hiding
* What is the use of these two*/

        System.out.println("name of animal is" + animalObject.getName());
        System.out.println("age of animal is" + animalObject.getAge());
    }
}

class Animal{
  String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}