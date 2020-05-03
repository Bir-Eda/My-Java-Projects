package twentyjavastringprocessingrecursionpackage;

public class StringPrototype_Replace {
    public static void main(String[] args) {
        System.out.println(replaceVowels("apple", 'o'));

    }
    public static String replaceVowels(String str, char replacement){
        StringBuilder builder=new StringBuilder(str);
        String vowels="aeuio";
        for(int i=0; i<builder.length(); i++){
            if(vowels.contains(builder.substring(i, i+1))){
                System.out.println("OK");
                builder.setCharAt(i, replacement);
            }
        }
        return builder.toString();
    }
}
