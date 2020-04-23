package elevenabstractpackage;

public class WorkStationTest {
    public static void main(String[] args) {
        String mainboard[]={"intel", "3000", "128"};
        WorkStation myWork= new WorkStation(mainboard, 65, 2600, "intel", "maxi", 42);
        myWork.setMainBoard();
        myWork.installMemory(65);
        myWork.installCPU();
        DellWorkStation myDell= new DellWorkStation(mainboard, 128, 2500, "intel", "tower", 29);
        myDell.installDellSoftware();
    }
}
