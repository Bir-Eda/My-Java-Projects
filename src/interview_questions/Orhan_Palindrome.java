package interview_questions;

import java.util.Arrays;

public class Orhan_Palindrome {
    public static void main(String[] args) {
        String str = "madam";

        if (palindrome(str))
            System.out.print("Yes");
        else
            System.out.print("No");

    }

    private static boolean palindrome(String str) {

        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}

