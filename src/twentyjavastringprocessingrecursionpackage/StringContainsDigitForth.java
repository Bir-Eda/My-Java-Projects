package twentyjavastringprocessingrecursionpackage;

public class StringContainsDigitForth {
    public static void main(String args[]) {
        String sample = "north American 2020";
        char[] chars = sample.toCharArray();
        for (char c : chars) {
            if (c >= 48 && c <= 57) {
                System.out.println(c);
            }
        }
    }
}
