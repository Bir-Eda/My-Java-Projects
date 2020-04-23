package secondifstatementspackage;

public class Convert {
    public static void main(String[]args){
        int number1 = 300;
        byte number2 = (byte)number1;
        System.out.println("int Value : "+ number1);
        System.out.println("Byte Value :" + number2);
        System.out.println((byte)number1 + number1);
        //Birlikte yazdirmak icin//
        System.out.println("-------------------");

        double number3 = 2.12636474556;
        float number4 = (float) number3;
        System.out.println("Double value :" + number3);
        System.out.println("Float value :" + number4);
        System.out.println((float)number3 + number3);
        System.out.println("-------------------");

        int numb =88;
        numb++;
        System.out.println (numb);
        numb = numb + 34;
        System.out.println (numb);

        System.out.println (57%12);
        System.out.println (57/12);




    }
}
