package sixtharraypackage;

public class DenemeNumberOfElement {
    public static void main(String[] args) {
        String[] arr = {"ad", "kal", "sal", "asdl", "oledughsb"};
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() < 4) {
                counter++;
                System.out.println(arr[i]);
            }
        }
        System.out.println(counter); // kactane 4 ten kucuk eleman oldugunu yazar


    }
}
