package twentyjavastringprocessingrecursionpackage;

public class UpperCaseSecond {
    public static void main(String[] args) {
        LowToUpper("rainbow");
    }
    public static void LowToUpper(String sentence){
        StringBuilder str = new StringBuilder(sentence);
        String upper="";
        char c;
        for (int i = 0; i <sentence.length() ; i++) {
            c=(char) (str.codePointAt(i)-32);
            upper+=c;
        }
        System.out.println(upper);
    }
}

