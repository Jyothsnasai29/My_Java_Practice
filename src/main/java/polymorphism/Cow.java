package polymorphism;

public class Cow  extends AnimalSounds{
    public void sound(){
        System.out.println("The cow says moo moooooooooooo");
//        super.sound();
    }

    public void sound(String a, String b){
        System.out.println("The cow says moo moo");
    }

    public int sound(int b){
        System.out.println("The cow says moo moo to vicky");
        return b;
    }

    public String sound(String b){
        System.out.println("The cow says moo moo to vicky");
        return b;
    }

    public int sound(int b, int a){
        System.out.println("The cow says moo moo to vicky");
        return 1;
    }

}
