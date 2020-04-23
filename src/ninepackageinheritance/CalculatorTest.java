package ninepackageinheritance;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator myCal = new Calculator();
        //myCal.add(2, 5);  //myCal. deyince private olanlari goremem
        AdvancedCalculator myAdv=new AdvancedCalculator();
        System.out.println(myAdv.factorial(10));

    }
}
