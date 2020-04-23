package fourthloopspackage;

public class DoWhileConvertFromHundToTous {
    public static void main(String[] args) {
        double i = 100;
        do {
            System.out.println(i);
            i-=0.5;
        }
        while(i>0);
        System.out.println("---------");

        float number=100.00f;
        do{
            System.out.println("Number ="+number);
            number-=0.5;
        }
        while(number>=0);
    }
}
