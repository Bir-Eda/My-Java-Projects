package twentyjavastringprocessingrecursionpackage;



public class UpperCase {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("java is fun");
        System.out.println(upperCase(str));
    }

    public static String upperCase(StringBuilder input) {
        StringBuilder inputStr = new StringBuilder(input);
        for (int i = 0; i < inputStr.length(); i++) {
            if (inputStr.charAt(i) >= 97 && inputStr.charAt(i) <= 122) {
                inputStr.setCharAt(i, (char) (inputStr.charAt(i) - 32));
            }
        }
        return inputStr.toString();
    }
}