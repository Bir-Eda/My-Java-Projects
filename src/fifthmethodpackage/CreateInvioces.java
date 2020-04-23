package fifthmethodpackage;

public class CreateInvioces {
    public static String invoices(int consumption) {
        String decision = "";
        if (consumption > 500 && consumption <= 1000) {
            decision = "Good job";

        } else if (consumption > 1000 && consumption <= 1500) {
            decision = "Not Bad";

        } else if (consumption > 1500) {
            decision = "Star saving Enerjy";

        } else {
            decision = "Consumption is wrong";
        }

        return decision;
    }

    public static void main(String[] args) {
        System.out.println(invoices(1190));
        //return oldugunda sout ile sen yazdiricaksin
    }
}
