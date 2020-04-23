package tenpolymorphismpackage;

public class AttendanceTest {
    public static void main(String[] args) {
        String[] students = {"eda ", "esra ", "nil ", "sibel ", "Oya "};
        //String days[] = {"Mon", "Tes", "Wed", "Thu", "Fri"};
        //int[][] attendance = new int[5][5];
        //for (int i = 0; i < days.length; i++) {
           // System.out.print(days[i] + "\t\t");
           // for (int j = 0; j < students.length; j++) {
                //System.out.print(attendance[i][j] + "\t");
            //}
            //System.out.println();
        int [] ids = {1,2,3,4,5};
        Attendance myAtt = new Attendance(students,ids);
        myAtt.enterAttendanceToday("Tue");
        myAtt.enterAttendanceToday("mon");
        myAtt.printWeeklyAttendance();
        myAtt.findMostAttendance();
        myAtt.mostAttendanceDay();
        myAtt.printDailyAttendance("Fri");
        //myAtt.weekly[1][0]=0;
       // myAtt.printWeeklyAttendance();
    }

}