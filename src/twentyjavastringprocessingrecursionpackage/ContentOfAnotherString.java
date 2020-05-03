package twentyjavastringprocessingrecursionpackage;

public class ContentOfAnotherString {
    public static void main(String[] args) {
        System.out.println(isEnd("java rocks", "ks"));
    }
    public static boolean isEnd (String s,String end){
        return  (s.substring(s.length()-end.length()).equals(end)) ? true : false;
    }
}
