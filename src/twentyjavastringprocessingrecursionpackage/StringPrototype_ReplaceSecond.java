package twentyjavastringprocessingrecursionpackage;

public class StringPrototype_ReplaceSecond {
    public static void main(String[] args) {
        System.out.println(replaceVowels("banana", 'e'));
    }

    public static String replaceVowels(String str, char ch) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.toLowerCase().charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') result += ch;
            else result += str.charAt(i);
        }
        return result;
    }
}
