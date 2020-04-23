package sixtharraypackage;

public class NumberOfCapitalLetter {
    public static void main(String[] args) {
        numberOfCapital("Today We Will Repeat");
    }
    public static void numberOfCapital(String sentence) {
        int number = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) >= 65 && sentence.charAt(i) <= 90) {
                number++;
            }
        }
        System.out.println(number);

    }
}
