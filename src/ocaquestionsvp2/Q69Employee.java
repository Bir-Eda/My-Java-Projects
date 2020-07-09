package ocaquestionsvp2;

public class Q69Employee {
      int age;
      String name;
     private int salary;


     public Q69Employee(int age, String name) {
          setAge(age);
          setName(name);
          setSalary(2000);
     }

     Q69Employee(int age, String name, int salary) {
          this.age = age;
          this.name = name;
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
