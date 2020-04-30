package fifth_method_package;

public class CreateMenu {
    public static void choosing (){
        int chose;
        chose= ((int)(Math.random()*4));
        switch(chose){
            case 0:
                System.out.println("Doner");
                break;
            case 1:
                System.out.println("Kebap");
                break;
            case 2:
                System.out.println("Beyti");
                break;
            case 3:
                System.out.println("Vejatable");
                break;
            case 4:
                System.out.println("Chicken");
                break;

            default:
        }
    }
    public static String choosing2(int choose) {
        String menu = "";
        if (choose == 0) {
            menu = "Doner";
        } else if (choose == 1) {
            menu = "Kebap";

        } else if (choose == 2) {
            menu = "Vejatable";

        } else if (choose == 3) {
            menu = "Beyti";

        } else {
            menu = "Chicken";
        }
        return menu;
    }
    public static void menu3(){
        for(int i=0; i<1;i++){
            System.out.println((int)Math.random()*5);
        }
    }

    public static void main(String[] args) {
        choosing();
        CreateMenu.choosing2(3);
        System.out.println((int) (Math.random() * 5));
        menu3();
    }
}
