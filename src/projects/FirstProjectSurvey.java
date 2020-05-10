package projects;

import java.util.List;

public class FirstProjectSurvey {
    public static void main(String[] args) {
        FirstProjectSurveyPreparing mySurvey= new FirstProjectSurveyPreparing();
        List<FirstProjectSurveyQuestions> survey=mySurvey.prepSurvey(3);
        mySurvey.startSurvey(survey);
    }
}
