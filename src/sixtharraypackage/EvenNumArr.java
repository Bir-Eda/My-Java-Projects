package sixtharraypackage;

public class EvenNumArr {
    public static void main(String[] args) {
        int even=0;
        int []num={1,2,3,4,5,6,7,8,9};
        for(int i=0; i<num.length; i++){

            if( num[i]<5){
                System.out.print(num[i]);
            }
        }
        for (int k=0; k<num.length; k++){
            if (num[k]>=5 && num[k]<=9){
                System.out.println(num[k]);

            }
        }
    }
}
