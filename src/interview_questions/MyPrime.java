package interview_questions;

public class MyPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(16));
    }
    // prime kendine ve 1 e bolunebilen sayi demektir
   public static boolean isPrime(int number){
        if(number<=1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(number); i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
   }
   
}
