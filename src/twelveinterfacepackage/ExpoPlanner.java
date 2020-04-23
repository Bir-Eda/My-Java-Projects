package twelveinterfacepackage;

public class ExpoPlanner extends Planner {
     String expoName;
     String[] []checkList;

     ExpoPlanner(){
    super();
        this.expoName = "Default";
        this.checkList = new String[10][4];
    }
    public void listAll(){
        System.out.println("Date\t\tEvent\t\t\tCheck List");
         for(int i=0; i<super.dateAndEvent.length; i++){
             System.out.print(super.dateAndEvent[i][0]+"\t\t"+super.dateAndEvent[i][1]+"\t");
             for(int j=0; j<this.checkList[i].length; j++){
                 System.out.print(this.checkList[i][j]+"\t");
             }
             System.out.println();
         }
    }
    void modifyCheckList(String date, String checkList[]){
         int index0;
         for(int i=0; i<super.dateAndEvent.length; i++){
             if(super.dateAndEvent[i][0].equalsIgnoreCase(date)){
                 index=i;
             }
         }
         this.checkList[index]=checkList;


        }
    }
