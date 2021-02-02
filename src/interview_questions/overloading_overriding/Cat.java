package interview_questions.overloading_overriding;

public class Cat extends Animal {
    // metod overriding

    @Override
    public void makeSound() {
        System.out.println("miyav");
    }

    @Override
    public void leg() {
        System.out.println("cat have four legs");
    }
    
}
