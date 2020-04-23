package ninepackageinheritance;

public class RoadBike extends Bicycle {
    private int tireSize;
    private int handleBar;

    public RoadBike(int gear, int speed, int tireSize, int handleBar) {
        super(gear, speed);
        this.tireSize = tireSize;
        this.handleBar = handleBar;
    }

    // super ile diger classdaki attributtleri cagiriyoruz

    public int getTireSize() {
        return tireSize;
    }

    public void setTireSize(int tireSize) {
        this.tireSize = tireSize;
    }

    public int getHandleBar() {
        return handleBar;
    }

    public void setHandleBar(int handleBar) {
        this.handleBar = handleBar;
    }

    @Override
    public String toString() {
        return "RoadBike{" +
                "tireSize=" + tireSize +
                ", handleBar=" + handleBar +
                ", gear=" + gear +
                ", speed=" + speed +
                '}';
    }
}
