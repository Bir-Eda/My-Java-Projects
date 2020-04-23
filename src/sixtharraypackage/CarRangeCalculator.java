package sixtharraypackage;

public class CarRangeCalculator {
    public static void carRange(double mpg, double gallon){
        double range =mpg*gallon;
        System.out.println("Range:"+(int)range); // double int e cevrilmis oldu


        //public static int calculateRange(double mpg, double tank){ hocanin cozumu
        // return (int)(mpg*tank);

    }


    public static void main(String[] args) {
        carRange(40, 10);
    }
}
