package fifthmethodpackage;

public class PasswordLetters {
    public static void main(String[] args) {
        generateLetterPass(6);
        System.out.println();
        System.out.println(generateLettersPass(6));
    }
    public static void generateLetterPass(int passLen){
        for(int i=0; i<passLen; i++){
            System.out.print((char)(97+(int)(Math.random()*26)));
        }
    }
    public static String generateLettersPass(int passLength){
        String result="";
        for(int i=0; i<passLength; i++) {
            result = result + (char) (97 + (int) (Math.random() * 26));
        }
        return result;
    }
}
