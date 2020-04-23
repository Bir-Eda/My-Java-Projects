package thirteenexceptionpackage;

public class FinallyExam {
    public static void main(String[] args) {
        String arr[]={"a4", "b723", null, "c", "fhgd", null, "hgftr"};
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i].length());
            }
        }
        catch(NullPointerException e){
            System.out.println("Ooops");
        }
        finally{
            System.out.println(arr[5].length());
        }
        System.out.println("----------------------");
        for(int i = 0; i < arr.length; i++){
            try{
                System.out.println(arr[i].length());
            }
            catch(NullPointerException e){
                System.out.println("Ooops");
            }
        }
    }

}
