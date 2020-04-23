package secondifstatementspackage;

public class IfReviewSwitch {
    public static void main(String[] args) {
        String place="America";
        place=place.toLowerCase();
        switch(place){
            case"europa":
                System.out.println("A");
                break;
            case"africa":
                System.out.println("B");
                break;

            case"Asia:":
                System.out.println("C");
                break;
            case "america":
                System.out.println("D");
                break;
            default:
                System.out.println("other gate");
        }

    }
}
