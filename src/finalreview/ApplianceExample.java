package finalreview;

public class ApplianceExample {
    public static void main(String[] args) {
       // Appliance app= new Appliance();
        Appliance myApp= new Refrigerator();
        myApp.cold();
        Refrigerator myRef= (Refrigerator) myApp;
        myRef.door();
        ((Refrigerator)myApp).cold();

    }

}
class Appliance{
    void cold(){
        System.out.println("handle");
    }
}
class Refrigerator extends Appliance{
    void door(){
        System.out.println("Broken");
    }
}
