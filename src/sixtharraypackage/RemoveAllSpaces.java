package sixtharraypackage;

public class RemoveAllSpaces {
    public static void removeSpaces( String word){
        for(int i=0; i<word.length();i++){
            if(word.charAt(i)!=' '){
                System.out.print(word.charAt(i));
            }
        }

    }

    public static void main(String[] args) {
        removeSpaces("It is a perfect day to study Java");
    }

}
