package ninepackageinheritance;

public class DesignCustomPaintChild extends DesignPaintParent {
    private String paintGloss;
    private String paintDurability;


    public DesignCustomPaintChild(String colorName, double sqrfeet, double totalPrice, String paintGloss, String paintDurability) {
        super(colorName, sqrfeet, totalPrice);
        this.paintGloss = paintGloss;
        this.paintDurability = paintDurability;
    }

    public void changeGloss(String newGloss){
        this.paintGloss=newGloss;

    }
    public void changeDurability(String newPaintDurability){
        this.paintDurability=newPaintDurability;
    }

    double calculatePrice(double price) {
        double priceGallon = 32.99;
        if (this.paintGloss.equalsIgnoreCase("Glossy")){
        priceGallon += 2;

    }
    else if(this.paintGloss.equalsIgnoreCase(("extra glossy"))){
        priceGallon+=3;
    }
    else{
            System.out.println("Not proper value");
        }
    if(this.paintDurability.equalsIgnoreCase("durable")){
        priceGallon+=2;
    }
    else if(this.paintDurability.equalsIgnoreCase("super durable")){
        priceGallon+=3;
    }
    super.totalPrice=super.sqrFeet/100*priceGallon;
        return super.totalPrice;


    }

}

