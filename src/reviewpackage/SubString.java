package reviewpackage;

public class SubString {
    public static void main(String[] args) {
        SubString.makeOutWord("<<>>","Yay");
    }
    public static String makeOutWord(String out, String word) {
        String result;
        String first = out.substring(0,out.length()/2);
        String second = out.substring(out.length()/2);
        result = first+word+second ;
        return result;
    }
}
