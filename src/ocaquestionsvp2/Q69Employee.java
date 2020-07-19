package ocaquestionsvp2;
public class Q69Employee {
     private  String name;
     private   int age;
     private int salary;

     public Q69Employee(){
     }
     public Q69Employee(String name,int age) {

             setName(name);
           setAge(age);
              setSalary(2000);
     }

     Q69Employee(String name,int age, int salary) {
          this(name,age);
          //this.age = age;
         // this.name = name;
          setSalary(salary);
     }
     public int getAge() {
          return age;
     }
     public void setAge(int age) {
          this.age = age;
     }
     public String getName() {
          return name;
     }
     public void setName(String name) {
          this.name = name;
     }
     public int getSalary() {
          return salary;
     }
     public void setSalary(int salary) {
          this.salary = salary;
     }
     public void printDetails(){
          System.out.println(name+":"+age+":"+salary);
     }
}
class Q69EmployeeTest {

     public static void main(String[] args) {
          Q69Employee e1=new Q69Employee();
          Q69Employee e2=new Q69Employee("Jack", 50);
          Q69Employee e3=new Q69Employee( "Chloe", 40, 500 );

          e1.printDetails();
          e2.printDetails();
          e3.printDetails();
     }
}

