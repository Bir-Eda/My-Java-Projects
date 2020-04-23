package sixtharraypackage;

public class FindMaxValue {
    public static int maxNumber(int array[]){
        int max=array[0];
        for(int i=0; i<array.length;i++ ){
            if(array[i]>max){  // ?
                max=array[i];   //  ?
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int a[]={1,3,581,8,15};
        System.out.println(maxNumber(a));
    }
}
