package interview_questions.overloading_overriding;

import java.util.Arrays;

public class Triplets {
    public static void main(String[] args) {
        int []number={-1,0,1,2,-1,-4};
       // int target=0;
        for (int i = 0; i <number.length-2 ; i++) {
            for (int j = i+1; j <number.length-1 ; j++) {
                for (int k = j+1; k <number.length ; k++) {
                    if(number[i]+number[j]+number[k]==0){
                        System.out.println(number[i]+" " +number[j]+" "+number[k]);

                    }
                }

            }

        }
        //System.out.println(Arrays.toString(indexArr));
    }
}
