package polymorphism;

public class AnimalSounds {
    public void sound(){
        System.out.println("Animal make different sounds");
    }

    public static void main(String[] args){
        AnimalSounds forest = new AnimalSounds();
        forest.sound();
        Cow forest2 = new Cow();
        forest2.sound();
//        forest2.sound("Arun1");
//        forest2.sound(5);
//        forest2.sound("vicky", "pinky");

        Dog forest3 = new Dog();
        forest3.sound();
    }
}
