package interview_questions;

public class String_Prime {
    public static void main(String[] args) {
        System.out.println(prime(121));
    }
    public static String prime(int num){
        if(num<=1) {
            return "not prime";
        }
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0){
                return "not prime";
            }
        }
        return " is prime";
    }
}
