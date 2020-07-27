package ocaquestionsvp3;

public class Q154 {
    static int count;
    public static void display(){
        System.out.println("Welcome"+count++);
    }

    public static void main(String[] args) {
        Q154.display();
        display();
    }
}
