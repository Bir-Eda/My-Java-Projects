package fourthloopspackage;

public class WhileLettersAndNumbers {
    public static void main(String[] args) {
        int number = 1;
        int count;
        char letters = 'a';

        while (number < 6) {
            count=1;
            System.out.print(number+"\t");

            while (count < 5) {
                System.out.print(letters+"\t");
                letters++;
                count++;
            }
            System.out.println();
            number++;
        }
    }
}
