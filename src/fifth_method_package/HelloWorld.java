package fifth_method_package;

public class HelloWorld {
    public static void myNumber( int times){
        System.out.println("How many times?");
        int count=0;
        while(count<=times){
            System.out.println("Hello world");
            count++;
        }
    }
    public static int summation(int x, int y){
        int sum= x+y;
        System.out.println(sum);
        return sum;

    }
    public static double subtraction(int x, int y){
        double result= x-y;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        myNumber(5);
        summation(3,5);
        subtraction(45, 23);
        division(20,4);
    }
    public static int division(int a, int b){
        int divide= a/b;
        System.out.println(divide);
        return divide;
    }
}
