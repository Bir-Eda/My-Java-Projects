package projects;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindromeNaive("Birsen"));
        System.out.println(isPolindrome_2("kazak"));
    }
    public static boolean isPalindromeNaive(String s){
        StringBuilder sb1 = new StringBuilder(s);
        StringBuilder sb2 = sb1.reverse();
        if (s.equals(String.valueOf(sb2))){
            return true;
        }
        return false;
    }

    public static boolean isPolindrome_2(String str){
        String bld = new StringBuilder(str).reverse().toString();
        if(bld.equals(str)){
            return true;
        }
        return false;
    }



}
