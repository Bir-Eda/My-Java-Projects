package ocaquestionsvp3;

public class Q108Employee {
    public int salary;

}
  class Manager extends Q108Employee{
    public int budget;
}
    class Director extends Manager {
       public int stockOptions;

       public static void main(String[] args) {
           Q108Employee employee = new Q108Employee();
           Q108Employee manager = new Manager();
           Manager manager1=new Manager();
           Q108Employee director = new Director();
           Director director1=new Director();
           Manager m = new Manager();

           director1.stockOptions=1000;
           director.salary = 15;
           manager.salary = 12;
             manager1.budget = 18;
           //  manager.stockOptions = 90;
           //  employee.budget = 45;
           director.salary = 29;
           employee.salary = 18;
           m.budget = 8;

       }
   }