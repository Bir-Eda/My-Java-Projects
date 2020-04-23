package secondifstatementspackage;

public class ConvertHello {
    public static void main(String[] args) {
   /* String word="Hello";
        System.out.println("Char value: "+word);   */
        char ch = 'a';
        String str = Character.toString(ch);
        System.out.println("String is: "+str);

        // Method 2: Using valueOf() method
        String str2 = String.valueOf(ch);
        System.out.println("String is: "+str2);
    }
}
