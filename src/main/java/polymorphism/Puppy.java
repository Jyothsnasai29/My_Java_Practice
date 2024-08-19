package polymorphism;

public class Puppy implements DogInterface {

private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public void sound() {
        System.out.println("Hi");
    }

    @Override
    public void food() {
        System.out.println("Hello");
    }
}


// overriding same name same signature
// it can happen in different classes
