package fifthmethodpackage;

public class PalindromeOrNot {
    public static void reverseText(String text) {
        String result = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            result += text.charAt(i);
        }
        if (result.equals(text)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
    public static void main (String[]args){
        reverseText("hey");
    }
}
