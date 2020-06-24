package ocaquestionsvp2;

public class Q88 {
    public static void main(String[] args) {
        int wd=0;

        String days[]={"sun", "mom", "wed", "sat"};
        for(String s:days){
            switch(s){
                case "sat":
                case "sun":
                    wd-=1;
                    break;
                case "mom":
                    wd-=1;
                    break;
                case "wed":
                    wd+=2;
            }
        }
        System.out.println(wd);
    }
}
