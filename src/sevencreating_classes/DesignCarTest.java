package sevencreating_classes;

public class DesignCarTest {
    public static void main(String[] args) {
        DesignCar myObj=new DesignCar(2015, 0, 0);
        double basePrice= myObj.basePrice;
        System.out.println(myObj);
        DesignCar second=new DesignCar(2019, 3, 2);
        System.out.println(second.makeOffer(2020));

    }
}
