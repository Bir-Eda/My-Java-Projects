package sixtharraypackage;

public class RanForLoopString {
    public static void main(String[] args) {

        String[] arrayString = new String[10];
        //for (int i = 0; i < arrayString.length; i++) {
        for (int i = 0; i < 10; i++) {
            arrayString[i] = generateRandomWord();
        }
        for (String word : arrayString) {

            System.out.println(word);
        }
    }

    public static String generateRandomWord() {
        String word = "";
        int wordLength = (int) (Math.random() * 6 + 1);
        for (int i = 0; i < wordLength; i++) {
            word += (char) (int) (Math.random() * 26 + 97);
        }
        return word;

    }
}
