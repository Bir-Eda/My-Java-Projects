package fourthloopspackage;

public class LoopNumbersWhileEvenNumber {
    public static void main(String[] args) {
        int number = 2;
        for (int i = 1; i < 5; i++) {
            for(int j=1; j<7; j++){
                System.out.print(number+"\t");
                number+=2;
            }
            System.out.println();
        }
    }
}
