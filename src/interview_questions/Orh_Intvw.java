package interview_questions;

public class Orh_Intvw {
    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 9, 45};
       // System.out.println(solution(3, 7, 8, arr));
    }
            int solution(int X, int Y, int[] A) {
                int N = A.length;
                int result = -1;
                int nX = 0;
                int nY = 0;
                for (int i = 0; i < N; i++) {
                    if (A[i] == X)
                        nX ++;
                    else if (A[i] == Y)
                        nY ++;
                    if (nX == nY)
                        result = i;
                }
                return result;
            }
        }


