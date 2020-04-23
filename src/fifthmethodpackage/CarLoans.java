package fifthmethodpackage;

public class CarLoans {
    public static double carLoan(int carPrice, int monthNum){
        double result;
        int monthly=230;
        result=(carPrice/monthNum)*0.9-monthNum;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(carLoan(25000, 45));
    }
}
