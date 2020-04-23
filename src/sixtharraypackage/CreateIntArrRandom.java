package sixtharraypackage;

public class CreateIntArrRandom {
    public static void random(int n){
    int arr[]=new int[n];
    for(int i=0; i<n; i++){
        arr[i]= (int)(Math.random()*4000+1000);
        System.out.println(arr[i]);
        //if(i!=n-1){

    }
}
    // }

    public static void main(String[] args) {
        random(5);
    }
}
