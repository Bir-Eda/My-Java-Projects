package sevencreating_classes;

public class BicycleTest {
    public static void main(String[] args) {
        Bicycle myObj =new Bicycle(2015,  "blue");
        System.out.println(myObj.modelSize+" "+myObj.modelColor);
        myObj.speedC(70);
        myObj.goFast();
        myObj.goFasster();
        myObj.goSlowly();
        myObj.goDown();
    }
}
