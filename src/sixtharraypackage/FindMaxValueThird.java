package sixtharraypackage;

public class FindMaxValueThird {
    static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arrayNumbers[]={1,356,32,76,5};
        System.out.println(findMax(arrayNumbers));
    }

}


        /*public static void main(String[] args) {
            int [] num ={1,5,8,10, 3, 19};
            int max=num[0];
            for(int n: num){
                max=n;
            }
            System.out.println(max);
        }*/


