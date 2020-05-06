package eighteenrecursionpackage;

public class Power {
    public static void main(String[] args) {
        System.out.println(power(3,6));
    }

    static double power(int base, int n) {
        if(n==0){
            return 1;
        }else{
            return base* power(base, n-1);
        }

    }
}
    //public static long power(long number , int power){
       // return (power!=1) ? number * power(number,power-1) : number;
   // }