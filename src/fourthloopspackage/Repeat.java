package fourthloopspackage;

public class Repeat {
    public static void main(String[] args) {
        String myStr = "Sunday is funday";
        int index = 0;
        while (index < myStr.length()) {
            //index++;
            if ((myStr.charAt(index) == 'u' || myStr.charAt(index) == 'a' || myStr.charAt(index) == 'i')) {
                System.out.print((myStr.charAt(index)));
            }
            index++;

        }
    }
}
