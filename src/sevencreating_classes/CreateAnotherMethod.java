package sevencreating_classes;

public class CreateAnotherMethod {
    public static void main(String[] args) {
        printString();
        printString("Java");
        printString("fun", 3);


    }
    public static void printString() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
    }
    public static void printString(String word) {
        for (int i = 0; i < 8; i++) {
            System.out.println(word);
        }
    }
    public static void printString(String word, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(word);
        }
    }




}
