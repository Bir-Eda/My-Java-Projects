package sixtharraypackage;

public class FindMinValue {
    public static int minNumber(int arr[]){
        int min=arr[0];
        for(int i=0; i<arr.length;i++ ){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int a[]={3,6,8,15,2};
        System.out.println(minNumber(a));
    }

}
