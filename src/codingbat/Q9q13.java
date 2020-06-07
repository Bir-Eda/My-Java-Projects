package codingbat;

public class Q9q13 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Sum");
        int x=sb.capacity();  //19
        sb.trimToSize(); // 3  kelimenin orjinal size i

        int y=sb.capacity(); // 19
      //  System.out.println(x+y); //19+3

  // valid String instance
       String s= new String();
        String s2= new String(new byte[]{67,68});
        String s3= new String(new char[]{67, 68,69});

        String s4= new String(new StringBuilder("ABCD"));
       // System.out.println(s);
        System.out.println(s2);
        System.out.println(s3);
        //System.out.println(s4);
    }
}
