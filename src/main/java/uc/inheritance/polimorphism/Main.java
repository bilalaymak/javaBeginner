package uc.inheritance.polimorphism;
class Animal{

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void speak(){
        System.out.println("Hayvan konusuyor");
    }

public static class Bird extends Animal{

    public Bird(String name) {//constructer'i
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " otuyor");
    }

}

public static class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " havliyor");
    }

}
public static class Horse extends Animal{
    public Horse(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " kisniyor");
    }
}


}
public class Main {
    public static void speaktry (Animal animal) {
        animal.speak();
    }

    public static void main(String[] args) {

        Animal animal = new Animal("hayvan");
        Animal.Bird bird = new Animal.Bird("limon");
        Animal.Dog dog = new Animal.Dog("karabas");
        Animal.Horse horse = new Animal.Horse("sahbatur");

        animal.speak();
        bird.speak();
        dog.speak();
        horse.speak();


        System.out.println("***************");

        Animal animal2 = new Animal.Bird("limon");
        animal2.speak();

        System.out.println("******************");

        speaktry(new Animal.Horse("sahbatur"));


        }




    }


















