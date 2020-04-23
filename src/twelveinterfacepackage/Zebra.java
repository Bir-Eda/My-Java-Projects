package twelveinterfacepackage;

public class Zebra extends Animal {
    boolean isWild;

    public Zebra(boolean isWild) {
        this.isWild = isWild;
    }
    public void setWild(boolean wild){  // neden sadece set
        isWild=wild;
    }
    public void run(){
        System.out.println("run");
    }

    @Override
    public String toString() {
        return "Zebra{" +
                "isWild=" + isWild +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
