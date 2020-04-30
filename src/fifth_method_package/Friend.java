package fifth_method_package;

public class Friend {
    public static void main(String[] args) {
        System.out.println(removeChar("Hello", 'e'));
    }
    public static String removeChar(String text, char charac){
        String word="";
        for(int i=0; i<text.length(); i++){
            if(text.charAt(i)!=charac){
                word+=text.charAt(i);
            }
            else if( text.charAt(i)==charac){
                word=word+'*';
            }
            else
            {
                System.out.println();
            }
        } return word;
    }
}
