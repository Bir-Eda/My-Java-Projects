package sevencreating_classes;

public class Denemeler {

    private int cupsQuantity;
    private int timer;

    public Denemeler(int cupsQuantity) {
        this.cupsQuantity = cupsQuantity;
        this.timer = timer;
    }

    public int getCupsQuantity() {
        return cupsQuantity;
    }

    public void setCupsQuantity(int cupsQuantity) {
        this.cupsQuantity = cupsQuantity;
    }

    public int getTimer() {
        return timer;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }
    public void resetTimer(){
        this.timer=0;
    }

    public void setTheTimer(int time) {
        int second=0;
        if(second==180){
            System.out.println("coffy is ready");
        }else{
            System.out.println("Coffe is not ready");
        }
    }
    // String []arr=new String [3];
    //int hour=Integer.parseInt(arr[0]);
   // int min=Integer.parseInt(arr[1]);
   // int sec=Integer.parseInt(arr[2]);
       // if(hour>=0&& hour<24&&min>=0 && min<60 && sec<60 &&sec>=0){
        //this.timer=timer;
   // }
       // else{
       // System.out.println("out of time");
    //}

    @Override
    public String toString() {
        return "Denemeler{" +
                "cupsQuantity=" + cupsQuantity +
                ", timer=" + timer +
                '}';
    }
}
