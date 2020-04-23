package twelveinterfacepackage;

public class Fish extends Animal {
    private int sizelnFt;
    private boolean canEat;

    public Fish(int sizelnFt, boolean canEat) {
        this.sizelnFt = sizelnFt;
        this.canEat = canEat;
    }

    public int getSizelnFt() {
        return sizelnFt;
    }

    public void setSizelnFt(int sizelnFt) {
        this.sizelnFt = sizelnFt;
    }

    public boolean isCanEat() {
        return canEat;
    }

    public void setCanEat(boolean canEat) {
        this.canEat = canEat;
    }
    private void swim() {
        System.out.println("swim");

    }

    @Override
    public String toString() {
        return "Fish{" +
                "sizelnFt=" + sizelnFt +
                ", canEat=" + canEat +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
