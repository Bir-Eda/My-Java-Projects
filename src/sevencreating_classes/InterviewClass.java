package sevencreating_classes;

public class InterviewClass {
    private String canName;
    private int canScore;
    private String finalDecision;
    private int point;
    private int SQLpoint;
    private int softSkillsPoint;

    InterviewClass(String name, int score, String decision, int point, int SQLpoint, int softSkillsPoint) {
        this.canName = name;
        this.canScore = score;
        this.finalDecision = decision;
        this.point = point;
        this.SQLpoint = SQLpoint;
        this.softSkillsPoint = softSkillsPoint;
    }

    public String getCanName() {
        return canName;
    }

    public void setCanName(String canName) {
        this.canName = canName;
    }

    public int getCanScore() {
        return canScore;
    }

    public void setCanScore(int canScore) {
        this.canScore = canScore;
    }

    public String getDecision() {
        return finalDecision;
    }

    public void setDecision(String decision) {
        this.finalDecision = decision;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getSQLpoint() {
        return SQLpoint;
    }

    public void setSQLpoint(int SQLpoint) {
        this.SQLpoint = SQLpoint;
    }

    public int getSoftSkillsPoint() {
        return softSkillsPoint;
    }

    public void setSoftSkillsPoint(int softSkillsPoint) {
        this.softSkillsPoint = softSkillsPoint;
    }

    public double calculateScore(){
        this.canScore=this.point+this.softSkillsPoint+this.SQLpoint;
        return this.canScore;
    }
    public String decision() {
        if (this.canScore > 100) {
            return finalDecision="Congrate";
        } else {
            this.finalDecision="Try again";

        }
        return finalDecision;
    }


    @Override
    public String toString() {
        return "InterviewClass{" +
                "canName='" + canName + '\'' +
                ", canScore=" + canScore +
                ", decision='" + finalDecision + '\'' +
                ", point=" + point +
                ", SQLpoint=" + SQLpoint +
                ", softSkillsPoint=" + softSkillsPoint +
                '}';
    }
}


