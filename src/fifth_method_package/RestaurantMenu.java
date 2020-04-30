package fifth_method_package;

public class RestaurantMenu {
    public static void main(String[] args) {
        display();
        showMenu();
    }

    public static void display(){
        System.out.println("Menu\nSOUPS\n\t* Lentil\t$3.99\n\t* Tomato\t$4.99\n\t* Fish\t\t$8.99\nMEALS\n\t* Rice\t$3.99\n\t* Chicken\t$5.99\n\t* Beef\t$7.99\nSALADS\n\t* Ceaser\t$3.99\n\t* Waldorf\t$4.99");
    }
    public static void showMenu() {
        String menu = "Menu\n"
                + "------------------\n"
                + "   SOUPS\n "
                + "Lentil  $3.99\n"
                + "------------------\n";
        System.out.println(menu);
    }
}
