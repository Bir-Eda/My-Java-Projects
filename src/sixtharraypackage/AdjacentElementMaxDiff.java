package sixtharraypackage;

public class AdjacentElementMaxDiff {
    public static void main(String[] args) {
        int[]myNumbers={2,7,4,13};
        printMaxDiff(myNumbers);
    }
    public static void printMaxDiff(int []arr){
        int diffs[]= new int [arr.length];

        for(int i=1; i<arr.length; i++){
            diffs[i]=Math.abs(arr[i]-arr[i-1]); // Math abs eksi sayiyi arti yapar
        }
        // now it is time to find the max value of the one dimensional array
        int max=diffs[0];
        int i=0;
        int index=0;         //?????????????????
        for(int number:diffs){
            if(number>max){
                max=number;
                index++;
            }
            i++;
        }
        System.out.println("Max difference is :"+max+" and indexex are :"+(index-1)+" "+index);

    }

}
