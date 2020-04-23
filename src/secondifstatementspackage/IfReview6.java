package secondifstatementspackage;

public class IfReview6 {
    public static void main(String[] args) {
        boolean roadTest=true; //"No" olursa sonuc do not buy, "Yes" olursa sonuc buy
        boolean millage= true;
        boolean age= true;
        if(roadTest){
            if (millage) {
                if(age){
                    System.out.println("buy");
                }
                else{
                    System.out.println("Do not buy");
                }
            }
            else{
                System.out.println("buy");
            }
        } else{
            System.out.println("Do not buy");
        }

    }
}
