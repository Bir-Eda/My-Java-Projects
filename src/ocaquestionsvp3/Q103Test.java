package ocaquestionsvp3;

public class Q103Test {
    public static void main(String[] args) {
      //  Student [] students=new Student[3];
        String [] students=new String[3];
        //students [0]=new Student("Ali");

//        students [1] =new Student("Richard");
//        students [2] =new Student("Donald");
       // students [3]=new Student("Veli");
        for(String s: students){
            System.out.println(""+s); // null uzerinde islem yapmaya calisiyoruz. java bunu algilamiyor
        }
    }
}
class Student{
    String name;

//    public Student() {
//
//    }

        public Student(String name){
        this.name=name;
    }

}