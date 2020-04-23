package sevencreating_classes;

public class ConvertInch {
    public static void main(String[] args) {
        convertIncToCm(8);
        convertIncToCm(12.5);
    }
    // inch to cm
    public static void convertIncToCm(double inch){
        System.out.println(inch*2.54+"cm");
        // return cm*2.54; sout yerine return yazilabilir

    }
    //cm to inch
    public static void convertIncToCm(int cm) {
        System.out.println(cm/2.54+"inch");
        // return inch/2.54; sout yerine return yazilabilir

    }
}
