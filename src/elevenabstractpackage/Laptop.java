package elevenabstractpackage;

public class Laptop implements Computers {
    protected String mainBoardSpeccs;
    protected int memorySize;
    protected int cpuSpeed;
    protected String cpuType;
    protected int batteryPercent;

    public Laptop(String mainBoardSpeccs, int memorySize, int cpuSpeed, String cpuType, int batteryPercent) {
        this.mainBoardSpeccs = mainBoardSpeccs;
        this.memorySize = memorySize;
        this.cpuSpeed = cpuSpeed;
        this.cpuType = cpuType;
        this.batteryPercent = batteryPercent;
    }

    public void setMainBoard(){
        if(this.mainBoardSpeccs.contains("instel")){
            System.out.println("Instel Mainboard is set");
        }else if(this.mainBoardSpeccs.contains("amd")){
            System.out.println("AMD mainBoard is set");
        }
        else{
            System.out.println("Unknown Mainboard");
        }

    }
    public void installCPU(){
        System.out.println(this.cpuType+" installed");
    }
    public void installMemory(int size){
        System.out.println(size+ " GB memory installed");
    }
    public void chargeBattery(){
        System.out.println("Battery charging");
        this.batteryPercent++;
    }
    public void setWireless(){
        System.out.println("Wireless connection s set");
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "mainBoardSpeccs='" + mainBoardSpeccs + '\'' +
                ", memorySize=" + memorySize +
                ", cpuSpeed=" + cpuSpeed +
                ", cpuType='" + cpuType + '\'' +
                ", batteryPercent=" + batteryPercent +
                '}';
    }
}
