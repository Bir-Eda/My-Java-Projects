package sixtharraypackage;

public class Create1010 {
    public static void main(String[] args) {
        tenByTen();
        sumRow();
    }
    public static void tenByTen(){
        int arr[][]=new int [10][10];
        int counter=1;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j]=counter;
                counter++;
            }
        }
        for(int i=0; i<arr.length; i++){
            for(int number:arr[i]){
                System.out.print("\t"+number);
            }
            System.out.println();
        }
        System.out.println("----------------------");
    }
    public static void sumRow(){
        int sum=0;
        int []number={1,2,3,4,5,6,7,8,9,10};
        for(int i=0; i<number.length; i++){
            sum+=number[i];
        }
        System.out.println(sum);
        System.out.println("-----------------------");
    }

}


