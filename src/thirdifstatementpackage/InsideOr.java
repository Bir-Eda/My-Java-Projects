package thirdifstatementpackage;

public class InsideOr {
    public static void main(String[] args) {
        int n1 = 12;
        int n2 = 15;
        int n3 = 44;
        if (n1 > 20 || (n2 < n3 && (n1 + n3 > 0))) {
            System.out.println("Inside if");
        } else {
            System.out.println("insede else");
        }

    }
}
