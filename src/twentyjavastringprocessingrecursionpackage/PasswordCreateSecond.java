package twentyjavastringprocessingrecursionpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordCreateSecond {
   /* public static void main(String[] args) {
        String password = "92@gAs*";
        System.out.println(pas(6, "1@Aus$"));
    }

    public static int pas(int n, String password){​
        Matcher upper = Pattern.compile("[A-Z]").matcher(password);
        Matcher lower = Pattern.compile("[a-z]").matcher(password);
        Matcher digit = Pattern.compile("[\\d]").matcher(password);
        Matcher special = Pattern.compile("\\p{Punct}").matcher(password);
        int count = 0;
        if (!digit.find()) count++;
        if (!upper.find()) count++;
        if (!lower.find()) count++;
        if (!special.find()) count++;
        return Math.max(count, 6 - n);
    } */
}
