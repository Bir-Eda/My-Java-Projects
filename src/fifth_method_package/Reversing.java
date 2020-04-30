package fifth_method_package;

public class Reversing {
    public static void reverseString(String sentence){
        for( int i=sentence.length()-1; i>=0; i--){
            //for(int i=13; i>=0; i--){
            System.out.print(sentence.charAt(i));
        }
    }
    public static String reverseText(String text){
        String result="";
        for(int i=text.length()-1; i>=0; i--){
            result= result+text.charAt(i);
        }
        return result;
    }

}
