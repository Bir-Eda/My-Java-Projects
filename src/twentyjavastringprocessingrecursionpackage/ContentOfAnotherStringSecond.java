package twentyjavastringprocessingrecursionpackage;

public class ContentOfAnotherStringSecond {
    public static void main(String[] args) {
    StringBuilder str = new StringBuilder("Java rocks");
        checkEnd(str, "ks");
    }
    public static void checkEnd(StringBuilder str, String word){
        int index=0;
        boolean result=false;
        for(int i=str.length()-word.length(); i<str.length(); i++){
            if(str.codePointAt(i)==word.charAt(index)){
                result=true;
                index++;
            }
        }
        System.out.println(result);
    }
}
