package twelveinterfacepackage;

public class PlannerTest {
    public static void main(String[] args) {
        Planner myPlan=new Planner();
        //myPlan.displayPlanner();
        myPlan.addEvent("April 25", "Java String");
        //myPlan.displayPlanner();
        myPlan.addEvent("May 5", "Java Collection");
        //myPlan.displayPlanner();
        myPlan.addEvent("June 12", "Java Finish");
        myPlan.deleteEvent("May 12");
    }
}
