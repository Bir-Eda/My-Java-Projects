package tenpolymorphismpackage;
import java.util.Scanner;
public class DesignAttendanceCheckSystem {
    String studentsName;
    int strudentId;
    String weeklyVheckList;
    String daysOfTheWeek;

    public DesignAttendanceCheckSystem(String studentsName, int strudentId) {
        this.studentsName = studentsName;
        this.strudentId = strudentId;

    }

    public static void main(String[] args) {
        String[] student ={"eda", "esra", "nil", "sibel"};
        String[]days={"Monday","Tuesday", "Wednesday","Thursday","Friday"};
        int attendance [][]=new int [5][5];
        for (int i = 0; i < days.length; i++) {
            System.out.print(days[i]+"\t\t\t");
            for(int j=0; j<student.length; j++){
                System.out.print(attendance[i][j]+"\t");
            }
            System.out.println();

        }
    }
}
