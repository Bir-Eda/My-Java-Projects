package interview_questions;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(23));
        System.out.println(isPrime(121));
        System.out.println(isPrime(20));
        for(int i=-1; i<26; i++){
            System.out.println("number "+i+" "+isPrime(i));
        }
    }
// fibonacci, prime gibi sorularin formullerini ezberle
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <=Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
