package sevencreating_classes;

public class BubbleAgain {
    public static void main(String[] args) {
        int temp;
        int n[]={6,1,9,4,5};
        for(int i=0; i<n.length-1; i++){
            for(int j=0; j<n.length-1;j++){
                if(n[i]>n[j]){
                    temp=n[i];
                    n[i]=n[j];
                    n[j]=temp;
                }
            }
            System.out.println(n[i]);
        }
    }
}
