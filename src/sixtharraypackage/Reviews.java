package sixtharraypackage;

public class Reviews {
    public static void main(String[] args) {
        doCalculation(5,8,"add");
    }
    public static void doCalculation(int a, int b, String add){
        if(add.equalsIgnoreCase("add")){
            System.out.println(a+b);
        }
        else if(add.equalsIgnoreCase("subst")){
            System.out.println(a-b);
        }
        else if(add.equalsIgnoreCase("divide")){
            System.out.println(a/b);

        }
        else{
            System.out.println("Wrong operation");

        }


    }
}
