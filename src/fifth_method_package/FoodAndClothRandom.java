package fifth_method_package;

public class FoodAndClothRandom {
    public static void clothCreate(){
        int x= (int)(Math.random()*3);
        switch (x){
            case 1:
                System.out.println("red shirt");
            case 2:
                System.out.println("blue jeans");
            case 3:
                System.out.println("white hat");
        }
    }
    public static void decideCloth(){
        int number=(int)(1+(Math.random()*3));
        if(number==1){
            System.out.println("Wear red shirt");
        }else if(number==2){
            System.out.println("Wear blue jean");
        }else if(number==3){
            System.out.println("Wear white hat");
        }else{
            System.out.println("not valid");
        }
    }

    public static void foodSug () {
        int x = (int) (Math.random() * 3);
        switch (x) {
            case 1:
                System.out.println("Drink Soup");
            case 2:
                System.out.println("Eat Hamburger");
            case 3:
                System.out.println("Enjoy Salad");
        }
    }

    public static void main (String[]args){
        clothCreate();
        foodSug();
        decideCloth();
    }
}
