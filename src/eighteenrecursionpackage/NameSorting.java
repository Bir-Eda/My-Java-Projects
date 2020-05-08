package eighteenrecursionpackage;

import java.util.Comparator;

public class NameSorting implements Comparator<ComparatorInterface> { //<Obj name>
    public int compare(ComparatorInterface st1, ComparatorInterface st2) {
        return  st1.name.compareTo(st2.name);


        /*if(st1.name.charAt(0) == st2.name.charAt(0)){
            return 0;
        }
        else if(st1.name.charAt(0) > st2.name.charAt(0)){
            return 1;
        }
        else{
            return -1;
        } */
        }
    }


