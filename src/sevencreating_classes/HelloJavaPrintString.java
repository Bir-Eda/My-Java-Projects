package sevencreating_classes;

public class HelloJavaPrintString {
    public static void main(String[] args) {
        printString();
        printString("Hello world");
        printString("Hellooooo", 2);

    }
    public static void printString() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello");
        }
    }
        public static void printString(String word){
        for(int i=0; i<5; i++) {
            System.out.println(word);
        }
        }
        public static void printString(String text, int num){
        for(int i=0; i<num; i++){
            System.out.println(text);
        }
        }
    }

