package fourthloopspackage;

public class VowelsWhile {
    public static void main(String[] args) {
        int index = 0;
        String myStr = "Java is fun";
        while (index < myStr.length()) {
            if ((myStr.charAt(index) == 'u' || myStr.charAt(index) == 'i' || myStr.charAt(index) == 'a')) {
                System.out.println((myStr.charAt(index)));
            }
            index++;
        }
    }
}
//if (!(myStr.charAt(index) == 'u' || myStr.charAt(index) == 'i' || myStr.charAt(index) == 'a'))

// if den sonra ! isareti koyarsan sessiz harfleri shows

