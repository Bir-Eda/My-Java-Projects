package projects;
import java.util.ArrayList;
import java.util.Arrays;

public class PrimeNumbersM {
    public static void main(String[] args) {
        System.out.println(primeNumbers2(1000));
        System.out.println(Arrays.toString(primeNumbers(1000)));
    }
    //with Arraylist
    public static ArrayList<Integer> primeNumbers2(int max) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i < max; i++) {
            if (isPrime(i)) list.add(i);
        }
        return list;
    }
    //without arraylist
    public static int[] primeNumbers(int max) {
        int[] arr = new int[max];
        for (int i = 1; i < max; i++) {
            if (isPrime(i)) arr[i] = i;
        }
        //filter if bigger than 1  and remove dublicate
        return Arrays.stream(arr).distinct().filter(n -> n > 1).toArray();
    }
    public static boolean isPrime(int n) {
        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

