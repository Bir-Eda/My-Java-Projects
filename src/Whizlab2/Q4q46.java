package Whizlab2;

interface Q4q46 {
    static int range=12;

    public static double randomize(){
       int range=5;
        return range*2;

    }

    public static void main(String[] args) {
        Q4q46.randomize();  // metodu bu sekilde cagirabiliriz
       double x= Q4q46.range+7;
      //  System.out.println(Q4q46.randomize());
       // System.out.println(x);

        Float a=10/0f;
        System.out.println(a);
        Double d=3.0/0;
        System.out.println(d);
        //Integer i=2/0;
       // System.out.println(i);
        Long l=6/0l;
        System.out.println(l);





    }
}
