package ninepackageinheritance;

public class DepartmentSecondChild  extends DepartmentParent {
    private int yearsExperience;


    public DepartmentSecondChild(String emplyName, int emplID, String position, double salary, int years) {
        super(emplyName, emplID, position, salary);
        this.yearsExperience = years;

    }

    public void addYearsOfExperience(int years){
        this.yearsExperience = years;
    }

    @Override
    public String toString() {
        return "DepartmentSecondChild{" +
                "yearsExperience=" + yearsExperience +
                ", emplyName='" + emplyName + '\'' +
                ", emplID=" + emplID +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
