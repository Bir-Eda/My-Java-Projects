package interview_questions;

public class ExampleConstructor {
    int i=10;
    public ExampleConstructor() {
       // int i=5;
        this.i=5;

       // System.out.println(i);
    }

    public static void main(String[] args) {
        ExampleConstructor obj=new ExampleConstructor();
        System.out.println(obj.i);

    }
}
