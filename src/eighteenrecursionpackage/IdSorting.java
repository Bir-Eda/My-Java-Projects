package eighteenrecursionpackage;

import java.util.Comparator;

public class IdSorting implements Comparator<ComparatorInterface> {
    public int compare(ComparatorInterface st1, ComparatorInterface st2){
        if(st1.id==st2.id){
            return 0;
        }
        else if(st1.id>st2.id){
            return 1;
        }
        else {
            return -1;
        }
    }

}
