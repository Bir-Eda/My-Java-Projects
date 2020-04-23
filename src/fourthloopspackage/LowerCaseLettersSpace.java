package fourthloopspackage;

public class LowerCaseLettersSpace {
    public static void main(String[] args) {

        String sentence = "I Will Never Give Up";
        //System.out.println((sentence.toUpperCase()));
        //System.out.println((sentence.toLowerCase()));

        for (int i = 0; i < sentence.length(); i++) {

            if ((sentence.charAt(i) >= 97 && sentence.charAt(i) <= 122) || sentence.charAt(i) ==' ') {
                System.out.print(sentence.charAt(i));
            }
        }
    }
}
