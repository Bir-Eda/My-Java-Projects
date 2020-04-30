package seventeentreemappackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyArrayList {
    public static void main(String[] args) {
        String s = "java is java";
        System.out.println(Collections.frequency(new ArrayList<>(Arrays.asList(s.split(" "))),"java"));
    }
}
