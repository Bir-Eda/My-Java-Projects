package fifth_method_package;

public class ConsecutiveChar {
    public static void consecutiveChar(String text) {
        text+=" ";
        for (int i = 0; i < text.length()-1; i++) {
            if (text.charAt(i) != text.charAt(i + 1)) {
                System.out.print(text.charAt(i));

            }

        }
    }

    public static void main(String[] args) {
        consecutiveChar("Hello");
    }
}
