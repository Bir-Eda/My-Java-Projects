package homeworkpackage;

import java.util.Scanner;

public class TabloWeather {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String des1,des2,des3,des4,des5 =" ";
        String pre1,pre2,pre3,pre4,pre5="";
        String wind1,wind2,wind3,wind4,wind5="";
        String hum1,hum2,hum3,hum4,hum5="";
        System.out.println("Please enter for Thursday : Description, Precip, Wind, Humidity");
        des1 = myScan.nextLine();
        pre1 = myScan.nextLine();
        wind1 = myScan.nextLine();
        hum1 = myScan.nextLine();

        System.out.println("Please enter for Friday : Description, Precip, Wind, Humidity");
        des2 = myScan.nextLine();
        pre2 = myScan.nextLine();
        wind2 = myScan.nextLine();
        hum2 = myScan.nextLine();

        System.out.println("Please enter for Saturday : Description, Precip, Wind, Humidity");
        des3 = myScan.nextLine();
        pre3 = myScan.nextLine();
        wind3 = myScan.nextLine();
        hum3 = myScan.nextLine();

        System.out.println("Please enter for Sunday : Description, Precip, Wind, Humidity");
        des4 = myScan.nextLine();
        pre4 = myScan.nextLine();
        wind4 = myScan.nextLine();
        hum4 = myScan.nextLine();

        System.out.println("Please enter for Monday : Description, Precip, Wind, Humidity");
        des5 = myScan.nextLine();
        pre5 = myScan.nextLine();
        wind5 = myScan.nextLine();
        hum5 = myScan.nextLine();


        System.out.print(" \t DAY\t\tDESCRIPTION\t\tPRECIP\t\tWIND\t\tHUMUDITY\n");
        System.out.print(" \t"+"THU" +"\t\t"+ des1 + "\t\t" + pre1 +"%"+ "\t\t" + wind1 + "\t\t" + hum1+"%\n");
        System.out.print(" \t"+"FRI" + "\t\t"+ des2 + "\t\t\t\t" + pre2 + "%"+"\t\t" + wind2 + "\t\t" + hum2+"%\n");
        System.out.print(" \t"+"SAT" +"\t\t"+ des3 + "\t\t" + pre3 + "%"+"\t\t" + wind3 + "\t\t" + hum3+"%\n");
        System.out.print(" \t"+"SUN" + "\t\t"+des4 + "\t\t\t\t" + pre4 + "%"+"\t\t" + wind4 + "\t\t" + hum4+"%\n");
        System.out.print(" \t"+"MON" + "\t\t"+ des5 + "\t\t" + pre5 + "%"+"\t\t" + wind5 + "\t\t" + hum5+"%\n");
    }
}
