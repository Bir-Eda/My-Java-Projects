package twentyjavastringprocessingrecursionpackage;

public class StartWordT {
    public static void main(String[] args) {
        System.out.println(check("hippo", "xip"));
    }
    public static String check(String str, String word) {
        String start= str.substring(1, word.length());
        String wordExceptFirst=word.substring(1, word.length());
        if(start.equals((wordExceptFirst))){
        return str.substring(0, word.length());
    }
    else{
        return "";
        }

    }
}
// first
//public static String check(String str, String word){
    //return (str.substring( 1,word.length()) .equals(word.substring(1)) ) ? str.substring(0,word.length()) : "";
//}
//if (word.length() == 1) return str.substring(0, 1);
//        if (str.contains(word.substring(1))) return str.substring(0, word.length());​
//        return "";

// second
//