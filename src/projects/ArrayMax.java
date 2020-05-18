package projects;

public class ArrayMax {
    public static void main(String[] args) {
        int [] arr={1,2,4,6,7};
        System.out.println(findMax(arr));
    }
    public static int findMax(int[]arr){
        int max=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}

/*
public static void main(String[] args) {
        int[] numArray={12,13,15};
        Arrays.sort(numArray);
        System.out.println(numArray[numArray.length-1]);
    }
 */
/*

 */