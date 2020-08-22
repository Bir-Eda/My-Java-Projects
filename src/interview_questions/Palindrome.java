package interview_questions;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPolindrome("kazak"));
        System.out.println(isPolindromeSecond("hagsfd"));
    }

    public static boolean isPolindrome(String str) {
        if (str.equals(new StringBuilder(str).reverse().toString())) {
            return true;
        }
        return false;
    }
    public static boolean isPolindromeSecond(String str){
        if(!(str.equals(new StringBuilder(str).reverse().toString()))){
            return false;
        }
        return true;
    }

}
