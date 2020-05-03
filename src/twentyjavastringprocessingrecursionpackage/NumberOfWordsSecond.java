package twentyjavastringprocessingrecursionpackage;

public class NumberOfWordsSecond {
    public static void main(String[] args) {
        System.out.println(wordCount("JavaIsAlwaysFun"));
    }
    public static int wordCount(String str){
        int x=1;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)>='A'&&str.charAt(i)<='Z'){
                x++;
            }
        }
        return x;
    }
}
/*
private static long countUpperCase(String s) {
        return s.codePoints().filter(c-> Character.isUpperCase(c)).count()+1;
    }
*/
