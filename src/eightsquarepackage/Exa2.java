package eightsquarepackage;
// write a program to print Fibonacci series up to count 10
public class Exa2 {
    public static void main(String[] args) {
            System.out.println(fibonacci(10));
        }

    public static int fibonacci(int n) {
        if(n<=1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}

/* main (Fibonacci)
int n = 10, t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " + ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
 */