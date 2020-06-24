package Whizlab2;

public class WP2_42Animal {
    public void eat() throws Exception {
        System.out.println("Animal eats");
    }
}

    class Dog extends WP2_42Animal {
        public void eat() {
            System.out.println("Dog eats");
        }


        public static void main(String[] args) throws Exception{
            WP2_42Animal a = new Dog();
            Dog d = new Dog();
            d.eat();
            a.eat();
        }

    }
