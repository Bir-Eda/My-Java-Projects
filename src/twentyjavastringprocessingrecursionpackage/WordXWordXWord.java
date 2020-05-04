package twentyjavastringprocessingrecursionpackage;

public class WordXWordXWord {
    public static void main(String[] args) {
        System.out.println(word("Word", "X", 3));
        System.out.println(word("This", "And", 2));
        System.out.println(word("This", "And", 1));
    }

    public static String word(String word, String sep, int count) {

        String result = word;
        for (int i = 1; i < count; i++) {
            result = result + sep + word;
        }
        return result;
    }
}