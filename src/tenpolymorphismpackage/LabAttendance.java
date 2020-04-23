package tenpolymorphismpackage;

public class LabAttendance extends Attendance {
    private String[] labSubjects;
    private int[][] labGrade;

    public LabAttendance(String[] students, int[] studentID, String[] labSubjects) {
        super(students, studentID);
        this.labSubjects = labSubjects;
        int[][] grade = new int[this.labSubjects.length][super.getStudents().length];
        this.labGrade = grade;
    }

    public String[] getLabSubjects() {
        return this.labSubjects;
    }

    public int findIndex(String subject) {
        int index = 0;
        for (int i = 0; i < this.labSubjects.length; i++) {
            if (this.labSubjects[i].equalsIgnoreCase(subject)) {
                index = i;
            }
        }
        return index;
    }

    public void enterGrades(String subject, int[] grade) {
        int index = this.findIndex(subject);
        this.labGrade[index] = grade;
    }

    public void printAllGrades() {
        System.out.println("\t\t\t");
        for (String student : super.getStudents()) {
            System.out.format("%10s",student);
        }
        System.out.println();
        for (int i = 0; i < this.labSubjects.length; i++) {
            System.out.format("%15s", this.labSubjects[i]);
            for (int j = 0; j < super.getStudents().length; j++) {
                System.out.format("%7d", this.labGrade[i][j]);
            }
            System.out.println();

        }
    }
    public void printAttendanceGrades(){
        super.printWeeklyAttendance();
        this.printAllGrades();
    }
}
