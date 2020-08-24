package interview_questions;

public class MyPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("kazak"));
        System.out.println(isPalindrome("kaymak"));
    }
    public static boolean isPalindrome(String str){
        if(str.equals(new StringBuilder(str).reverse().toString())){
            return true;
        }
        return false;
    }
}
