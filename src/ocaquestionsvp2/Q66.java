package ocaquestionsvp2;

public class Q66 {

    static int count = 0; // static her zaman en son degeri ne ise onu yazar
    int i = 0;  // instans variable
    public void changeCount(){
            while (i < 5) {
                i++;
                count++;  // i her attiginda count da bir artacak, ama count static oldugu icin i 5 oldugunda countta 5 olacak .
           // check 2 objecti ile i tekrar 0 dan baslayip arttiginda count static oldugu icin 5 ten itibaren artmaya baslayacak
            }
        }


    public static void main(String[] args) {
        Q66 check1=new Q66();
        Q66 check2=new Q66();  //
        Q66 check3=new Q66();

        check1.changeCount();
       // System.out.println(check1.i);
        check2.changeCount();
        //System.out.println(check2.i);
        //check3.changeCount();
       // System.out.println(check1.count+":"+check2.count+":"+check3.count+":"+check3.i);

    System.out.println(count);
       // System.out.println(check2.count+":"+check2.count);

    }
}