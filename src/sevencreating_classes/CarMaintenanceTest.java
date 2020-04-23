package sevencreating_classes;

public class CarMaintenanceTest {
    public static void main(String[] args) {
        CarMaintenance myObj = new CarMaintenance("BMW", 45000, 50000, "new", "new", "old");
        System.out.println(myObj.toString());
        myObj.filterStatus();
        myObj.doOilChange();
        myObj.setAirFilter("old");
        myObj.doOilChange();
        System.out.println(myObj.getNextOdometer());
        System.out.println(myObj.toString());
        myObj.doOilChange();
        myObj.doOilChange();
        System.out.println(myObj.toString());


    }
}

