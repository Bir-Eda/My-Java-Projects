package sevencreating_classes;

public class CoffeeMakerTest {
    public static void main(String[] args) {
        CoffeeMaker myObj = new CoffeeMaker(3);
        System.out.println(myObj.toString());
        myObj.setTimer(20);
        System.out.println(myObj.getTimer());
        myObj.brewCoffe();
        myObj.resetTimer();
        myObj.brewCoffe();

    }
}
