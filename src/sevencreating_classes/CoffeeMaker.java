package sevencreating_classes;

public class CoffeeMaker {
    private int quantity;
    private int timer;
    private boolean brew;

     public CoffeeMaker(int quantity) {
        this.quantity = quantity;
        this.timer = 0;
        this.brew = false;

    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTimer() {
        return timer;
    }

    public boolean isBrew() {
        return brew;
    }

    public void setBrew(boolean brew) {
        this.brew = brew;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }

    public void resetTimer() {
        this.timer=0;
    }
    public void brewCoffe(){
        if(this.timer==0){
            System.out.println("coffee started to brew");
        }
        else{
            System.out.println("Coffee will start to brew in"+this.timer+"minutes");
        }
}

    public void setTheTimer(int time){ //     "02/02 /02 " yeni bir deger atayacak
        String []arr=new String [3];
        int hour=Integer.parseInt(arr[0]);
        int min=Integer.parseInt(arr[1]);
        int sec=Integer.parseInt(arr[2]);
        if(hour>=0&& hour<24&&min>=0 && min<60 && sec<60 &&sec>=0){
            this.timer=timer;
        }
        else{
            System.out.println("out of time");
        }
    }

    @Override
    public String toString() {
        return "CoffeeMaker{" +
                "quantity=" + quantity +
                ", timer=" + timer +
                ", brew=" + brew +
                '}';
    }
}


