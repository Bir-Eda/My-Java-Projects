package eighteenrecursionpackage;

public class FactorialQuestion {
    public static void main(String[] args) {
        System.out.println(factorial(500));
    }
    static int factorial(int num){
        if(num==4){
            return 4;
        }else{
            return(num*(factorial(num-1)));
        }
    }
}
