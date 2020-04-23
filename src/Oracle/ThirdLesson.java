package Oracle;

public class ThirdLesson {
    public static void main(java.lang.String[] args) {
        int age=4;
        java.lang.String act="";
        if (age>25) {
            act = "Go to work";
        }else if(age>18){
            act="Go to collage";

        }else{
            act="Go to school";
        }
        System.out.println((act));
        // yukardaki gibi uzun uzun yazmak yerine bir satirda toplamak mumkun!!
        // ayni satira String ve integer birlikte yazilabilir.
    }// act=age>25 ? "Go to work": "Go to school";
    // act=age>25 ? "Go to work": 2;      // String ve Integer
    //act =age>25 ? "Go to work": age>18 ? "Go to college" : "Go to school";
}
