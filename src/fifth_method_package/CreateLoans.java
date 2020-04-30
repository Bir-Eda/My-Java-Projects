package fifth_method_package;

public class CreateLoans {
    public static String loansInternet(int speed) {
        String usage = "";
        if (speed > 100) {
            usage = "Good Speed";
        } else if (speed > 300) {
            usage = "Super Speed";
        } else{
            usage = "wrong entry";
        }
        return usage;
    }

    public static void main(String[] args) {
        System.out.println(loansInternet(250));
    }
}
