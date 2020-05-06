package eighteenrecursionpackage;

public class FibonacciFirst {
    public static void main(String[] args) {
        System.out.println(fibonacci(20));
    }
    public static int fibonacci(int num){
        if(num<=1){
            return 1;
        }else{
            return fibonacci(num-1)+fibonacci(num-2);
        }
    }
}
//F(n-1) + F(n-2); formula