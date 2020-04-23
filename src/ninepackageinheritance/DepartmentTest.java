package ninepackageinheritance;

public class DepartmentTest {
    public static void main(String[] args) {
        DepartmentParent myParent = new DepartmentParent("Eda", 123, "BA", 120000);
        System.out.println(myParent.toString());
        DepartmentChild myChild= new DepartmentChild("Eda", 100, "Testing", 120000, "Good");
        System.out.println(myChild.toString());
        //myChild.addSkill("SQL");
        System.out.println(myChild.toString());
        DepartmentSecondChild mySecond= new DepartmentSecondChild("Eda", 1345, "Developer", 140000, 10);
        System.out.println(mySecond.toString());
        mySecond.addYearsOfExperience(2);
        System.out.println(mySecond.toString());

    }

}
