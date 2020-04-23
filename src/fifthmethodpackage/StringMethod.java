package fifthmethodpackage;

public class StringMethod {
    public static void indexes(String text, int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(text.charAt(i));


        }
    }

    public static void index(String word, int a, int b) {
        for (int i = 0; i <= b; i++) {
            System.out.print(word.charAt(i));
        }
    }
}
