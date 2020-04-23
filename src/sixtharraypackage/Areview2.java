package sixtharraypackage;

public class Areview2 {
    public static void main(String[] args) {

        boolean ID=true; //eger id dogruysa it odasina girebilirsin
        boolean ITid=true;
        if(ID){
            System.out.println("welcome to building");

            if(ITid) {
                System.out.println("Welcom to IT room");
            }
            else{
                System.out.println("you can not enter IT Room");
            }
        }
        else{
            System.out.println("You can not enter the building");
        }
    }
}
