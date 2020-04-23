package Oracle;

public class Part implements ForSale {
    private double stickerPrice;

    public Part(double stickerPrice) {
        this.stickerPrice = stickerPrice;
    }

    public double getStickerPrice() {
        return stickerPrice;
    }
}

