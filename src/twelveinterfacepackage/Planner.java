package twelveinterfacepackage;

public class Planner {
    String plannerName;
    String[][] dateAndEvent;
    int index;
    int size;

    Planner() {
        this.plannerName = "Default";
        dateAndEvent = new String[10][2];
        this.index = 0;
        this.size=10;
        for(int i=0;i<this.dateAndEvent.length;i++) {
            this.dateAndEvent[i][0] = "Available";
            this.dateAndEvent[i][1] = "Available";
        }
        }

    Planner(String plannerName, int size) {
        this.plannerName = plannerName;
        this.dateAndEvent = new String[size][2];
        this.size = size;
        this.index = 0;
        for(int i=0;i<this.dateAndEvent.length;i++) {
            this.dateAndEvent[i][0] = " ";
            this.dateAndEvent[i][1] = " ";
        }

    }

      private void displayPlanner() {
        System.out.println("--Date--\t\t--Event--");
        for (String[] events : this.dateAndEvent) {
            System.out.println(events[0] + "\t\t" + events[1]);
        }
    }

    public void addEvent(String date, String event) {
        if (this.index < this.size) {
            this.dateAndEvent[this.index][0] = date;
            this.dateAndEvent[this.index][1] = event;
            this.index++;
        } else {
            System.out.println("Planner is full");
        }
        displayPlanner();
    }
    void deleteEvent(String date){
        for(int i=0;i<this.dateAndEvent.length; i++){
            if(!this.dateAndEvent[i][0].equalsIgnoreCase(date)){
                this.dateAndEvent[i][0]=" ";
                this.dateAndEvent[i][1]=" ";
            }
            else{
                System.out.println("Event can not fount");
            }
        }
        displayPlanner();
    }
}