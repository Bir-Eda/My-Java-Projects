package ocaquestionsvp2;

public class Q64 {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");

          if(arr[i].equals("C")){
              continue;
          }
           // System.out.println(arr[i]);
          System.out.println("Work done");
          break;  // breakten sonra donguye girmeyecek dolayisiyla sadece A yi yazip bitiracek
        }
    }
}
