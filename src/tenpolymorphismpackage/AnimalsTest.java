package tenpolymorphismpackage;

public class AnimalsTest {
    public static void main(String[] args) {
        Animal animal=new Animal();
        Animal cat =new Cat();
        Animal dog=new Dog();
        animal.makeSound();
        cat.makeSound();
        dog.makeSound();
        Cat cat1=new Cat();
        cat1.makeSound();

    }
}
