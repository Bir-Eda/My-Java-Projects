package Edabit;

public class MaxMod5 {
    public static void main(String[] args) {
        System.out.println(main(14,45));
    }
    public static int main(int a, int b) {
        if(a==b){
            return 0;
        }
        if(a%5==b%5){
            return Math.min(a,b);
        }
        return Math.max(a,b);

    }
}
