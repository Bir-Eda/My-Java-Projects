package ocaquestionsvp2;

public class Q88 {
    public static void main(String[] args) {
        int wd=0;

        String days[]={"sun", "mon", "wed", "sat"};
        for(String s:days){
            switch(s){
                case "sat":
                case "sun":
                    wd-=1; // -1 olur ve donguye yeniden girmez

                    break;
                case "mon":
                    wd-=1;
                    //System.out.println(wd);
                    break;
                case "wed":
                    wd+=2;
            }
        }
        System.out.println(wd);
    }
}
