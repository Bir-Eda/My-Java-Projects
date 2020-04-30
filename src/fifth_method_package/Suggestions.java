package fifth_method_package;

public class Suggestions {
    public static void main(String[] args) {
        pickMeFoodRandom();
    }
    public static void pickMeFoodRandom(){
        int choice=(int)(Math.random()*3)+1;
        if(choice==1){
            System.out.println("Drink soup");
        }
        if(choice==2){
            System.out.println("Eat Hamburger");
        }
        if(choice==3){
            System.out.println("Enjoy salad");
        }
    }
}
