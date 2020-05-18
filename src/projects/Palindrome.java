package projects;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindromeNaive("Birsen"));
    }
    public static boolean isPalindromeNaive(String s){
        StringBuilder sb1 = new StringBuilder(s);
        StringBuilder sb2 = sb1.reverse();
        if (s.equals(String.valueOf(sb2))){
            return true;
        }
        return false;
    }

}
