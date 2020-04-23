package sevencreating_classes;

public class EmployeeClassTest {
    public static void main(String[] args) {
    EmployeeClass Eda= new EmployeeClass(12344, "Name", "School", 8540, "Teacher");
        System.out.println(Eda.calculateWeeklyPayment());
        System.out.println(Eda.calculateBiWeeklyPayment());
        System.out.println(Eda.toString());
        EmployeeClass birsen= new EmployeeClass(8885, "birsen","IT", 10000, "Boss");
        System.out.println(birsen.toString());
        System.out.println(birsen.calculateBiWeeklyPayment());
}
}