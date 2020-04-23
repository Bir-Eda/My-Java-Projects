package sevencreating_classes;

public class InterviewClassTest {
    public static void main(String[] args) {
        InterviewClass myObj = new InterviewClass("Eda", 100, "OK", 90, 90, 90);
        System.out.println(myObj.toString());
        System.out.println(myObj.decision());
        myObj.calculateScore();
        System.out.println(myObj.decision());

    }
}
