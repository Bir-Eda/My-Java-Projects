package homeworkpackage;

import java.util.Scanner;

public class OneFourJobApplicant {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Please enter your Java value as Entry, Junior, Senior");
        String javaValue =myScan.nextLine();
        System.out.println("Please enter your SQL value as 100, 200,300");
        int SQLvalue =myScan.nextInt();
        System.out.println("Please enter your experience year between 1-10");
        int experience = myScan.nextInt();
        double score;
        if(javaValue.equalsIgnoreCase ("entry")){
            score= ((500+SQLvalue)*experience);
        }else if(javaValue.equalsIgnoreCase ("Junior")){
            score= ((1000+SQLvalue)*experience);
        }else {
            score= ((2000+SQLvalue)*experience);
        }
        if(score>10.000){
            System.out.println("we offer you $80.000");
        }
        else if(score>=7000 && score<=10.000){
            System.out.println("we offer you $60.000");
        }
        else if(score>=5000 && score<=7.000){
            System.out.println("we offer you $40.000");
        }
        else{
            System.out.println("We will keep your resume");
        }

    }
}
