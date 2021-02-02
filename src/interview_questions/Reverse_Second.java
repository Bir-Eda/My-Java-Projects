package interview_questions;

public class Reverse_Second {
    public static void main(String[] args) {
        System.out.println(reverse("Birsen"));
        System.out.println(reverseSecond("YigitHan"));
    }

    public static String reverse(String text) {
        String reverse = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reverse += text.charAt(i);
        }
        return reverse;
    }

    public static String reverseSecond(String text) {
//        String str = new StringBuilder(text).reverse().toString();
//        return str;

         return new StringBuilder(text).reverse().toString();
    }
}