package twelveinterfacepackage;

public class ExpoPlannerTest {
    public static void main(String[] args) {
        ExpoPlanner myExpo=new ExpoPlanner();
        myExpo.listAll();
        myExpo.addEvent("May 30", "Java Presentation");
        myExpo.listAll();
        myExpo.deleteEvent("May 29th");
        String[]checkList={"A","B","C","D","E","F","G"};
        myExpo.modifyCheckList("May 29th", checkList);
        myExpo.listAll();
    }
}
