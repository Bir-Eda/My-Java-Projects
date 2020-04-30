package fifth_method_package;

public class RemoveChar {
    public static void main(String[] args) {
        removeChar("Good morning", 'o');
        System.out.println("----------");
        removeCharacter("lovely", 'l');
    }

    public static void removeChar(String x, char y) {
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) != y) {
                System.out.print(x.charAt(i));


            }
        }
    }

    public static void removeCharacter(String text, char charac) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != charac) {
                System.out.print(text.charAt(i));
            }
        }
    }
}
