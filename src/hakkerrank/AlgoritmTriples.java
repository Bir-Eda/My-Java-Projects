package hakkerrank;

public class AlgoritmTriples {
    public static void main(String[] args) {
        int a[]={1,2,3};
        int b[]={3,2,1};
        System.out.println(compare(a, b));
    }
    public static int[] compare(int[]a, int[]b){
        int []alice=new int[3];
        int []bob=new int[3];
        for(int i=0; i<a.length; i++) {
            if (a[i] > b[i]) {
                alice[i] = 1;
            } else if (a[i] < b[i]) {
                bob[i] = 1;
            } else if (a[i] == b[i]) {
                alice[i] = 0;
                bob[i] = 0;
            }
        }
        int score1 = 0;
        for (int scoreAlice : alice) {
            score1 += scoreAlice;
        }
        int score2 = 0;
        for (int scoreBob : bob) {
            score2 += scoreBob;
        }

        int[] result = {score1, score2};
        return result;
    }
}
