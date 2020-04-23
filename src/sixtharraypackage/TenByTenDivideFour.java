package sixtharraypackage;

public class TenByTenDivideFour {
    public static void main(String[] args) {
        int [][]numbers=TenByTenArr.generateArray(10);
        divideTenByTen(numbers);
    }
    public static void divideTenByTen(int [][]arr) {
        for(int[]row:arr){
            for(int number:row){
                if(number%4==0)
                    System.out.print("\t"+number);
                else
                    System.out.print("\t -");
            }
            System.out.println();
        }
    }
}
