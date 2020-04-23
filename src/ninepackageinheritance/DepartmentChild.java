package ninepackageinheritance;

public class DepartmentChild extends DepartmentParent{
    private String skillSet;

    public DepartmentChild(String emplyName, int emplID, String position, double salary, String skillSet) {
        super(emplyName, emplID, position, salary);
        this.skillSet = skillSet;

    }
    public DepartmentChild(){  // parent kisminda sonradan eklenen bolumu yazdiktan sonra ekledik
        super();
        this.skillSet="Java";
    }

    public String getSkillSet() {
        return skillSet;
    }

    public void setSkillSet(String skillSet) {
        this.skillSet = skillSet;
    }

    public int addSkill(int pointExam){
        int point=500;
        point=pointExam;
        return point;
    }
    // public void setSkillSet(String skill){
    //this.skillSet= skillSet;}
    public int experience(int yearExperience){
        int year=8;
        year=yearExperience;
        return year;
    }

    @Override
    public String toString() {
        return "DepartmentChild{" +
                "skillSet='" + skillSet + '\'' +
                ", emplyName='" + emplyName + '\'' +
                ", emplID=" + emplID +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}

