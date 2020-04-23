package ninepackageinheritance;

public class DepartmentParent {
    protected String emplyName;
    protected int emplID;
    protected String position;
    protected double salary;

    public DepartmentParent(String emplyName, int emplID, String position, double salary) {
        this.emplyName = emplyName;
        this.emplID = emplID;
        this.position = position;
        this.salary = salary;
    }
    DepartmentParent(){  // bu bolum sonradan eklendi
        this.emplyName="Temp";
        this.emplID=999;
        this.position="intern";
        this.salary=1000;
    }


    public void changePosition( String changePosition){
        this.position=changePosition;
    }

    public double riseSalary (double newSalary) {
        this.salary = newSalary;
        return salary;
    }


    @Override
    public String toString() {
        return "Department{" +
                "emplyName='" + emplyName + '\'' +
                ", emplID=" + emplID +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
