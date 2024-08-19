package polymorphism;

public class Dog{
    public void sound(){
        System.out.println("hi arun");
    }

    public void sound(int a){
        System.out.println("hi pinky");
    }

    public void sound(String a, String b){
        System.out.println("sudhjhwf");
    }


    public void food()
    {
        System.out.println("Dog is eating food cerlac");
    }

    public void food(int a)
    {
        System.out.println("Dog is eating food cerlac");
    }

    // same name diff signature
    // over loading can be only done in same class
    // usage - based on inputs we pass the method behaviour would change

    public static void main(String[] args)
    {

    }
}

