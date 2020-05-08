package eighteenrecursionpackage;

import java.util.Comparator;

public class AgeSorting implements Comparator<ComparatorInterface> {
    public int compare(ComparatorInterface st1, ComparatorInterface st2){
        if(st1.age==st2.age){
            return 0;
        }
        else if(st1.age>st2.age){
            return 1;
        }
        else{
            return -1;
        }
    }


}
