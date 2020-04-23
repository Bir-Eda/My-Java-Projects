package fifthmethodpackage;

public class MyCalendar {
    public static void calendar(){
        for(int i=1; i<=12; i++){

            for(int j=1; j<=30; j++){
                System.out.println(i+"/"+j+"/"+"2020");

            }
        }
    }

    public static void main(String[] args) {
        calendar();
    }
}
