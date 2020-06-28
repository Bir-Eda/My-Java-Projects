package ocaquestionsvp3;

public class Q113 {
    public static void main(String[] args) {
        int wd=0;
        String days[]= {"sun","mon","wed", "sat"};
        for(String s:days){
            switch (s){
                case "sat":
                case "sun":
                    wd-=1;
                    break;
                case "mon":
                    wd++; // wd burada 1 oldu
                case "wed":
                    wd+=2; // wd  2 oldu
            }
        }
        System.out.println(wd);  // 3 oldu
    }
}
