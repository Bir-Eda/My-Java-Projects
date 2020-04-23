package sevencreating_classes;

public class DesignCar {
    private int modelYear;
    private int numberTicket;
    private int numberAccident;
    private double offer;
    final double basePrice=99.9;

    DesignCar(int modelYear, int numberTicket, int numberAccident) {
        this.modelYear = modelYear;
        this.numberTicket = numberTicket;
        this.numberAccident = numberAccident;
        this.offer =0;

    }
    public void setModelYear(int modelYear){
        this.modelYear=modelYear;
    }
    public int getModelYear(){
        return this.modelYear;
    }
    public void setNumberTicket(int numberTicket) {
        this.numberTicket=numberTicket;
    }
    public int getNumberTicket() {
        return this.numberTicket;
    }
    public void setNumberAccident(int numberAccident){
        this.numberAccident=numberAccident;
    }
    public int getNumberAccident(){
        return this.numberAccident;
    }
    public void setOffer(double price){
        this.offer=price;
    }
    public double getPriceOffer(){
        return this.offer;

    }
    public double makeOffer(int year){
        this.offer=this.basePrice+(year-this.modelYear)*50+(30*this.numberTicket)+(100*this.numberAccident);
        return this.offer;
    }

    @Override
    public String toString() {
        return "DesignCar{" +
                "modelYear=" + modelYear +
                ", numberTicket=" + numberTicket +
                ", numberAccident=" + numberAccident +
                ", priceOffer=" + offer +
                ", basePrice=" + basePrice +
                '}';
    }
}