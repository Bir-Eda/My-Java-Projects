package interview_questions;

public class Second_Orhan {

    public static int solution(String S) {
        int fb=0,fa = 0, fl=0, fo =0, fn =0;
        boolean flag = false;
        for(int i = 0 ; i<S.length();i++)
        {
            char ch = S.charAt(i);
            if(ch == 'B')
                fb++;
            else
            if(ch == 'A')
                fa++;
            else
            if(ch == 'L')
                fl++;
            else
            if(ch == 'O')
                fo++;
            else
            if(ch == 'N')
                fn++;
            if(fb >= 1 && fa >= 1 && fl >= 2 && fo >= 2 && fn >= 1)
            {
                flag = true;
            }
        }
        int ways = 0;
        while(true)
        {
            if(fb >= 1 && fa >= 1 && fl >= 2 && fo >= 2 && fn >= 1)
            {
                ways++;
                fb--;
                fa--;
                fl-=2;
                fo-=2;
                fn--;
            }
            else
                break;
        }
        return ways;
    }
    public static void main(String[] args) {
        System.out.println("1) BANBXXOLL : " + solution("BAONXXOLL"));
        System.out.println("2) BAOOLLNNOLOLGBAX : " + solution("BAOOLLNNOLOLGBAX"));
        System.out.println("3) QAWABAWONL : " + solution("QAWABAWONL"));
        System.out.println("4) ONLABLABLOON : "+ solution("ONLABLABLOON"));
        System.out.println("%) BALLOONBALLOONBALLOON : "+ solution("BALLOONBALLOONBALLOON"));
    }
}
