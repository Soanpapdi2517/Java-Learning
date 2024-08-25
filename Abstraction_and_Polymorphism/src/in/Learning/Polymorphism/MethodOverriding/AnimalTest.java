package in.Learning.Polymorphism.MethodOverriding;


public class AnimalTest {
    public static void main(String[] args) {
        Animal animal= new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Human human = new Human();
        animal.animalSound();
        dog.animalSound();
        cat.animalSound();
        human.animalSound();
    }
}
