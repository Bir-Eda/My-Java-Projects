package eighteenrecursionpackage;

public class Test {
    static int count=1;

    public static void main(String[] args) {
        testId();
    }
    public static void testId(){
        System.out.println("Recorsion :"+count);
        count++;
        testId();
    }
}
