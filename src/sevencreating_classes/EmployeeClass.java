package sevencreating_classes;

public class EmployeeClass {
    //Attribute declaration
    int empId;
    String empName;
    String empDepartment;
    double empSalary;
    String empContType;
    // Constructor without parameter
    public EmployeeClass(){
        int empId=12345;  // this.empId = 12345;  de yazabilirsin
        String empName="Hey";  // this.empDepartment=
        String empDepartment="School";
        double empSalary=8654;
        String empContType="Full time";
    }
    // Constuctor with parameter. We are overloading the constuctor
    EmployeeClass(int id, String name,String department, double salary,
                  String type){
        this.empId=id;
        this.empName=name;
        this.empDepartment=department;
        this.empSalary= salary;
        this.empContType=type;
    }  // Create method
    public double calculateWeeklyPayment(){  // public void calculate..(double hourly){
        double weekly= this.empSalary/52;
        return weekly;
    }
    public double calculateBiWeeklyPayment(){
        double biWeekly= this.empSalary/26;
        return biWeekly;
    }
    @Override
    public String toString() {
        return "EmployeeClass{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empDepartment='" + empDepartment + '\'' +
                ", empSalary=" + empSalary +
                ", empContType='" + empContType + '\'' +
                '}';
    }
    /*
    public void weeklyPayment (){
    System.out.println(this.salary/52);
}
    public void biWeeklyPayment (){
    System.out.println(this.salary/26);
}
    public void employeeInfo (){
    System.out.println("employee id:  "+employeeId);
    System.out.println("employee name:  "+ employeeName);
    System.out.println("employee department:  "+employeeDepartment);
    System.out.println("employee salary:  "+salary);
    System.out.println("employee contract type:  "+contractType);
}
     */
}







