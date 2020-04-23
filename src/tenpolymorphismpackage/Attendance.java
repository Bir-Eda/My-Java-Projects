package tenpolymorphismpackage;

import java.util.Arrays;

public class Attendance {
    private String students[];
    private int studentID[];
    private int weekly[][];
    final String days[]={"Mon","Tue","Wed","Thu","Fri"};

    public Attendance(String students[], int studentID[]){
        this.students=students;
        this.studentID=studentID;
        int [][]weeklyEmpty=new int [5][students.length];
        this.weekly=weeklyEmpty;
    }
    public String []getStudents(){
        return this.students;
    }
    public int []getStudentID(){
        return this.studentID;
    }
    public int [][] getWeekly(){
        return this.weekly;
    }


    public void enterAttendanceToday(String today){
        if(today.equalsIgnoreCase("Mon")){
            for(int i=0; i<students.length; i++){
                this.weekly[0][i]=1;
            }
        }else if(today.equalsIgnoreCase("Tue")) {
            for (int i = 0; i < this.students.length; i++) {
                this.weekly[1][i] = 1;
            }
        }else if(today.equalsIgnoreCase("Wed")) {
            for (int i = 0; i < this.students.length; i++) {
                this.weekly[2][i] = 1;
            }
        }else if(today.equalsIgnoreCase("Thu")) {
            for (int i = 0; i < this.students.length; i++) {
                this.weekly[3][i] = 1;
            }
        }else if(today.equalsIgnoreCase("Fri")) {
            for (int i = 0; i < this.students.length; i++) {
                this.weekly[4][i] = 1;
            }
        }else{
            System.out.println("Wrong Day");
        }
    }
    public void printWeeklyAttendance() {
        System.out.print("\t\t\t");
        for (String student : this.students) {
            System.out.print(student + "\t\t");
        }
        System.out.println();
        for (int i = 0; i < this.days.length; i++) {
            System.out.print(this.days[i] + "\t\t\t");
            for (int j = 0; j < this.students.length; j++) {
                if (this.weekly[i][j] == 0) {
                    //System.out.print(this.weekly[i][j]+"\t\t\t");
                    System.out.print("Absent\t\t");
                } else {
                    System.out.print("Present\t\t");
                }
            }
            System.out.println();
        }
    }
    private int[] findMax(int []arr){
        int []result={0,0};
        int max=arr[0];
        int index=0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }

        }
        result[0]=max;
        result[1]= index;
        return result;
    }
    public void findMostAttendance() {
        int attendance[]=new int[this.students.length];
        int total=0;
        for(int i=0; i<this.weekly.length; i++){
            for(int j=0; j<this.weekly[i].length; j++){
                total+= this.weekly[j][i];
            }
            attendance[i]=total;
                }
        int result[]=findMax(attendance);
        System.out.println("***** The Most Attendance Student ***** "+"\n"+this.students[result[1]]+"="+result[0]);

    }
    public void mostAttendanceDay(){
        int mostAttendance[]=new int [this.days.length];
        int total=0;
        for(int i=0; i<this.weekly.length; i++){
            total=0;
            for(int j=0; j<this.weekly[i].length; j++){
               total+=this.weekly[i][j];

            }
            mostAttendance[i]=total;
        }
        int result[]={0,0};
        result =findMax(mostAttendance);
        System.out.println("*** The Most Attended Day***\n"+ this.days[result[1]]+"="+result [0]);
    }
    private void printDay(int index){
        for(int i=0; i<this.students.length; i++){
            System.out.print(this.weekly[index][i]+"\t\t");
        }
    }

    public void printDailyAttendance(String day) {
        for (String student : this.students) {
            System.out.print((student + "\t\t"));
        }
        System.out.println();
        if (day.equalsIgnoreCase("mon")) {
            System.out.print("Mon\t\t");
            this.printDay(0);
        } else if (day.equalsIgnoreCase("Tue")) {
            System.out.print("Tue\t\t");
            this.printDay(1);
        } else if (day.equalsIgnoreCase("Wed")) {
            System.out.print("Wed\t\t");
            this.printDay(2);
        } else if (day.equalsIgnoreCase("Thu")) {
            System.out.print("Thu\t\t");
            this.printDay(3);
        } else if(day.equalsIgnoreCase("Fri")){
            System.out.print("Fri\t\t");
            this.printDay(4);
        }
        else{
            System.out.println("Day is wrong");
        }

    }





        @Override
    public String toString() {
        return "Attendance{" +
                "students=" + Arrays.toString(students) +
                ", studentID=" + Arrays.toString(studentID) +
                ", weekly=" + Arrays.toString(weekly) +
                ", days=" + Arrays.toString(days) +
                '}';
    }
}
