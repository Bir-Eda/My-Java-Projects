package sevencreating_classes;

public class DimensionalArrayClass {
    int size;

   public DimensionalArrayClass(){
        this.size=5;
    }
    public DimensionalArrayClass(int size){
       this.size=size;
    }
    public int []returnArray(){
       int[]arr=new int[this.size];
       int i=2;
       for(int j=0; j<this.size; j++){
           arr[j]=i;
           i+=2;
       }
       return arr;
    }
    public void printOddIndexes(int arr[]){
        for(int i=0; i<arr.length;i++ ){
            if(i%2==1){
                System.out.print("i = "+i+"\t");
            }
        }

        }
    }