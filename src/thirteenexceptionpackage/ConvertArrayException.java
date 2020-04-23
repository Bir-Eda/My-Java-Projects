package thirteenexceptionpackage;

public class ConvertArrayException {
    public static void main(String[] args) {
        try{
            int arr[][]={{1,2,3,4}, {5,5,6},{7,8} };
            int arr1[][]= new int [arr.length][arr[0].length];
            for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr[0].length; j++){
                    arr1[i][j]=arr[j][i];
                }
            }
        }
        catch(Exception e){
            System.out.println("Ok");
        }
        finally{
            System.out.println("Hello World");
        }
    }

}
