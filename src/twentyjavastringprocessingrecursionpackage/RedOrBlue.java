package twentyjavastringprocessingrecursionpackage;

public class RedOrBlue {
    public static void main(String[] args) {
        red("redxx");
        red("xxred");
        red("blueTimes");
    }
        public static void red(String str){
        int len=str.length();
        if(len>=4){
            if(str.substring(0,4).equals("blue")){
                System.out.println("blue");
            }
            else if(str.substring(0,3).equals("red")){
                System.out.println("red");
            }
            else{
                System.out.println("");
            }
        }
        else if(len == 3)
        {
            if(str.substring(0, 3).equals("red"))
                System.out.println("red");
            else
                System.out.println("");
        }
        else
            System.out.println("");
    }
}
