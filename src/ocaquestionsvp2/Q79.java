package ocaquestionsvp2;

public class Q79 {
    public static void main(String[] args) {
        String []arr={"A","B","C","D"};
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
            if(arr[i].equals("A")){
                System.out.println("Work");
                break;
            }
            continue;
        }
    }
}
