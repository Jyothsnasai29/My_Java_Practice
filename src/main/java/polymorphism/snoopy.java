package polymorphism;

public class snoopy extends Dog{

    @Override
    public void food()
    {
        System.out.println("Snoopy eats chicken");
    }

    public static void main(String[] args)
    {
        snoopy s = new snoopy();
        s.sound();
        s.food();
    }
}
