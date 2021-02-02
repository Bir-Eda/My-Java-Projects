package interview_questions.overloading_overriding;

import java.util.Arrays;

public class Orhan_Soru {

    public static void main(String[] args) {
        int[] number = {2, 7, 11, 15};
        int target = 9;
        int []indexArr = new int[2];
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length; j++) {
                if (number[i] + number[j] == target) {
                    indexArr[0] = i;
                    indexArr[1] = j;


                }

            }
        }
            System.out.println(Arrays.toString(indexArr));
        }
    }

