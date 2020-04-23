package Oracle;

public class Truck implements ForSale {
    private double stickerPrice;

    public Truck(double stickerPrice) {
        this.stickerPrice = stickerPrice;
    }

    public double getStickerPrice() {
        return stickerPrice;
    }
}