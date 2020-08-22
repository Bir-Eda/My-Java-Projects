package ocaquestionsvp3;

public class Q114 {
    public static void main(String[] args) {
         int numbers[];  // object olunca (Wrapper clasa object denir verilmeyen indexleri jvm null olarak atar ve nullpointerexception verir)
        numbers =new int[2];
        numbers[0]=10;
        numbers[1]=20;

        numbers =new int[4]; // yeni bir array creat ettigi icin numbers[0] ve numbers[1] i 0 basacak

      //  numbers[0]=null;
       // numbers[1]=null;
        numbers[2]=30;
        numbers[3]=40;
        for(int x:numbers){
            System.out.println(" "+x);
        }
    }

}
