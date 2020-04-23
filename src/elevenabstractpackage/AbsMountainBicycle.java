package elevenabstractpackage;

public class AbsMountainBicycle extends AbsBicycle {
    private String tireType;
    private int seatHeight;

    public AbsMountainBicycle(String tireType, int seatHeight){
        this.tireType = tireType;
        this.seatHeight = seatHeight;
    }

    public String getTireType() {
        return tireType;
    }

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }
    void speedUp(){
        System.out.println("Speed increased");
    }
    void slowDown(){
        System.out.println("Speed decreased");
    }
    void stop(){
        System.out.println("Mountain Bike stopped ");
    }
    void start(){
        System.out.println("Mountain Bike started");
    }
    void switchToSteepMode(){
        System.out.println("Steep mode activated");
    }

    @Override
    public String toString() {
        return "AbsMountainBicycle{" +
                "tireType='" + tireType + '\'' +
                ", seatHeight=" + seatHeight +
                '}';
    }
}
