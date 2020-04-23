package ninepackageinheritance;

public class DesignPaintParent {
   protected String colorName;
    protected double sqrFeet;
    protected double totalPrice;

    public DesignPaintParent(String colorName, double sqrfeet, double totalPrice) {
        this.colorName = colorName;
        this.sqrFeet = sqrfeet;
        this.totalPrice = 0;
    }
    public double calculatePrice(){
        return (this.sqrFeet/100)*32.99;
        //double totalPrice=this.sgrFeet/100*32.99;  bu sekilde de yazilabilir
        //this.totalPrice=totalPrice;
        //return totalPrice;
    }
    //public void toPaint() {     // void olarak bu sekilde de yazilabilir
        //this.totalPrice = this.sqrFeet / 100 * 3.99;
    //}
    @Override
    public String toString() {
        return "DesignPaintParent{" +
                "colorName='" + colorName + '\'' +
                ", sqrfeet=" + sqrFeet +
                ", totalPrice=" + totalPrice +
                '}';
    }
}

