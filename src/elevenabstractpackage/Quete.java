package elevenabstractpackage;

 abstract class Quete {
    private String customerName;
    private int totalSquareFeet;
    private double price;
    Quete(){
        this.customerName="Eda";
        this.price=0;
        this.totalSquareFeet=0;

    }
    Quete(String customerName, int totalSquareFeet,double price){
        this.customerName=customerName;
        this.price=price;
        this.totalSquareFeet=totalSquareFeet;
    }
     abstract double calculateTotalPrice();
    abstract void printQuete();

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getTotalSquareFeet() {
        return totalSquareFeet;
    }

    public void setTotalSquareFeet(int totalSquareFeet) {
        this.totalSquareFeet = totalSquareFeet;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Quete{" +
                "customerName='" + customerName + '\'' +
                ", totalSquareFeet=" + totalSquareFeet +
                ", price=" + price +
                '}';
    }
}
