package OracleExample;

public class CarVehicle extends Vehicle {
    String trans;


    CarVehicle(String trans){
        this.trans=trans;
    }
    CarVehicle(String type, int maxSpeed, String trans){
    super(type, maxSpeed);
    this.trans=trans;
}
}