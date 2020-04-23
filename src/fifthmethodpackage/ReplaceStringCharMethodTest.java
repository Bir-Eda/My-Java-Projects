package fifthmethodpackage;

public class ReplaceStringCharMethodTest {
    public static void main(String[] args) {
        ReplaceStringCharMethod.stringChar("Chicken", 'i', 'e');
        String newString= ReplaceStringCharMethod.replaceCharStr("Hello", 'o', 'a');
        System.out.println("\n"+newString);
    }
}
