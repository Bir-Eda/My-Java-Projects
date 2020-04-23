package sixtharraypackage;

public class ParkingFeeT {
    public static void main(String[] args) {
        parkFee(false,12);
    }
    public static void parkFee(boolean member, int hour){
        int payment=0;
        if(member){
            payment=0;
        }
        else{
            if (hour >= 1 && hour <= 2) {
                payment = 3;
            } else if (hour >= 3 && hour <= 6) {
                payment = 5;
            } else if (hour >= 1 && hour <= 2) {
                payment = 10;
            } else if (hour >= 12) {
                payment = 15;
            }
        }
        System.out.println("your parking fee is: $"+payment);
    }

}