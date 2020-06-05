package OracleExample;

public class Break {
    public static void main(String[] args) {
        int i=0;
        while(i<20){
            if(i==8){
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}
