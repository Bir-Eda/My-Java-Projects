package codingbat;

public class Q2q11 {
    int j=10;

    public static void main(String[] args) {
        int j;
        if(new Q2q11().go(10))j=5;
        //System.out.print(j);
    }
    boolean go(int y){
        if(y>5)return true;
        else return false;
    }
}
