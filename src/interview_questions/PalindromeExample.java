package interview_questions;

public class PalindromeExample {
    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
        // level
    }
    public static boolean isPalindrome(String text){
        StringBuilder sb1 = new StringBuilder(text);
        StringBuilder sb2 = sb1.reverse();
        if (text.equals(String.valueOf(sb2))){
            return true;
        }
        return false;
    }


    public static boolean isPalondromeee(String str){
        if(str.equals(new StringBuilder(str).reverse().toString())){
            return true;
        }
        return false;
    }
    }

