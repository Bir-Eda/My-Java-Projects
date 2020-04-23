package sevencreating_classes;

public class OverloadMethodTest {
    public static void main(String[] args) {
        System.out.println("Java is fun");
    }
    public static void main(String arg1){
        System.out.println("Yes,"+arg1);
    }
    public static void main(String arg1, String arg2){
        System.out.println("Right,"+arg1+arg2);
    }
}
