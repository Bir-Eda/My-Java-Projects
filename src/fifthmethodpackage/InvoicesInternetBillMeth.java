package fifthmethodpackage;

public class InvoicesInternetBillMeth {

    public static void main(String[] args) {
        System.out.println(internetSpeed(200));

    }
    public static String internetSpeed(int speed){
        String decision;
        if(speed>100&& speed<300){
            decision="Good Speed";
        }
        else if(speed>300){
            decision="Super speed";
        }
        else {
            decision="Unknow speed";
        }
        return decision;
    }
}
