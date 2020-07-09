package ocaquestionsvp3;

public class Q113 {
    public static void main(String[] args) {
        int wd=0;
        String days[]= {"sun","mon","wed", "sat"};
        for(String s:days){
            switch (s){  // once case e bak Stringse switcin icine bak oda Stringse hata yokdemektir
                case "sat": // case de siralama onemli degil
                case "sun":
                    wd-=1; // wd=wd-1= -1
                    break;  //
            //    case "fri":  arrayda olmayan birseyi de yazabilir ama okumaz
                case "mon":
                    wd++; // wd burada 0 oldu wd=wd+1= 0
                case "wed":
                    wd+=2; // wd  2 oldu // wed e geldigimizde wdnin degeri 2 idi ve bir tane daha iki ekledik

            }
        }
        System.out.println(wd);  // 3 oldu
    }
}
