package palindrome;

import java.util.Arrays;

public class ThirdExample {
    public static void main(String[] args) {
        String as = "yigit";
        char[] ch = as.toCharArray();
        int size = ch.length;
        char[] a = new char[as.length()];
        int i = 0;
        while (i != size) {
            a[size - i - 1] = ch[i];
            i++;
        }
        boolean isPalindrome= Arrays.equals(ch, a);
        System.out.println(isPalindrome);
    }
}
