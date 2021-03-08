package interview_questions2;

public class SwapTwoVariableWithoutThirdVariable {
    public static void main(String[] args) {


        //16. Swap two variable' values without using a third variable
        //Solution 1:
        int a = 10;
        int b = 20;
//        a = a + b;
//        b = a - b;
//        a = a - b;
        int c=a;
        a=b;
        b=c;
        System.out.println("a :"+a+" "+" b :"+b);

        //Solution 2:
        //int a = 10; int b = 20;
        //a = a^b;
        //b = a^b;
        //a = a^b;

    }
}