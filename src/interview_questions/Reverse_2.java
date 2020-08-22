package interview_questions;

public class Reverse_2 {
    public static void main(String[] args) {
        System.out.println(reverse("Birsen"));
        System.out.println(reverseSecond("Gulsen"));
    }

    public static String reverse(String name) {
        String reverse = " ";
        for (int i = name.length() - 1; i > 0; i--) {
            reverse += name.charAt(i);
        }
        return reverse;
    }

    // second example
    public static String reverseSecond(String text) {
        String str = new StringBuilder(text).reverse().toString();

        return str;
    }
}
