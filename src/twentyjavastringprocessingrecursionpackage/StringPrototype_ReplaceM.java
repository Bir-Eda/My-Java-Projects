package twentyjavastringprocessingrecursionpackage;

public class StringPrototype_ReplaceM {
    public static void main(String[] args) {
        System.out.println(replace("grape", "i"));
    }
    public static String replace(String s,String c){
        return s.replaceAll("[aeiuo]",c);
    }
}
