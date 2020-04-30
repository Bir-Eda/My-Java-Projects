package fifth_method_package;

public class Try2Calendar {
    public static void chec(String pass) {
        if (pass.length() < 6) {
            System.out.println("Ok");
        } else {
            System.out.println("No 6please");
        }
    }

    public static void helloOne(String a, String b) {
        for (int i = 0; i < 1; i++) {
            System.out.println(a);
            for (int j = 1; j <= 3; j++) {
                System.out.println(b);
            }
        }
    }

    public static void helloThree(String a, String b) {
        for (int i = 0; i < 1; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println(b);
            }
            System.out.println(a);
        }
    }
    public static void main (String[]args){
        chec("Yesese");
        helloOne("Hello", "Word");
        helloThree("World", "Hello");

    }
}
