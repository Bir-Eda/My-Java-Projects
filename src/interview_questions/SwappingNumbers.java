package interview_questions;

public class SwappingNumbers {
    public static void main(String[] args) {
        int a=12, b=35;
        System.out.println("before swapping values are ..." + a+" "+b);
        int t=a;
        a=b;
        b=t;
        System.out.println("After swapping values are ...."+a+" "+b);

        // logic 2 use + and - without using 3rd variable
        a=a+b;
        b=a-b;
        a=a-b;

        // logic 2 use * and / without using 3rd variable
        a=a*b;
        b=a/b;
        a=a/b;
    }
}
