package projects;

public class PrimeNumbers {
    public static void main(String[] args) {
        int i=0;
        int num=0;
        String pNumbers=" ";
        for(i=1;i<=100;i++){
            int count=0;
            for(num=i;num>=1;num--){
                if(i%num==0){
                    count=count+1;
                }
            }
            if(count==2){
                pNumbers=pNumbers+i+" ";
            }
        }
        System.out.println(pNumbers);
    }
}
