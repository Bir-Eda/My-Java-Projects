package homeworkpackage;

import java.util.Scanner;

public class OneOneWeather {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String des1,des2,des3,des4,des5 =" ";
        String pre1,pre2,pre3,pre4,pre5="";

        String wind1="";
        String wind2="";
        String wind3="";
        String wind4="";
        String wind5="";
        String hum1="";
        String hum2="";
        String hum3="";
        String hum4="";
        String hum5="";
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

        System.out.println("\t DAY\t\tDESCRIPTION\t\tPRECIP\t\t\tWIND\t\t\tHUMUDITY");

        System.out.println("\tTHURSDAY\t\t" + des1 + "\t\t" + pre1 + "\t\t" + wind1 + "\t\t" + hum1);
        System.out.println("\tFRIDAY\t\t" + des2 + "\t\t" + pre2 + "\t\t" + wind2 + "\t\t" + hum2);
        System.out.println("\tSATURDAY\t\t" + des3 + "\t\t" + pre3 + "\t\t" + wind3 + "\t\t" + hum3);
        System.out.println("\tSUNDAY\t\t" + des4 + "\t\t" + pre4 + "\t\t" + wind4 + "\t\t" + hum4);
        System.out.println("\tMONDAY\t\t" + des5 + "\t\t" + pre5 + "\t\t" + wind5 + "\t\t" + hum5);
    }

}
