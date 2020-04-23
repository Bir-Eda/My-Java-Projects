package sevencreating_classes;

public class DenemelerTest {
    public static void main(String[] args) {
        Denemeler myObj=new Denemeler(3);
        System.out.println(myObj.toString());
        myObj.setTimer(20);
        System.out.println(myObj.getTimer());
       myObj.setTheTimer(160);
    }
}
