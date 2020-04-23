package fourthloopspackage;

public class LowerCaseLetter {
    public static void main(String[] args) {

        String sentence ="I Will Never Give Up";
        char letter;

        for(int i=0; i<sentence.length(); i++){

            letter=sentence.charAt(i);

            if(letter>=97 && letter<=122){

                System.out.println((sentence.charAt(i)));

            }

        }
    }
}
