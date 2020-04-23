package fifthmethodpackage;

public class ReplaceStringCharMethod {
    public static void stringChar(String text, char a, char b) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == a) {
                System.out.println(b);
            } else {
                System.out.println(text.charAt(i));
            }

        }
    }
    public static String replaceCharStr(String text, char lookup, char newChar){
        String replaced="";
        for(int i=0; i<text.length(); i++){
            if(text.charAt(i)==lookup){
                replaced+=newChar;
            }
            else{
                replaced+=text.charAt(i);
            }
        }
        return replaced;
    }
}
