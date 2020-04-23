package twelveinterfacepackage;

public class Duck extends Animal {
    String beakColor;

    public Duck(String beakColor) {
        this.beakColor = beakColor;
    }

    public String getBeakColor() {
        return beakColor;
    }

    public void setBeakColor(String beakColor) {
        this.beakColor = beakColor;
    }
    public void swim(){
        System.out.println("swim");
    }
    public void quack(){
        System.out.println("quack");
    }


    @Override
    public String toString() {
        return "Duck{" +
                "beakColor='" + beakColor + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
